/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import javax.swing.JTextArea;

/**
 *
 * @author FABIO SANCHEZ
 */
public class ListaDobleEscritorios {

    public NodoEscritorio primero;
    ColaPasajeros pasajeros = new ColaPasajeros();

    public void insertarInicio(NodoEscritorio nuevo) {
        //NodoEscritorio nuevo =new NodoEscritorio( escritorio, correlativo);
        if (primero == null) {
            primero = nuevo;
        } else {
            nuevo.sig = primero;
            primero.ant = nuevo;
            primero = nuevo;
        }
    }

    public void insertarFinalAvion(NodoEscritorio nuevo) {
        // NodoEscritorio nuevo=new NodoEscritorio(escritorio, correlativo);
        if (primero == null) {
            primero = nuevo;
        } else {
            NodoEscritorio aux = primero;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
            nuevo.ant = aux;
        }
    }

    public void eliminar(int escritorio, String correlativoo) {
        if (primero != null) {
            NodoEscritorio aux = primero;
            NodoEscritorio auxant = null;
            //lo recorremos hasta el último
            while (aux.sig != null) {
                if (aux.getEstado().equals("libre")) {///////////
                    if (auxant == null) {
                        //primero
                        primero = primero.sig;
                        aux.sig = null;
                        aux = primero;
                        return;
                    } else {
                        auxant.sig = aux.sig;
                        aux.sig = null;
                        aux = auxant.sig;
                        aux.ant = auxant;
                        return;
                    }
                } else {
                    auxant = aux;
                    aux = aux.sig;
                }
            }

            auxant.sig = null;
            aux = null;
        }

    }

    public void recorrerAvion() {
        if (primero == null) {
            System.out.println("**********Escritorio**********");
            System.out.println("Cola VACIA");
        } else {
            NodoEscritorio aux = primero;
            System.out.println("**********Escritorio**********");
            while (aux != null) {
                System.out.print("Escritorio " + aux.getEscritorio() + aux.getCorrelativo()
                        + " \n");
                aux = aux.sig;
            }
          
        }
    }

    public void recorrer(JTextArea txt) {
        if (primero == null) {
            txt.append("**********Escritorios**********");
            txt.append("\nNo hay Aviones");
        } else {
            NodoEscritorio aux = primero;
            ColaPasajeros pa = new ColaPasajeros();

            txt.append("**********Escritorios**********");
            while (aux != null) {

                txt.append("\nEscritorio: " + aux.getEscritorio() + aux.getCorrelativo() + aux.getEstado());
                txt.append("\nEscritorio: " + aux.getEscritorio() + aux.getCorrelativo() + aux.getEstado());
                aux = aux.sig;

            }
        }
        txt.append("\n");
    }
}
