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
 * @author SERVIDOR
 */
public class GrafEquipaje {
    
    public void crearDot(String nombre,String cadena) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(nombre + ".dot");
            pw = new PrintWriter(fw);
            pw.println("digraph circular {");
            pw.println(cadena);
            pw.println("}");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(GrafEquipaje.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(GrafEquipaje.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    

    public void generarImagen(String archivo,String imagen) {
        Runtime objrun = Runtime.getRuntime();
       // String doPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        //String cmd = doPath + " -Tjpg " + direccionDot + " -o " + direccionImagen;
        try {
           objrun.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe"+" -Tjpg "+archivo+" -O "+imagen);
        } catch (IOException ex) {
            Logger.getLogger(GrafEquipaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}