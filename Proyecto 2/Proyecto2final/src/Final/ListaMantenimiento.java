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
public class ListaMantenimiento {

    
        public void insertarFinal(NodoMantenimiento nuevo) {
        NodoMantenimiento aux = primero;
        if (primero == null) {
            primero = nuevo;
        } else {
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
        }

    }

    public void eliminarEstacionLibre(NodoAvion encola) {
        NodoMantenimiento actual = primero;
        while (actual != null) {
            if (actual.getEstado().equals("Libre")) {
                actual.setEstado("Ocupado");
                actual.setAvion(encola.getAvion());
                actual.setTipo(encola.getTipo());
                actual.setPsajero(encola.getPasajero());
                actual.setTurndesabordaje(encola.getTurndesabordaje());
                actual.setMantenimiento(encola.getMantenimiento());
                actual = null;
            } else {
                actual = actual.sig;
            }
        }
    }

    public void PasarTurnoMantenimiento() {
        if (primero == null) {
            System.out.println("No hay estaciones");
        } else {
            NodoMantenimiento aux = primero;
            while (aux != null) {
                if (aux.getEstado().equals("Ocupado")) {
                    aux.setMantenimiento(aux.getMantenimiento() - 1);
                }
                aux = aux.sig;
            }
        }
    }

    public void EliminarEstacionOcupada() {
        NodoMantenimiento actual = primero;
        while (actual != null) {
            if (actual.getEstado().equals("Ocupado") && actual.getMantenimiento() == 0) {
                actual.setEstado("Libre");
                actual.setAvion(0);
                actual.setTipo("");
                actual.setPsajero(0);
                actual.setTurndesabordaje(0);
                actual.setMantenimiento(0);
                actual = null;
            } else {
                actual = actual.sig;
            }
        }

    }

    public void recorrer() {
        if (primero == null) {
            System.out.println("**********Estaciones**********");
            System.out.println("No hay Aviones");
        } else {
            NodoMantenimiento aux = primero;
            System.out.println("**********Estaciones**********");
            while (aux != null) {
                System.out.println("Estacion: " + aux.getEstacion()
                        + "\n       Estado: " + aux.getEstado()+ "\n       Avion: " + aux.getAvion()+ "\n       Tipo: " + aux.getTipo() + "\n       Pasajeros: " + aux.getPsajero()
             + "\n       Desabordaje: " + aux.getTurndesabordaje()+ "\n       Mantenimiento: " + aux.getMantenimiento());
                aux = aux.sig;
            }
        }
        System.out.println("");
    }

    public void recorrer(JTextArea txt) {
        String cadena = "";
        if (primero == null) {
            txt.append("**********Estaciones**********");
            txt.append("\nNo hay Aviones");
            cadena = "";
        } else {
            NodoMantenimiento aux = primero;
            txt.append("**********Estaciones**********");
            while (aux != null) {
                txt.append("\nEstacion: " + aux.getEstacion()
                        + "\n       Estado: " + aux.getEstado()+ "\n       Avion: " + aux.getAvion()+ "\n       Tipo: " + aux.getTipo()+ "\n       Pasajeros: " + aux.getPsajero()+ "\n       Desabordaje: " + aux.getTurndesabordaje()
                        + "\n       Mantenimiento: " + aux.getMantenimiento());
                cadena += aux.getEstacion() + "[label=\"" + "Estacion: " + aux.getEstacion()
                        + "\nEstado: " + aux.getEstado()+ "\nAvion " + aux.getAvion()+ "\nTipo: " + aux.getTipo()+ "\nPasajeros: " + aux.getPsajero()+ "\nDesabordaje: " + aux.getTurndesabordaje()+ "\nMantenimiento: " + aux.getMantenimiento() + "\"];\n";
                if (aux.sig != null) {
                    cadena += aux.getEstacion() + "->" + aux.sig.getEstacion() + ";\n";
                }

                aux = aux.sig;
            }
            txt.append("\n");
        }
        graphviz.crearDot("Estaciones", cadena);
        graphviz.generarImagen("Estaciones.dot", "Estaciones");
    }
    int estacionLibre = 0;
    public NodoMantenimiento primero;
    GrafColaMa graphviz = new GrafColaMa();
}

