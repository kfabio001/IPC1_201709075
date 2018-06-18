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
   
    Jugadores nombrej;
    PanelTablero panel;

    public Tablero(Jugadores nombrej, PanelTablero panel) {
        this.nombrej = nombrej;
        this.panel = panel;
    }
    
    public JPanel Tablero(){
        panel.tamTab = nombrej.getCasillas();
        panel.vecL = new int[panel.tamTab][panel.tamTab];
        
        JPanel panel1 = new JPanel();
        //int tamT = tamMatriz();
        panel.Tablero = new JLabel[panel.tamTab][panel.tamTab];
        panel1.setLayout(new GridLayout(panel.tamTab,panel.tamTab));
        
        //debo decidir que es lo que va a ir dentro de los Labels
        
        panel1.setBounds(350, 70, 600, 600);
        panel1.setBackground(new Color(0, 0, 0, 1));
        //creacion del tablero dentro del panel
        for(int i = 0;i<panel.tamTab;i++){
            for(int j = 0;j<panel.tamTab;j++){
                panel.Tablero[i][j]=new JLabel();
                panel.Tablero[i][j].setBorder(BorderFactory.createLineBorder(Color.red));
                panel.vecL[i][j] = 0;
                panel1.add(panel.Tablero[i][j]);
            }
        }
        
        panel.PosicionesIniciales();
        return panel1;
    }
    
}
    

