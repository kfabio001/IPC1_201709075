/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author FABIO SANCHEZ
 */
public class NodoEscritorio {
    private int escritorio;
    private String correlativo;
    private String estado;
    private int pasajero;
    
    
    public NodoEscritorio sig;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public NodoEscritorio(int escritorio, String correlativo, String estado, int pasajero, int turnoRegistro) {
        this.escritorio = escritorio;
        this.correlativo = correlativo;
        this.estado = "ocupado";
        this.pasajero = pasajero;
        
        this.turnoRegistro = turnoRegistro;
    }

    public NodoEscritorio(int escritorio) {
        this.escritorio = escritorio;
        this.correlativo = correlativo;
        this.estado = "libre";
        this.pasajero = 0;
        
        this.turnoRegistro = turnoRegistro;
    }

    public int getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(int escritorio) {
        this.escritorio = escritorio;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

 

    public NodoEscritorio getSig() {
        return sig;
    }

    public void setSig(NodoEscritorio sig) {
        this.sig = sig;
    }

    public NodoEscritorio getAnt() {
        return ant;
    }

    public void setAnt(NodoEscritorio ant) {
        this.ant = ant;
    }
   
    private int turnoRegistro;
    
    
    public NodoEscritorio ant;
}
