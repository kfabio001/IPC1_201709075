/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

/**
 *
 * @author Rocael
 */
public class NodoPersona {
    private int avion;
    private String tipo;
    private int pasajeros;
    private int desabordaje;
    private int mantenimiento;

    public int getAvion() {
        return avion;
    }

    public void setAvion(int avion) {
        this.avion = avion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDesabordaje() {
        return desabordaje;
    }

    public void setDesabordaje(int desabordaje) {
        this.desabordaje = desabordaje;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public NodoPersona(int avion,String tipo,  int pasajeros, int desabordaje, int mantenimiento) {
        this.avion = avion;
        this.tipo = tipo;
        this.pasajeros = pasajeros;
        this.desabordaje = desabordaje;
        this.mantenimiento = mantenimiento;
    }
    
    public NodoPersona anterior;
    public NodoPersona siguiente;
    
   

    
    
    
    
}
