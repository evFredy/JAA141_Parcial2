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
public class Materia {

    public Materia(int idMateria, String Nombre, String Descripcion) {
        this.idMateria = idMateria;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }
    int idMateria;
    String Nombre;
    String Descripcion;
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
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
}
