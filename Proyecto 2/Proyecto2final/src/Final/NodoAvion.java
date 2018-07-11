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
public class NodoAvion {
    private int Avion;
    private String Tipo;
    private int pasajero;
    private int turndesabordaje;
    private int mantenimiento;
    
    public NodoAvion sig;
    public NodoAvion ant;

    public NodoAvion(int Avion) {
        this.Avion = Avion;
        int tipo = (int)(Math.random()*(3-1+1)+1);
//        int tipo= 1;
        switch(tipo){
            case 1:
                setTipo("Pequeño");
                setPasajero((int)(Math.random()*(10-5+1)+5));
                setTurndesabordaje(1);
                setMantenimiento((int)(Math.random()*(3-1+1)+1));
                break;
            case 2:
                setTipo("Mediano");
                setPasajero((int)(Math.random()*(25-15+1)+15));
                setTurndesabordaje(2);
                setMantenimiento((int)(Math.random()*(4-2+1)+2));
                break;
            case 3:
                setTipo("Grande");
                setPasajero((int)(Math.random()*(40-30+1)+30));
                setTurndesabordaje(3);
                setMantenimiento((int)(Math.random()*(6-3+1)+3));
                break;
            default:
                break;
        }       
        this.sig = null;
        this.ant = null;
    }

    /**
     * @return the Avion
     */
    public int getAvion() {
        return Avion;
    }

    /**
     * @param Avion the Avion to set
     */
    public void setAvion(int Avion) {
        this.Avion = Avion;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the psajero
     */
    public int getPasajero() {
        return pasajero;
    }

    /**
     * @param psajero the psajero to set
     */
    public void setPasajero(int psajero) {
        this.pasajero = psajero;
    }

    /**
     * @return the turndesabordaje
     */
    public int getTurndesabordaje() {
        return turndesabordaje;
    }

    /**
     * @param turndesabordaje the turndesabordaje to set
     */
    public void setTurndesabordaje(int turndesabordaje) {
        this.turndesabordaje = turndesabordaje;
    }

    /**
     * @return the mantenimiento
     */
    public int getMantenimiento() {
        return mantenimiento;
    }

    /**
     * @param mantenimiento the mantenimiento to set
     */
    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
    
}
