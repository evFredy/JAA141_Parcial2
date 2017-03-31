/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author eleme
 */
public class Docente {
        int idDocente;
        String Nombres;
        String Apellidos;
        String idUsuario;

    public Docente(int idDocente, String Nombres, String Apellidos, String idUsuario) {
        this.idDocente = idDocente;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.idUsuario = idUsuario;
    }
        
        
    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
