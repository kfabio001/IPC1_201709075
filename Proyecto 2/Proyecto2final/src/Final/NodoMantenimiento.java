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
public class NodoMantenimiento {
    private int estacion;
    private String estado;
    private int Avion;
    private String Tipo;
    private int pasajero;
    private int turndesabordaje;
    private int mantenimiento;
    
    public NodoMantenimiento sig;

    public NodoMantenimiento(int estacion, NodoAvion nodoeliminado) {
        this.estado = "Ocupado";
        this.estacion = estacion;
        this.Avion = nodoeliminado.getAvion();
        this.Tipo = nodoeliminado.getTipo();
        this.pasajero = nodoeliminado.getPasajero();
        this.turndesabordaje = nodoeliminado.getTurndesabordaje();
        this.mantenimiento = nodoeliminado.getMantenimiento();
    }

    public NodoMantenimiento(int estacion) {
        this.estacion = estacion;
        this.estado = "Libre";
        this.Avion = 0;
        this.Tipo = "";
        this.pasajero = 0;
        this.turndesabordaje = 0;
        this.mantenimiento = 0;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEstacion() {
        return estacion;
    }

    public void setEstacion(int estacion) {
        this.estacion = estacion;
    }

    public int getAvion() {
        return Avion;
    }

    public void setAvion(int Avion) {
        this.Avion = Avion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getPsajero() {
        return pasajero;
    }

    public void setPsajero(int psajero) {
        this.pasajero = psajero;
    }

    public int getTurndesabordaje() {
        return turndesabordaje;
    }

    public void setTurndesabordaje(int turndesabordaje) {
        this.turndesabordaje = turndesabordaje;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
    
    
    
}
