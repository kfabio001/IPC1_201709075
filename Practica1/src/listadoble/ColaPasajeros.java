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
public class ColaPasajeros {
    private NodoPasajeros primero;
    private NodoPasajeros ultimo;
    
    
     public void insertarFinalPasajeros(int pasajeros,int maletas, int documentos){
        NodoPasajeros nuevo=new NodoPasajeros(pasajeros, maletas, documentos);
        if(primero==null){
            primero=nuevo;
                    primero.siguiente=null;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=null;
            primero.anterior=nuevo;
            ultimo=nuevo;
        }
    }
     
    // public void eliminarFinalPasajeros(int )
    
    public void recorrerPasajeros(){
               
        if(primero==null){
           
            System.out.println("LISTA VACIA");
        }else{
            NodoPasajeros aux = primero;
            while (aux!=null){
                System.out.print("Pasajeros: "+aux.getNPasajeros()+" \n Maletas: "+aux.getMaletas()+
                        " \n Documentos: "+aux.getDocumentos()+"\n");
                aux=aux.siguiente;
            }
            
        }
    }

    
    
    
}
