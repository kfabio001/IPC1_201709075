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
public class NodoPasajeros {
    
    
  

    private int Npasajeros;
    private int maletas;
    private int documentos;
   
   

    
    
    public NodoPasajeros anterior;
    public NodoPasajeros siguiente;

    public int getNPasajeros() {
        return Npasajeros;
    }

    public void setNPasajeros(int Npasajeros) {
        this.Npasajeros = Npasajeros;
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

    public NodoPasajeros(int Npasajeros, int maletas, int documentos) {
        this.Npasajeros = Npasajeros;
        this.maletas = maletas;
        this.documentos = documentos;
    }
    
   

    
    
    
    
}

    
