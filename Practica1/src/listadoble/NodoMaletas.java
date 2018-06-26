/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

/**
 *
 * @author FABIO SANCHEZ
 */
public class NodoMaletas {
    int NMaletas;
    NodoMaletas siguiente;
    NodoMaletas anterior;

    public NodoMaletas(int dato) {
        this.NMaletas = dato;
        
    }

    public int getDato() {
        return NMaletas;
    }

    public void setDato(int dato) {
        this.NMaletas = dato;
    }

    public NodoMaletas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMaletas siguiente) {
        this.siguiente = siguiente;
    }

    public NodoMaletas getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoMaletas anterior) {
        this.anterior = anterior;
    }
    
    
}
