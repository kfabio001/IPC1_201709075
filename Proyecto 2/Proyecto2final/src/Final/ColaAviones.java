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

import javax.swing.JTextArea;

public class ColaAviones {

    GrafColaEst graphics = new GrafColaEst();
    ListaMantenimiento mantenimiento = new ListaMantenimiento();
    public NodoAvion primero;

    public void encolar(NodoAvion nuevo) {
        NodoAvion aux = primero;
        if (primero == null) {
            primero = nuevo;
        } else {
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }
    }

    public void CrearEstacion(int estacion) {
        mantenimiento.insertarFinal(new NodoMantenimiento(estacion));
    }

    public void ProcesosMantenimiento() {
        mantenimiento.PasarTurnoMantenimiento();
        mantenimiento.EliminarEstacionOcupada();
    }

    public void Descolar() {
        try {
            if (primero.sig == null) {
                try {
                    mantenimiento.eliminarEstacionLibre(primero);
                    primero = primero.sig = null;
                } catch (NullPointerException e) {
                }
            } else {
                try {
                    mantenimiento.eliminarEstacionLibre(primero);
                    primero = primero.sig;
                } catch (NullPointerException e) {
                }
            }
        } catch (NullPointerException e) {
        }
    }

    public void recorrer(JTextArea txt) {
        String cadena = "";
        if (primero == null) {
            txt.append("**********Cola de Aviones**********");
            txt.append("\nNo han entrado aviones");
            cadena = "";
        } else {
            txt.append("**********Cola de Aviones**********");
            NodoAvion aux = primero;
            while (aux != null) {
                txt.append("\nAvion " + aux.getAvion()
                        + "\n       Tipo: " + aux.getTipo() + "\n       Pasajeros: " + aux.getPasajero() + "\n       Desabordaje: " + aux.getTurndesabordaje() + "\n       Mantenimiento: " + aux.getMantenimiento());
                cadena += "nodo" + aux.hashCode() + "[label=\"" + "\nPasajero: " + aux.getPasajero()
                        + "\nAvion:  " + aux.getAvion() + "\nTipo: " + aux.getTipo() + "\nPasajeros: " + aux.getPasajero() + "\nDesabordaje: " + aux.getTurndesabordaje() + "\nTurnos Mantenimiento: " + aux.getMantenimiento()
                        + "\"];\n";

                if (aux.sig != null) {
                    cadena += "nodo" + aux.hashCode() + "->" + "nodo" + aux.sig.hashCode() + ";\n";
                }

                aux = aux.sig;
            }
            txt.append("\n");
        }
        txt.append("\n");
        graphics.crearDot("ColaAvion", cadena);
        graphics.generarImagen("ColaAvion.dot", "ColaAvion");
        txt.append("\n");
        mantenimiento.recorrer(txt);
    }

    public void recorrer() {
        if (primero == null) {
            System.out.println("**********Cola de Aviones**********");
            System.out.println("\nNo han entrado aviones");
        } else {
            System.out.println("**********Cola de Aviones**********");
            NodoAvion aux = primero;
            while (aux != null) {
                System.out.println("\nAvion " + aux.getAvion()
                        + "\n       Tipo: " + aux.getTipo() + "\n       Pasajeros: " + aux.getPasajero() + "\n       Desabordaje: " + aux.getTurndesabordaje() + "\n       Mantenimiento: " + aux.getMantenimiento());
                aux = aux.sig;
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        mantenimiento.recorrer();
    }

}
