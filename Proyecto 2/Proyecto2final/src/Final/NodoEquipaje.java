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
public class NodoEquipaje {
    private int maleta;
    public NodoEquipaje sig;
    public NodoEquipaje ant;

    public NodoEquipaje(int maleta) {
        this.maleta = maleta;
    }

    public int getMaleta() {
        return maleta;
    }

    public void setMaleta(int maleta) {
        this.maleta = maleta;
    }
    
}
