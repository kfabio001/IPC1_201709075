/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

import java.util.Random;



public class ListaPersona {
    public NodoPersona primero;
   
   
    
    
    public void insertarInicioPersona(int avion,String tipo,  int pasajeros, int desabordaje, int mantenimiento){
        NodoPersona nuevo=new NodoPersona(avion,tipo,  pasajeros, desabordaje, mantenimiento);
        if(primero==null){
            primero=nuevo;
        }else{
            nuevo.siguiente=primero;
            primero.anterior=nuevo;
            primero=nuevo;
        }
    }
    
    public void insertarFinalAvion(int avion,String tipo,   int pasajeros, int desabordaje, int mantenimiento){
        NodoPersona nuevo=new NodoPersona(avion, tipo,   pasajeros, desabordaje, mantenimiento);
        if(primero==null){
            primero=nuevo;
        }else{
            NodoPersona aux=primero;
            while(aux.siguiente!=null){
                aux=aux.siguiente;
            }
            aux.siguiente=nuevo;
            nuevo.anterior=aux;
        }
    }
    
    
    public void eliminar(int avion,String tipo,   int pasajeros, int desabordaje, int mantenimiento){
        if(primero!=null){
            NodoPersona aux=primero;
            NodoPersona auxant=null;
            //lo recorremos hasta el último
            while(aux.siguiente!=null){
                if(aux.getAvion()==avion){
                    if(auxant==null){
                        //primero
                        primero=primero.siguiente;
                        aux.siguiente=null;
                        aux=primero;
                        return;
                    }else{
                        auxant.siguiente=aux.siguiente;
                        aux.siguiente=null;
                        aux=auxant.siguiente;
                        aux.anterior=auxant;
                        return;
                    }
                }else{
                    auxant=aux;
                    aux=aux.siguiente;
                }
            }
            //eliminamos el último quitando la referencia del anterior
           // if(aux.getAvion()){
                auxant.siguiente=null;
                aux=null;
            }
            
        }
    
    
    public void recorrerAvion(){
        if(primero==null){
            System.out.println("Cola VACIA");
        }else{
            NodoPersona aux=primero;
            while (aux!=null){
                System.out.print("Avion: "+aux.getAvion()+"\n Tipo: "+aux.getTipo()+
                      " \n Pasajeros: "+aux.getPasajeros()+"\n Desabordaje: "+aux.getDesabordaje()+"\n Mantenimiento: "+aux.getMantenimiento()+" \n");
                aux=aux.siguiente;
            }
            //System.out.println(" NULL");
        }
    }
    
    }
    

