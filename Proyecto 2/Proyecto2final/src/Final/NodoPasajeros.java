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
public class NodoPasajeros {
    private int pasajero;
    private int maletas;
    private int documentos;
    private int turnoRegistro;
    
    public NodoPasajeros sig;

    public NodoPasajeros(int pasajero) {
        setPasajero(pasajero);
        setMaletas((int)(Math.random()*(4-1+1)+1));
        setDocumentos((int)(Math.random()*(10-1+1)+1));
        setTurnoRegistro((int)(Math.random()*(3-1+1)+1));
        this.sig = null;
    }

    public int getTurnoRegistro() {
        return turnoRegistro;
    }

    public void setTurnoRegistro(int turnoRegistro) {
        this.turnoRegistro = turnoRegistro;
    }

    public int getPasajero() {
        return pasajero;
    }

    public void setPasajero(int pasajero) {
        this.pasajero = pasajero;
    }

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public int getDocumentos() {
        return documentos;
    }

    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }
    
    
}
