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
public class Actividad {
    int idActividades;
    int idMateria;
    int idDocente;
    String Nombre;
    String Descripcion;
    int Porcentaje;
    int idPeriodo;

    public Actividad(int idActividades, int idMateria, int idDocente, String Nombre, String Descripcion, int Porcentaje, int idPeriodo) {
        this.idActividades = idActividades;
        this.idMateria = idMateria;
        this.idDocente = idDocente;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Porcentaje = Porcentaje;
        this.idPeriodo = idPeriodo;
    }

    public int getIdActividades() {
        return idActividades;
    }

    public void setIdActividades(int idActividades) {
        this.idActividades = idActividades;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(int Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }
    
}
