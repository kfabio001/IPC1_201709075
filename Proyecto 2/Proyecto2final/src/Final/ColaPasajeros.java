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

public class ColaPasajeros {

    GrafDesabordaje graphviz = new GrafDesabordaje();
    ListaCircularDobleMaleta maletas = new ListaCircularDobleMaleta();
    int CantidadMaletas = 0;
    int MalestasEliminadas = 1;
    public NodoPasajeros primero;

    
    public void encolar(NodoPasajeros nuevo) {
        NodoPasajeros aux = primero;
        if (primero == null) {
            primero = nuevo;
            CantidadMaletas = primero.getMaletas();
            for (int i = 1; i <= CantidadMaletas; i++) {
                maletas.insertar(new NodoEquipaje(i));
            }
            CantidadMaletas++;
        } else {
            int cantmaletas2 = CantidadMaletas - 1;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
            cantmaletas2 = cantmaletas2 + aux.sig.getMaletas();
            for (; CantidadMaletas <= cantmaletas2; CantidadMaletas++) {
                maletas.insertar(new NodoEquipaje(CantidadMaletas));
            }
        }

    }

    public void descolar() {
        
        try {
            if (primero.sig == null) {
               
                System.out.println("");
                primero = primero.sig = null;
                try {
                    maletas.Eliminar(MalestasEliminadas);
                    MalestasEliminadas++;
                    maletas.Eliminar(MalestasEliminadas);
                    MalestasEliminadas++;
                    maletas.Eliminar(MalestasEliminadas);
                    MalestasEliminadas++;
                    maletas.Eliminar(MalestasEliminadas);
                    MalestasEliminadas++;
                    maletas.Eliminar(MalestasEliminadas);
                    MalestasEliminadas++;
                } catch (Exception e) {
                }
            } else {
                for (int i = 1; i <= primero.getMaletas(); i++) {
                    maletas.Eliminar(MalestasEliminadas);
                    MalestasEliminadas++;
                }
                primero = primero.sig;
            }
        } catch (Exception e) {
        }
    }

    public void recorrer(JTextArea txt) {
        String cadena = "";
        if (primero == null) {
            txt.append("**********Pasajeros**********");
            txt.append("\nNo hay pasajeros");
            cadena = "";
        } else {
            txt.append("**********Pasajeros**********");
            NodoPasajeros aux = primero;
            while (aux != null) {
                txt.append("\nPasajero: " + aux.getPasajero()
                        + "\n       Maletas: " + aux.getMaletas()
                        + "\n       Documentos: " + aux.getDocumentos()
                );
                cadena += "nodo" + aux.hashCode() + "[label=\"" + "\nPasajero: " + aux.getPasajero()
                        + "\nMaletas: " + aux.getMaletas()
                        + "\nDocumentos: " + aux.getDocumentos()
                        + "\"];\n";

                if (aux.sig != null) {
                    cadena += "nodo" + aux.hashCode() + "->" + "nodo" + aux.sig.hashCode() + ";\n";
                }
                aux = aux.sig;
            }
            txt.append("\n");
        }
        txt.append("\n");
        graphviz.crearDot("Pasajeros", cadena);
        graphviz.generarImagen("Pasajeros.dot", "Pasajeros");
        txt.append("\n");
        maletas.recorrer(txt);
    }

    public void recorrer() {
        if (primero == null) {
            System.out.println("**********Pasajeros**********");
            System.out.println("\nNo hay pasajeros");
        } else {
            System.out.println("**********Pasajeros**********");
            NodoPasajeros aux = primero;
            while (aux != null) {
                System.out.println("\nPasajero: " + aux.getPasajero()
                        + "\n       Maletas: " + aux.getMaletas()
                        + "\n       Documentos: " + aux.getDocumentos());
                aux = aux.sig;
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        maletas.recorrer();
    }
}
