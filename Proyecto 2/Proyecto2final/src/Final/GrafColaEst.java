/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.awt.Image;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author FABIO SANCHEZ
 */
public class GrafColaEst {
    public MostrarEstaciones Mo =new MostrarEstaciones();
    public void crearDot(String nombre,String cadena){
        FileWriter wr = null;
        PrintWriter pw = null;
        try {
            wr = new FileWriter(nombre +".dot");
         pw = new PrintWriter(wr);
        pw.println("digraph colaavion{");
        pw.println(cadena);
        pw.println("}");
        pw.close();
        
        } catch (IOException ex) {
            Logger.getLogger(GrafColaEst.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                wr.close();
            } catch (IOException ex) {
                Logger.getLogger(GrafColaEst.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
    }
   
    public void generarImagen(String archivo,String imagen){

      Runtime objrun = Runtime.getRuntime();
      
        try {
            objrun.exec("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe"+" -Tjpg "+archivo+" -O "+imagen);
        } catch (IOException ex) {
            Logger.getLogger(GrafColaEst.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
