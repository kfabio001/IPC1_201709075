
package ejemplohilos2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Tablero {

    public int tam = 0;
    public JPanel fondo = null;
    public Personajes per;

    public int[] vecL;
    public JLabel[] vecG;
    public int tambloquey = 0;

    public Tablero(int tam, JPanel Fondo) {
        this.tam = tam;
        this.fondo = Fondo;
        llenar(tam);
    }

    public void llenar(int tam) {
        tambloquey = 500 / tam;
        vecL = new int[tam];
        vecG = new JLabel[tam];

        vecL[0] = 1;
        this.per = new Personajes();
        this.per.posper = 0;
        for (int i = 1; i < tam; i++) {
            vecL[i] = 0;
        }
        repintar();
    }


    public void repintar() {
        for (int i = 0; i < tam; i++) {
            JLabel tablero;

            if (vecL[i] == 0) {
                tablero = new JLabel();
                tablero.setOpaque(false);
                tablero.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 1)));
                tablero.setBounds(0,i* tambloquey, 150, tambloquey);
                vecG[i] = tablero;
                fondo.add(vecG[i], BorderLayout.CENTER);
                fondo.repaint();
            }
             if (vecL[i] == 1) {
                tablero = new JLabel(this.per.obtenerImagen(tambloquey));
                tablero.setOpaque(false);
                tablero.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 1)));
                tablero.setBounds(0,i * tambloquey, 150, tambloquey);
                vecG[i] = tablero;
                fondo.add(vecG[i], BorderLayout.CENTER);
                fondo.repaint();
        }
    }
}
}