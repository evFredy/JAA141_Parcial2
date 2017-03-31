/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gb090091_hs110065;

import Model.Actividad;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author FernandoJose
 */
public class ActividadesTableModel extends AbstractTableModel {
    private List<Actividad> Actividad;
    private String[] columnNames = {"Nombre", "Descripcion","Porcentaje"};
    public List<Actividad> getActividad() {
        return Actividad;
    }    

    public ActividadesTableModel() {
        Actividad = new ArrayList<Actividad>();
    }

    public ActividadesTableModel(List<Actividad> Actividad) {
        this.Actividad = Actividad;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    @Override
    public int getRowCount() {
        return Actividad.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = "??";
        Actividad Act = Actividad.get(rowIndex);
        switch (columnIndex) {
            case 0:
                value = Act.getNombre();
                break;
            case 1:
                value = Act.getDescripcion();
                break;
            case 2:
                value = Act.getPorcentaje();
                break;        
        }
        return value;
    }
    
    
    public void setValueAt(Object value, int row, int col) {
        Actividad act = Actividad.get(row);
        switch (col) {
            case 0:
                act.setNombre(value.toString());
                break;
            case 1:
                act.setDescripcion(value.toString());
                break;
            case 2:
                act.setPorcentaje((int) value);
                if (!value.toString().isEmpty()) {
                    
                    try{
                        int porcentaje = Integer.parseInt(value.toString());
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Debe ingresar un dato entero. ");
                    }
                }
                break;
        }
        fireTableCellUpdated(row, col);
    }
    
}

