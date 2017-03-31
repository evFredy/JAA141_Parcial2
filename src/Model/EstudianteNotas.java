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
public class EstudianteNotas {
    String Corr;
    String Carnet;
    String Nombres;
    String Apellidos;
    Float Valor;    
    int idEstudiante;

    public EstudianteNotas(String Corr, String Carnet, String Nombres, String Apellidos, Float Valor, int idEstudiante) {
        this.Corr = Corr;
        this.Carnet = Carnet;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Valor = Valor;
        this.idEstudiante = idEstudiante;
    }

    public String getCorr() {
        return Corr;
    }

    public void setCorr(String Corr) {
        this.Corr = Corr;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
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

    public Float getValor() {
        return Valor;
    }

    public void setValor(Float Valor) {
        this.Valor = Valor;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    
}
