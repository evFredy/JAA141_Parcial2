/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gb090091_hs110065;

import Model.Actividad;
import Model.Docente;
import Model.EstudianteNotas;
import Model.Materia;
import Model.Notas;
import Model.Periodo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class conexion {

    private Connection con;

    public conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GB090091_HS110065", "root", "root");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar realizar la conexion a la base de datos.\n\nError:" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public List<Materia> getListaMateriasDocente(int idDocente)
    {
        List<Materia> lista = new ArrayList<Materia>();
        String query = "select materia.idMateria, materia.Nombre, materia.Descripcion from docente "
                + "inner join docentemateria on docentemateria.idDocente = docente.idDocente "
                + "inner join Materia on Materia.idMateria = docentemateria.idMateria "
                + "WHERE docente.idDocente = " + idDocente;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Materia Aux = new Materia(rs.getInt("idMateria"), rs.getString("Nombre"), rs.getString("Descripcion"));
                lista.add(Aux);
            }
            con.close();
            if (lista.size() == 0) {
                return null;
            }
            return lista;
        } catch (Exception ex) {
        }
        return null;
    }

    public Docente loginDoc(String nombre, String pass)
    {
        String query
                = "SELECT idDocente, Nombres, Apellidos, usuario.idUsuario from usuario "
                + "inner join docente on usuario.idUsuario = docente.idUsuario "
                + "where User = '" + nombre + "' AND Password ='" + pass + "' AND IsDocente = 1";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                Docente doc = new Docente(rs.getInt("idDocente"), rs.getString("Nombres"), rs.getString("Apellidos"), rs.getString("idUsuario"));
                return doc;
            }
            con.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar insertar los datos.\n\nError:" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public List<Periodo> getListaPeriodoMateriasDocente(int idDocente, int idMateria) 
    {
        List<Periodo> lista = new ArrayList<Periodo>();
        String query = "select periodo.idPeriodo, periodo.idCiclo, periodo.idMateria, periodo.Inicio, periodo.Final, periodo.NumPeriodo from docente "
                + "inner join docentemateria on docentemateria.idDocente = docente.idDocente "
                + "inner join periodo on periodo.idMateria = docentemateria.idMateria "
                + "WHERE docente.idDocente = '" + idDocente + "' AND periodo.idMateria ='" + idMateria + "'";//'AND periodo.Final > NOW();";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Periodo Aux = new Periodo(rs.getInt("idPeriodo"), rs.getInt("idMateria"), rs.getInt("NumPeriodo"), rs.getDate("Inicio"), rs.getDate("Final"), rs.getInt("idCiclo"));
                lista.add(Aux);
            }
            con.close();
            if (lista.size() == 0) {
                return null;
            }
            return lista;
        } catch (Exception ex) {

        } 
        return null;
    }

    public List<Actividad> getListaActividadPeriodoMateriasDocente(int idDocente, int idPeriodo, int idMateria)
    {
        List<Actividad> lista = new ArrayList<Actividad>();
        String query = "select actividades.idActividades, actividades.Descripcion, actividades.idDocente, actividades.idMateria, actividades.idPeriodo, actividades.Nombre, actividades.Porcentaje from docente "
                + "inner join docentemateria on docentemateria.idDocente = docente.idDocente "
                + "inner join periodo on periodo.idMateria = docentemateria.idMateria "
                + "inner join actividades on actividades.idPeriodo = periodo.idPeriodo "
                + "WHERE actividades.idDocente = '" + idDocente + "' AND actividades.idPeriodo = '" + idPeriodo + "' AND actividades.idMateria = '" + idMateria + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Actividad Aux = new Actividad(rs.getInt("idActividades"), rs.getInt("idMateria"), rs.getInt("idDocente"), rs.getString("Nombre"), rs.getString("Descripcion"), rs.getInt("Porcentaje"), rs.getInt("idPeriodo"));
                lista.add(Aux);
            }
            con.close();
            if (lista.size() == 0) {
                return null;
            }
            return lista;
        } catch (Exception ex) {

        } 
        return null;
    }

    public List<EstudianteNotas> getEstudiantesMateriaDocente(int idMateria) 
    {
        List<EstudianteNotas> lista = new ArrayList<EstudianteNotas>();
        String query = "select usuario.User as Carnet, estudiante.Nombres, estudiante.Apellidos, estudiante.idEstudiante from estudiante "
                + "inner join usuario on usuario.idUsuario = estudiante.idUsuuario "
                + "inner join estudiantemateria on estudiantemateria.idEstudiante = estudiante.idEstudiante "
                + "where estudiantemateria.idMateria =" + idMateria;
        Integer i = 0;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                EstudianteNotas Aux = new EstudianteNotas(i.toString(), rs.getString("Carnet"), rs.getString("Nombres"), rs.getString("Apellidos"), null, rs.getInt("idEstudiante"), null);
                lista.add(Aux);
                i++;
            }
            con.close();
            if (lista.size() == 0) {
                return null;
            }
            return lista;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void setEstudiantesNotas(List<Notas> NotasEstudiantes) {
        if (NotasEstudiantes.size() < 0) {
            return;
        }
        String query = "select Max(notas.idNotas) as corr from notas";
        int corr = 0;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                corr = rs.getInt("corr");
                corr++;
            }

            PreparedStatement pstmt = con.prepareStatement(
                    "INSERT INTO Notas(idNotas,idActividades,idEstudiante,Valor) VALUES( ?, ?, ?, ?)");
            for (Notas nota : NotasEstudiantes) {
                pstmt.setInt(1, corr++);
                pstmt.setInt(2, nota.getIdActividades());
                pstmt.setInt(3, nota.getIdEstudiante());
                pstmt.setFloat(4, nota.getValor());
                pstmt.addBatch();
            }
            pstmt.executeBatch();            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,  "Error al Guardar Notas, Codigo: " + ex.getErrorCode());
            return;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Error Desconocido Contante a Soporte Tecnico");
            return;
        }        
        JOptionPane.showMessageDialog(null,"Notas Guardadas");
    }

    public boolean checkNotasRegistradas(int idActividades) {
        boolean valid = true;
        String query = "select * from notas " +
                "join actividades on actividades.idActividades = notas.idActividades " +
                "where notas.idActividades = " + idActividades;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {                 
                valid = false;                
                JOptionPane.showMessageDialog(null, "Las notas de esta actividad ya han sido registradas");
            } 
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return valid;
    }
    
    public boolean checkNotasRegistradasModificar(int idActividades) {
        boolean valid = false;
        String query = "select * from notas " +
                "join actividades on actividades.idActividades = notas.idActividades " +
                "where notas.idActividades = " + idActividades;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {                 
                valid = true;                
            } 
            else
            {
                JOptionPane.showMessageDialog(null, "Aun no hay notas registradas para esta actividad");
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return valid;
    }

    public List<EstudianteNotas> getEstudiantesMateriaDocenteModificar(int idMateria,int idActividad) {
        List<EstudianteNotas> lista = new ArrayList<EstudianteNotas>();
        String query = "select usuario.User as Carnet, estudiante.Nombres, estudiante.Apellidos, estudiante.idEstudiante, notas.Valor, notas.idNotas from estudiante " +
                "inner join usuario on usuario.idUsuario = estudiante.idUsuuario " +
                "inner join estudiantemateria on estudiantemateria.idEstudiante = estudiante.idEstudiante " +
                "inner join actividades on actividades.idMateria = estudiantemateria.idMateria " +
                "inner join notas on notas.idEstudiante = estudiante.idEstudiante " +
                "where estudiantemateria.idMateria = '"+idMateria+"' and actividades.idActividades = '"+ idActividad+"'";
        Integer i = 0;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                EstudianteNotas Aux = new EstudianteNotas(i.toString(), rs.getString("Carnet"), rs.getString("Nombres"), rs.getString("Apellidos"), rs.getFloat("Valor"), rs.getInt("idEstudiante"),rs.getInt("idNotas"));
                lista.add(Aux);
                i++;
            }
            con.close();
            if (lista.size() == 0) {
                return null;
            }
            return lista;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void setEstudiantesNotasModificar(List<Notas> NotasEstudiantes) {
        if (NotasEstudiantes.size() < 0) {
            return;
        }

        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "update Notas set valor = ? where idNotas = ?");
            for (Notas nota : NotasEstudiantes) {
                pstmt.setFloat(1, nota.getValor());
                pstmt.setInt(2, nota.getIdNotas());
                pstmt.addBatch();
            }
            pstmt.executeBatch();            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,  "Error al Guardar Notas, Codigo: " + ex.getErrorCode());
            return;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Error Desconocido Contante a Soporte Tecnico");
            return;
        }        
        JOptionPane.showMessageDialog(null,"Notas Guardadas");
    }
    
    
    public void setActividades(List<Actividad> actividades) {
        if (actividades.size() < 0) {
            return;
        }
        String query = "select Max(actividades.idActividades) as corr from actividades";
        int corr = 0;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                corr = rs.getInt("corr");
                corr++;
            }

            PreparedStatement pstmt = con.prepareStatement(
                    "INSERT INTO actividades(idActividades,idMateria,idDocente, nombre, descripcion, porcentaje, idPeriodo) VALUES( ?, ?, ?, ?, ? ,? , ?)");
            for (Actividad act : actividades) {
                pstmt.setInt(1, corr++);
                pstmt.setInt(2, act.getIdMateria());
                pstmt.setInt(3, act.getIdDocente());
                pstmt.setString(4, act.getNombre());
                pstmt.setString(5, act.getDescripcion());
                pstmt.setInt(6, act.getPorcentaje());
                pstmt.setInt(7, act.getIdPeriodo());
                pstmt.addBatch();
            }
            pstmt.executeBatch();            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,  "Error al Guardar Actividades, Codigo: " + ex.getErrorCode());
            return;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Error Desconocido Contante a Soporte Tecnico");
            return;
        }        
        JOptionPane.showMessageDialog(null,"Actividades guardadas");
    }

}
