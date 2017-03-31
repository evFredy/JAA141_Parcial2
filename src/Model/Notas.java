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
public class Notas {
    int idNotas;
    int idActividades;
    int idEstudiante;
    Float Valor;

    public Notas(int idNotas, int idActividades, int idEstudiante, Float Valor) {
        this.idNotas = idNotas;
        this.idActividades = idActividades;
        this.idEstudiante = idEstudiante;
        this.Valor = Valor;
    }

    public int getIdNotas() {
        return idNotas;
    }

    public void setIdNotas(int idNotas) {
        this.idNotas = idNotas;
    }

    public int getIdActividades() {
        return idActividades;
    }

    public void setIdActividades(int idActividades) {
        this.idActividades = idActividades;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Float getValor() {
        return Valor;
    }

    public void setValor(Float Valor) {
        this.Valor = Valor;
    }
    
}
