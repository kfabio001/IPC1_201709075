/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

import java.util.Random;
import java.awt.*;

import javax.swing.JFrame;

import javax.swing.JScrollPane;

import javax.swing.JTextArea;

public class LISTADOBLE {

    public static void main(String[] args) {

        Generar li = new Generar();

        li.generarTipo();

/*
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("ListAirPort");
       frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea2 = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea2);
        Generar mensajero=new Generar();     
        mensajero.generarTipo();
        frame.getContentPane().add(scroll, BorderLayout.CENTER);
scroll.setBounds(400, 20, 500, 600);
        frame.add(scroll);
       textArea2.setLineWrap(true);
textArea2.setBounds(400, 20, 500, 600);
       // textArea2.setWrapStyleWord(true);
        frame.add(scroll);
        frame.pack();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
*/
    }

}

/*
        ListaPersona lp=new ListaPersona();
        lp.recorrer();
        lp.insertarInicio(2011, "Roca",2,2,2);
        lp.insertarInicio(2012, "nuevo",2,2,2);
        lp.recorrer();
        lp.insertarFinal(2014, "eduardo",2,2,2);
        lp.recorrer();
        //lp.eliminar(2011);
        lp.recorrer();*/
