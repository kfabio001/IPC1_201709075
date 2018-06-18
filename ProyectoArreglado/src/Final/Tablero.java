/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author FABIO SANCHEZ
 */
public class Tablero {
   
    Jugadores nj;
    PanelTablero panel;

    public Tablero(Jugadores nj, PanelTablero panel) {
        this.nj = nj;
        this.panel = panel;
    }
    
    public JPanel Tablero(){
        panel.tamT = nj.getCasillas();
        panel.vecL = new int[panel.tamT][panel.tamT];
        
        JPanel panel1 = new JPanel();
        //int tamT = tamMatriz();
        panel.lTablero = new JLabel[panel.tamT][panel.tamT];
        panel1.setLayout(new GridLayout(panel.tamT,panel.tamT));
        
        //debo decidir que es lo que va a ir dentro de los Labels
        
        panel1.setBounds(350, 70, 600, 600);
        
        //panel1.setBackground(new Color(0, 0, 0, 1));
        //creacion del tablero dentro del panel
        for(int i = 0;i<panel.tamT;i++){
            for(int j = 0;j<panel.tamT;j++){
                panel.lTablero[i][j]=new JLabel();
                panel.lTablero[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                panel.vecL[i][j] = 0;
                panel1.add(panel.lTablero[i][j]);
            }
        }
        //panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.setOpaque(false);
        panel.PosIniciales();
        return panel1;
    }
    
}
    

