/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author eleme
 */
public class Periodo {
    int idPeriodo;
    int idMateria;
    int NumPeriodo;
    Date Inicio;
    Date Final;
    int idCiclo;

    public Periodo(int idPeriodo, int idMateria, int NumPeriodo, Date Inicio, Date Final, int idCiclo) {
        this.idPeriodo = idPeriodo;
        this.idMateria = idMateria;
        this.NumPeriodo = NumPeriodo;
        this.Inicio = Inicio;
        this.Final = Final;
        this.idCiclo = idCiclo;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public int getNumPeriodo() {
        return NumPeriodo;
    }

    public void setNumPeriodo(int NumPeriodo) {
        this.NumPeriodo = NumPeriodo;
    }

    public Date getInicio() {
        return Inicio;
    }

    public void setInicio(Date Inicio) {
        this.Inicio = Inicio;
    }

    public Date getFinal() {
        return Final;
    }

    public void setFinal(Date Final) {
        this.Final = Final;
    }

    public int getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }
    
}
