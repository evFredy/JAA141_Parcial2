/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gb090091_hs110065;

import Model.EstudianteNotas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eleme
 */
public class EstudianteNotasTableModel extends AbstractTableModel {

    private List<EstudianteNotas> Estudiantes;
    private String[] columnNames = {"N°", "Carnet", "Apellidos", "Nombres", "Nota"};

    public List<EstudianteNotas> getEstudiantes() {
        return Estudiantes;
    }    

    public EstudianteNotasTableModel() {
        Estudiantes = new ArrayList<EstudianteNotas>();
    }

    public EstudianteNotasTableModel(List<EstudianteNotas> Estudiantes) {
        this.Estudiantes = Estudiantes;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public int getRowCount() {
        return Estudiantes.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = "??";
        EstudianteNotas Estudiante = Estudiantes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                value = Estudiante.getCorr();
                break;
            case 1:
                value = Estudiante.getCarnet();
                break;
            case 2:
                value = Estudiante.getApellidos();
                break;
            case 3:
                value = Estudiante.getNombres();
                break;
            case 4:
                value = Estudiante.getValor();
                break;
        }
        return value;

    }

//    public Class getColumnClass(int c) {
//        return getValueAt(0, c).getClass();
//    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col == 4) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    public void setValueAt(Object value, int row, int col) {
        EstudianteNotas Estudiante = Estudiantes.get(row);
        switch (col) {
            case 4:
                Estudiante.setValor(null);
                if (!value.toString().isEmpty()) {
                    try {
                        Float nota = Float.parseFloat(value.toString());
                        if (nota < 0.00f || nota > 10.00f) {
                            throw new Exception();
                        } else {
                            Estudiante.setValor(Float.parseFloat(value.toString()));
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese Valor entre 0 y 10");
                    }
                }

                break;
        }
        fireTableCellUpdated(row, col);
    }

    public EstudianteNotas getEstudianteAt(int row) {
        return Estudiantes.get(row);
    }

    public void clear() {
        this.Estudiantes = new ArrayList<EstudianteNotas>();
        this.fireTableDataChanged();
    }
}
