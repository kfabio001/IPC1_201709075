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
public class ListaDobleAvion {

    public NodoAvion primero;
    ColaPasajeros pasajeros = new ColaPasajeros();
    ColaAviones colaAviones = new ColaAviones();
    int cantpasajeros = 0;

    public void insertarInicio(NodoAvion nuevo) {
        if (primero == null) {
            primero = nuevo;
        } else {
            nuevo.sig = primero;
            primero.ant = nuevo;
            primero = nuevo;
        }
    }

    public void recorrer(JTextArea txt) {
        if (primero == null) {
            txt.append("**********Aviones**********");
            txt.append("\n  No hay aviones");
        } else {
            NodoAvion aux = primero;
            txt.append("**********Aviones**********");
            while (aux != null) {
                txt.append("\nAvion " + aux.getAvion()
                + "\n       Tipo: " + aux.getTipo()+ "\n       Pasajeros: " + aux.getPasajero() + "\n       Desabordaje: " + aux.getTurndesabordaje()
                  + "\n       Mantenimiento: " + aux.getMantenimiento());
                aux = aux.sig;
            }
        }

        txt.append("\n");
        pasajeros.recorrer(txt);
        txt.append("\n");
        colaAviones.recorrer(txt);

    }

    public void PasarTurnoDesabordaje() {
        if (primero == null) {
            System.out.println("");
        } else {
            NodoAvion aux = primero;
            while (aux != null) {
                aux.setTurndesabordaje(aux.getTurndesabordaje() - 1);
                aux = aux.sig;
            }
        }
    }

    public void DescolarPasajeros() {
        pasajeros.descolar();
    }

    public void CrearEstaciones(int id) {
        colaAviones.CrearEstacion(id);
    }

    public void ProcesosEstaciones() {
        colaAviones.ProcesosMantenimiento();
        colaAviones.Descolar();
    }

    public void recorrer() {
        if (primero == null) {
            System.out.println("**********Aviones**********");
            System.out.println("No hay aviones");
        } else {
            NodoAvion aux = primero;
            System.out.println("**********Aviones**********");
            while (aux != null) {
                System.out.println("\nAvion " + aux.getAvion()
                        + "\n       Tipo: " + aux.getTipo()+ "\n       Pasajeros: " + aux.getPasajero() + "\n       Desabordaje: " + aux.getTurndesabordaje()
                        + "\n       Mantenimiento: " + aux.getMantenimiento());
                aux = aux.sig;
            }
        }
        pasajeros.recorrer();
        System.out.println("");
        colaAviones.recorrer();
    }

    public void insertarFinal(NodoAvion nuevo) {
        NodoAvion aux = primero;
        if (primero == null) {
            primero = nuevo;
            cantpasajeros = primero.getPasajero();
            for (int i = 1; i <= cantpasajeros; i++) {
                pasajeros.encolar(new NodoPasajeros(i));
            }
            cantpasajeros++;
        } else {
            int cantpasajeros2 = cantpasajeros - 1;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
            cantpasajeros2 = cantpasajeros2 + aux.sig.getPasajero();
            nuevo.ant = aux;
            for (; cantpasajeros <= cantpasajeros2; cantpasajeros++) {
                pasajeros.encolar(new NodoPasajeros(cantpasajeros));
            }
        }

    }

    public void eliminar() {
        try {
            if (primero != null) {
                NodoAvion aux = primero;
                NodoAvion antaux = null;
                while (aux != null) {
                    if (aux.getTurndesabordaje() == 0) {
                        if (antaux == null) {
                            colaAviones.encolar(aux);
                            primero = primero.sig;
                            aux.sig = null;
                            aux = primero;
                        } else {
                            antaux.sig = aux.sig;
                            aux.sig = null;
                            aux = antaux.sig;
                            aux.ant = antaux;
                        }
                    } else {
                        antaux = aux;
                        aux = aux.sig;
                    }
                }
            }
        } catch (Exception e) {
        }
    }

}