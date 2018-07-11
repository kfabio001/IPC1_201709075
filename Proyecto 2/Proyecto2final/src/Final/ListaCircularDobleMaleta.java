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
public class ListaCircularDobleMaleta {

    GrafEquipaje graphviz = new GrafEquipaje();
    public NodoEquipaje primero;
    public NodoEquipaje ultimo;

    public void insertar(NodoEquipaje nuevo) {
        if (primero == null) {
            primero = nuevo;
            primero.sig = nuevo;
            primero.ant = primero;
        } else {
            NodoEquipaje aux = primero;
            while (aux.sig != primero) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
            nuevo.ant = aux;
            nuevo.sig = primero;
            primero.ant = nuevo;
        }
    }

    public void EliminarNodo(int w) {

        NodoEquipaje actual;
        NodoEquipaje anterior;
        actual = primero;
        anterior = ultimo;
        do {
            if (actual.getMaleta() == w) {
                if (actual == primero) {
                    primero = primero.sig;
                    ultimo.sig = primero;
                    primero.ant = ultimo;
                } else if (actual == ultimo) {
                    ultimo = anterior;
                    primero.ant = ultimo;
                    ultimo.sig = primero;
                } else {
                    anterior.sig = actual.sig;
                    actual.sig.ant = anterior;
                }
            }
            anterior = actual;
            actual = actual.sig;
        } while (actual != primero);

    }

    public void Eliminar(int maleta) {
        if (primero != null) {
            NodoEquipaje aux = primero;
            NodoEquipaje ant = null;
            while (aux.sig != primero) {
                if (aux.getMaleta() == maleta) {
                    if (ant == null) {
                        if (aux.sig == primero) {
                            primero = null;
                        } else {
                            ant = aux.ant;
                            ant.sig = aux.sig;
                            aux = aux.sig;
                            aux.ant = ant;
                            primero = aux;
                            ant = null;
                        }
                    } else {
                        aux.ant = null;
                        ant.sig = aux.sig;
                        aux = aux.sig;
                        aux.ant = ant;
                    }
                } else {
                    ant = aux;
                    aux = aux.sig;
                }
            }
            if (aux.getMaleta() == maleta) {
                ant.sig = primero;
                primero.ant = ant;
                aux = null;
            }

        } else {
            System.out.println("LISTA VACIA");
        }
    }

    public void recorrer(JTextArea txt) {
        String cadena = "";
        if (primero == null) {
            txt.append("**********Maletas**********");
            txt.append("\nNo hay maletas");
            cadena = "";
        } else {
            txt.append("**********Maletas**********");
            NodoEquipaje aux = primero;
            int fin = 0;
            txt.append("\nInicio: " + aux.getMaleta());
            do {
                aux = aux.sig;
                fin = aux.ant.getMaleta();
            } while (aux != primero);
            txt.append("\nFin: " + fin);
            NodoEquipaje auxx = primero;
            do {
                txt.append("\nMaleta:  " + auxx.getMaleta());
                cadena += "nodo" + aux.hashCode() + "[label=\"" + "\nMaletas: " 
                        + "\"];\n";
                        

                if (aux.sig != null) {
                    cadena +=  auxx.getMaleta() + "->" + auxx.sig.getMaleta() + ";\n";
                    cadena += auxx.sig.getMaleta() + "->" + auxx.sig.ant.getMaleta() + ";\n";
                }

                auxx = auxx.sig;
            } while (auxx != primero);

            graphviz.crearDot("Equipaje", cadena);
            graphviz.generarImagen("Equipaje.dot", "Equipaje");

            txt.append("\n");
        }
    }

    public void recorrer() {
        if (primero == null) {
            System.out.println("**********Maletas**********");
            System.out.println("\nNo hay maletas");
        } else {
            System.out.println("**********Maletas**********");
            NodoEquipaje aux = primero;
            int fin = 0;
            System.out.println("\nInicio: " + aux.getMaleta());
            do {
                aux = aux.sig;
                fin = aux.ant.getMaleta();
            } while (aux != primero);
            System.out.println("\nFin: " + fin);
            NodoEquipaje auxx = primero;
            do {
                System.out.println("\nMaleta: " + auxx.getMaleta());
                auxx = auxx.sig;
            } while (auxx != primero);
            System.out.println("\n");
        }
    }

}
