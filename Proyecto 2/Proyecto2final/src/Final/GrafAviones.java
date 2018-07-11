/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FABIO SANCHEZ
 */
public class GrafAviones {

    public void crearDot(NodoAvion primero, String nombre) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(fw);
            pw.println("digraph listadoble {");
            pw.println(generarDot(primero));
            pw.println("}");
            pw.close();
        } catch (IOException ex) {
            System.out.println("");
        } finally {
            pw.close();
        }
    }

    public String reemplazar(int posmemoria) {
        String cadena = String.valueOf(posmemoria);
        return cadena.replace("-", "_");
    }

    public String generarDot(NodoAvion primero) {
        String cadena = "";
        if (primero == null) {
            return cadena;
        }
        cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + "Avion No. "
                + primero.getAvion() + " : \n" + primero.getTipo() + " Pasajeros " + primero.getPasajero() + "\n"
                + " No. desabordaje " + primero.getTurndesabordaje() + " No. mantenimiento " + primero.getMantenimiento() + "\"];\n";
        if (primero.sig != null) {
            cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.sig.hashCode()) + ";\n";
            cadena += "nodo" + reemplazar(primero.sig.hashCode()) + "->" + "nodo" + reemplazar(primero.sig.ant.hashCode()) + ";\n";
            cadena += generarDot(primero.sig);
        }
        return cadena;
    }

    public void generarImagen(String direccionDot, String direccionImagen) {
        String doPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        String cmd = doPath + " -Tjpg " + direccionDot + " -o " + direccionImagen;
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(GrafAviones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
