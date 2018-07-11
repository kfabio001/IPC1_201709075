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
public class GrafDesabordaje {
    public void crearDot(String nombre,String cadena) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(fw);
            pw.println("digraph colapasajeros {");
            pw.println(cadena);
            pw.println("}");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(GrafDesabordaje.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(GrafDesabordaje.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
   /* public String reemplazar(int posmemoria) {
        String cadena = String.valueOf(posmemoria);
        return cadena.replace("-", "_");
    }*/
   /* public String generarDot(NodoPasajeros primero) {
        String cadena = "";
        if (primero == null) {
            return cadena;
        }
        cadena += "nodo" + reemplazar(primero.hashCode()) + "[label=\"" + "Avion No. "
                + primero.getPasajero() + " : \n" + primero.getMaletas() + " Pasajeros " + primero.getDocumentos() + "\n"
                + " No. desabordaje " + primero.getTurnoRegistro() +  "\"];\n";
        if (primero.sig != null) {
            cadena += "nodo" + reemplazar(primero.hashCode()) + "->" + "nodo" + reemplazar(primero.sig.hashCode()) + ";\n";
            cadena += "nodo" + reemplazar(primero.sig.hashCode()) + "->" + "nodo" +  ";\n";
            cadena += generarDot(primero.sig);
        }
        return cadena;
    }*/
    public void generarImagen(String archivo,String imagen) {
        Runtime objrun = Runtime.getRuntime();
       // String doPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        //String cmd = doPath + " -Tjpg " + direccionDot + " -o " + direccionImagen;
        try {
           objrun.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe"+" -Tjpg "+archivo+" -O "+imagen);
        } catch (IOException ex) {
            Logger.getLogger(GrafDesabordaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


