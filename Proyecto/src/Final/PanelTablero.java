/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author FABIO SANCHEZ
 */
public class PanelTablero extends JFrame {

    int vecL[][];
    int turno;
    JLabel VidasJugador1;
    JLabel VidasJugador2;
    JLabel lVida1;
    JLabel lVida2;

    ImageIcon pok;
    JLabel imagenF1 = new JLabel();
    JLabel imagenTab;
    
    JLabel[][] Tablero;
    JLabel tiempo;
    JLabel reloj;
    JLabel jug1;
    JLabel jug2;

    JLabel personajes1, personajes2;

    JLabel iVida1, iVida2, lDado, j1p1, j1p2, j1p3, j2p1, j2p2, j2p3,TAtack,TMov;

    JButton dado;
    JButton moverDerecha;
    JButton moverIzquierda;
    JButton moverArriba;
    JButton moverAbajo;
    JButton atacarDerecha;
    JButton atacarIzquierda;
    JButton atacarArriba;
    JButton atacarAbajo;

    JPanel panel1;
    int tamTab;
    int nrd;
    Jugadores nj;
    Personajes p;

    PanelTablero panel;

    public PanelTablero(Jugadores nj) {
        //md = new MovimientoDerecha(nrd,tv, nj);
        tamTab = nj.getCasillas();
        p = new Personajes();
        Tablero ct = new Tablero(nj, this);

        this.panel = this;
        this.nj = nj;
        add(TirarDado());
        add(Dado());
        add(AtaqueDerecha());
        add(AtaqueAbajo());
        add(AtaqueArriba());
        add(AtaqueIzquierda());
        add(MoverArriba());
        add(MoverAbajo());
        add(MoverIzquierda());
        add(ct.Tablero());
        add(TextoVida1());
        add(TextoVida2());
        add(ImagenVidas1());
        add(ImagenVidas2());
        add(MoverDerecha());
        add(Tiempo());
        add(Reloj());
        add(Jugador1());
        add(Jugador2());
        add(Personajes1());
        add(Personajes2());
        add(primerPerJ1());
        add(SPersonajeJ1());
        add(TPersonajeJ1());
        add(PPersonajeJ2());
        add(SPersonajeJ2());
        add(TPersonajeJ2());
add(fondoTab());
add(TextoAtaque());
add(TextoMov());
        Inicializar();

    }

    public PanelTablero() {

    }

    public JLabel Dado() {
        lDado = new JLabel();
        lDado.setBounds(30, 520, 70, 70);
        lDado.setIcon(p.ImagenDado1());
        return lDado;
    }

    public JButton TirarDado() {
        dado = new JButton("Tirar");
        dado.setBounds(30, 600, 70, 40);
        dado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                turno++;
                Random rd = new Random();
                nrd = rd.nextInt(6) + 1;
                if (turno > 6) {
                    turno = 1;
                }

                switch (nrd) {

                    case 1:
                        lDado.setIcon(p.ImagenDado1());
                        break;
                    case 2:
                        lDado.setIcon(p.ImagenDado2());
                        break;
                    case 3:
                        lDado.setIcon(p.ImagenDado3());
                        break;
                    case 4:
                        lDado.setIcon(p.ImagenDado4());
                        break;
                    case 5:
                        lDado.setIcon(p.ImagenDado5());
                        break;
                    case 6:
                        lDado.setIcon(p.ImagenDado6());
                        break;
                }
                if (nj.ActAtack[nj.Ordenar[turno - 1] - 1]) {
                    System.out.println("dado " + nrd);
                    moverDerecha.setEnabled(true);
                    moverIzquierda.setEnabled(true);
                    moverArriba.setEnabled(true);
                    moverAbajo.setEnabled(true);
                    dado.setEnabled(false);

                } else {
                    JOptionPane.showMessageDialog(null, "pierdes el turno");
                }
                if (turno > 6) {
                    turno = 1;
                }
            }
        });
        return dado;
    }

    public void Inicializar() {

        setLayout(null);
        setSize(1300, 800);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public JLabel fondoTab() {
        pok = new ImageIcon(getClass().getResource("/Imagenes/images.jpg"));
        imagenTab = new JLabel(pok);
        imagenTab.setBounds(340, 60, 620, 620);
        return imagenTab;
    }

    public void Repintar() {
        for (int i = 0; i < tamTab; i++) {
            for (int j = 0; j < tamTab; j++) {
                if (vecL[i][j] == 1) {
                    Tablero[i][j].setIcon(p.ImagenCaballero1(tamTab));
                }
                if (vecL[i][j] == 2) {
                    Tablero[i][j].setIcon(p.ImagenMago1(tamTab));
                }
                if (vecL[i][j] == 3) {
                    Tablero[i][j].setIcon(p.ImagenPrincesa1(tamTab));
                }
                if (vecL[i][j] == 4) {
                    Tablero[i][j].setIcon(p.ImagenCaballero2(tamTab));
                }
                if (vecL[i][j] == 5) {
                    Tablero[i][j].setIcon(p.ImagenMago2(tamTab));
                }
                if (vecL[i][j] == 6) {
                    Tablero[i][j].setIcon(p.ImagenPrincesa2(tamTab));
                }
                if (vecL[i][j] == 7) {
                    Tablero[i][j].setIcon(p.ImagenBombas(tamTab));
                }
                if (vecL[i][j] == 8) {
                    Tablero[i][j].setIcon(p.ImagenVidas(tamTab));
                }
            }
        }
    }

    public JLabel Tiempo() {
        tiempo = new JLabel("Tiempo : ");
        tiempo.setBounds(60, 30, 120, 70);
        tiempo.setFont(new Font("Arial", Font.BOLD, 20));

        return tiempo;
    }

    public JLabel Reloj() {
        reloj = new JLabel(nj.getTiempo());
        reloj.setBounds(180, 30, 120, 70);
        reloj.setFont(new Font("Arial", Font.BOLD, 20));

        return reloj;
    }

    public JLabel Jugador1() {
        jug1 = new JLabel("Jugador 1 :  " + nj.getJugador1Nombre());
        jug1.setBounds(60, 90, 170, 70);
        jug1.setFont(new Font("Ariela", Font.BOLD, 15));
        return jug1;
    }

    public JLabel Personajes1() {
        personajes1 = new JLabel("Personajes : ");
        personajes1.setBounds(60, 150, 100, 40);

        return personajes1;
    }

    public JLabel Jugador2() {
        jug2 = new JLabel("Jugador 2 :  " + nj.getJugador2Nombre());
        jug2.setBounds(1050, 90, 170, 70);
        jug2.setFont(new Font("Ariela", Font.BOLD, 15));
        return jug2;
    }

    public JLabel Personajes2() {
        personajes2 = new JLabel("Personajes :");
        personajes2.setBounds(1050, 150, 100, 40);

        return personajes2;
    }

    public JLabel primerPerJ1() {
        j1p1 = new JLabel((String) nj.Guerreros[0]);
        j1p1.setBounds(60, 190, 200, 25);
        j1p1.setBorder(BorderFactory.createLineBorder(Color.red));
        return j1p1;
    }

    public JLabel SPersonajeJ1() {
        j1p2 = new JLabel((String) nj.Guerreros[2]);
        j1p2.setBounds(60, 220, 200, 25);
        j1p2.setBorder(BorderFactory.createLineBorder(Color.red));
        return j1p2;
    }

    public JLabel TPersonajeJ1() {
        j1p3 = new JLabel((String) nj.Guerreros[4]);
        j1p3.setBounds(60, 250, 200, 25);
        j1p3.setBorder(BorderFactory.createLineBorder(Color.red));
        return j1p3;
    }

    public JLabel PPersonajeJ2() {
        j2p1 = new JLabel((String) nj.Guerreros[1]);
        j2p1.setBounds(1050, 190, 200, 25);
        j2p1.setBorder(BorderFactory.createLineBorder(Color.blue));
        return j2p1;
    }

    public JLabel SPersonajeJ2() {
        j2p2 = new JLabel((String) nj.Guerreros[3]);
        j2p2.setBounds(1050, 220, 200, 25);
        j2p2.setBorder(BorderFactory.createLineBorder(Color.blue));
        return j2p2;
    }

    public JLabel TPersonajeJ2() {
        j2p3 = new JLabel((String) nj.Guerreros[5]);
        j2p3.setBounds(1050, 250, 200, 25);
        j2p3.setBorder(BorderFactory.createLineBorder(Color.blue));
        return j2p3;
    }

    public JLabel TextoVida1() {
        lVida1 = new JLabel("Vidas :");
        lVida1.setBounds(60, 290, 70, 30);
        return lVida1;
    }

    public JLabel ImagenVidas1() {
        iVida1 = new JLabel();
        iVida1.setBounds(65, 320, 150, 150);
        iVida1.setIcon(p.ImagenVidas5());
        return iVida1;
    }
    public JLabel TextoAtaque() {
        TAtack = new JLabel("Direccion de Ataque");
        TAtack.setBounds(1050, 465, 170, 30);
        return TAtack;
    }
    public JLabel TextoMov() {
        TMov = new JLabel("Direccion de Movimiento");
        TMov.setBounds(50, 465, 170, 30);
        return TMov;
    }

    public JLabel TextoVida2() {
        lVida2 = new JLabel("Vidas :");
        lVida2.setBounds(1050, 290, 70, 30);
        return lVida2;
    }

    public JLabel ImagenVidas2() {
        iVida2 = new JLabel();
        iVida2.setBounds(1100, 320, 150, 150);
        iVida2.setIcon(p.ImagenVidas5());
        return iVida2;
    }

    public JButton MoverDerecha() {
        moverDerecha = new JButton("Derecha");
        moverDerecha.setEnabled(false);
        moverDerecha.setBounds(230, 560, 110, 60);
        moverDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dado.setEnabled(true);
                moverDerecha.setEnabled(false);
                moverIzquierda.setEnabled(false);
                moverArriba.setEnabled(false);
                moverAbajo.setEnabled(false);
                MovimientoDerecha md = new MovimientoDerecha(nrd, panel, nj);
                md.start();
                System.out.println("turno " + turno);

            }
        });
        return moverDerecha;
    }

    public JButton AtaqueDerecha() {
        atacarDerecha = new JButton("Derecha");
        atacarDerecha.setEnabled(false);
        atacarDerecha.setBounds(1170, 580, 100, 40);
        atacarDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LogicaAtaques atq = new LogicaAtaques(panel, nj);
                atq.AtacarDerecha();
                atacarAbajo.setEnabled(false);
                atacarArriba.setEnabled(false);
                atacarIzquierda.setEnabled(false);
                atacarDerecha.setEnabled(false);
            }
        });
        return atacarDerecha;
    }

    public JButton MoverIzquierda() {
        moverIzquierda = new JButton("Izquierda");
        moverIzquierda.setEnabled(false);
        moverIzquierda.setBounds(120, 560, 100, 60);
        moverIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dado.setEnabled(true);
                moverIzquierda.setEnabled(false);
                moverDerecha.setEnabled(false);
                moverArriba.setEnabled(false);
                moverAbajo.setEnabled(false);
                MovimientoIzquierda mi = new MovimientoIzquierda(nrd, panel, nj);
                mi.start();
            }
        });

        return moverIzquierda;
    }

    public JButton AtaqueIzquierda() {
        atacarIzquierda = new JButton("Izquierda");
        atacarIzquierda.setEnabled(false);
        atacarIzquierda.setBounds(1060, 580, 100, 40);
        atacarIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LogicaAtaques atq = new LogicaAtaques(panel, nj);
                atq.AtacarIzquierda();
                atacarAbajo.setEnabled(false);
                atacarArriba.setEnabled(false);
                atacarIzquierda.setEnabled(false);
                atacarDerecha.setEnabled(false);
            }
        });
        return atacarIzquierda;
    }

    public JButton MoverArriba() {
        moverArriba = new JButton("Arriba");
        moverArriba.setEnabled(false);
        moverArriba.setBounds(170, 490, 110, 60);
        moverArriba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dado.setEnabled(true);
                moverIzquierda.setEnabled(false);
                moverDerecha.setEnabled(false);
                moverArriba.setEnabled(false);
                moverAbajo.setEnabled(false);
                MovimientoArriba ma = new MovimientoArriba(nrd, panel, nj);
                ma.start();
            }
        });

        return moverArriba;
    }

    public JButton AtaqueArriba() {
        atacarArriba = new JButton("Arriba");
        atacarArriba.setEnabled(false);
        atacarArriba.setBounds(1110, 530, 100, 40);
        atacarArriba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LogicaAtaques atq = new LogicaAtaques(panel, nj);
                atq.AtaqueArriba();
                atacarAbajo.setEnabled(false);
                atacarArriba.setEnabled(false);
                atacarIzquierda.setEnabled(false);
                atacarDerecha.setEnabled(false);
            }
        });
        return atacarArriba;
    }

    public JButton MoverAbajo() {
        moverAbajo = new JButton("Abajo");
        moverAbajo.setEnabled(false);
        moverAbajo.setBounds(170, 630, 110, 60);
        moverAbajo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //dado.setEnabled(true);
                moverIzquierda.setEnabled(false);
                moverDerecha.setEnabled(false);
                moverArriba.setEnabled(false);
                moverAbajo.setEnabled(false);

                MovimientoAbajo mab = new MovimientoAbajo(nrd, panel, nj);
                mab.start();
            }
        });

        return moverAbajo;
    }

    public JButton AtaqueAbajo() {
        atacarAbajo = new JButton("Abajo");
        atacarAbajo.setEnabled(false);
        atacarAbajo.setBounds(1110, 630, 100, 40);
        atacarAbajo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LogicaAtaques atq = new LogicaAtaques(panel, nj);
                atq.AtacarAbajo();
                atacarAbajo.setEnabled(false);
                atacarArriba.setEnabled(false);
                atacarIzquierda.setEnabled(false);
                atacarDerecha.setEnabled(false);
            }
        });
        return atacarAbajo;
    }
    //creacion del panel para el tablero

    public void PosicionesIniciales() {

        //primero llenar de bombas
        int cantBombas = (int) ((int) (tamTab * tamTab) * 0.1);
        int cantVidas = (int) ((int) (tamTab * tamTab) * 0.05);
        for (int i = 0; i < cantBombas; i++) {
            boolean validarB = true;
            do {
                Random ran1 = new Random();
                int iRan1 = ran1.nextInt(tamTab);
                Random ran2 = new Random();
                int iRan2 = ran2.nextInt(tamTab);
                if (vecL[iRan1][iRan2] == 0) {
                    vecL[iRan1][iRan2] = 7;

                    Tablero[iRan1][iRan2].setIcon(p.ImagenBombas(tamTab));
                    validarB = false;
                }

            } while (validarB);
        }
        for (int i = 0; i < cantVidas; i++) {
            boolean validarV = true;
            do {
                Random ran1 = new Random();
                int iRan1 = ran1.nextInt(tamTab);
                Random ran2 = new Random();
                int iRan2 = ran2.nextInt(tamTab);
                if (vecL[iRan1][iRan2] == 0) {
                    vecL[iRan1][iRan2] = 8;
                    Tablero[iRan1][iRan2].setIcon(p.ImagenVidas(tamTab));
                    validarV = false;
                }

            } while (validarV);

        }
        boolean validarP1 = true;
        do {
            Random ran1 = new Random();
            int iRan1 = ran1.nextInt(tamTab);
            Random ran2 = new Random();
            int iRan2 = ran2.nextInt(tamTab);
            if (vecL[iRan1][iRan2] == 0) {
                vecL[iRan1][iRan2] = 1;
                nj.posX[0] = iRan1;
                nj.posY[0] = iRan2;
                Tablero[iRan1][iRan2].setIcon(p.ImagenCaballero1(tamTab));
                validarP1 = false;
            }
        } while (validarP1);
        boolean validarP2 = true;
        do {
            Random ran1 = new Random();
            int iRan1 = ran1.nextInt(tamTab);
            Random ran2 = new Random();
            int iRan2 = ran2.nextInt(tamTab);
            if (vecL[iRan1][iRan2] == 0) {
                vecL[iRan1][iRan2] = 2;
                nj.posX[1] = iRan1;
                nj.posY[1] = iRan2;
                Tablero[iRan1][iRan2].setIcon(p.ImagenMago1(tamTab));
                validarP2 = false;
            }
        } while (validarP2);
        boolean validarP3 = true;
        do {
            Random ran1 = new Random();
            int iRan1 = ran1.nextInt(tamTab);
            Random ran2 = new Random();
            int iRan2 = ran2.nextInt(tamTab);
            if (vecL[iRan1][iRan2] == 0) {
                vecL[iRan1][iRan2] = 3;
                nj.posX[2] = iRan1;
                nj.posY[2] = iRan2;
                Tablero[iRan1][iRan2].setIcon(p.ImagenPrincesa1(tamTab));
                validarP3 = false;
            }
        } while (validarP3);
        boolean validar4 = true;
        do {
            Random ran1 = new Random();
            int iRan1 = ran1.nextInt(tamTab);
            Random ran2 = new Random();
            int iRan2 = ran2.nextInt(tamTab);
            if (vecL[iRan1][iRan2] == 0) {
                vecL[iRan1][iRan2] = 4;
                nj.posX[3] = iRan1;
                nj.posY[3] = iRan2;
                Tablero[iRan1][iRan2].setIcon(p.ImagenCaballero2(tamTab));
                validar4 = false;
            }
        } while (validar4);
        boolean validar5 = true;
        do {
            Random ran1 = new Random();
            int iRan1 = ran1.nextInt(tamTab);
            Random ran2 = new Random();
            int iRan2 = ran2.nextInt(tamTab);
            if (vecL[iRan1][iRan2] == 0) {
                vecL[iRan1][iRan2] = 5;
                nj.posX[4] = iRan1;
                nj.posY[4] = iRan2;
                Tablero[iRan1][iRan2].setIcon(p.ImagenMago2(tamTab));
                validar5 = false;
            }
        } while (validar5);
        boolean validar6 = true;
        do {
            Random ran1 = new Random();
            int iRan1 = ran1.nextInt(tamTab);
            Random ran2 = new Random();
            int iRan2 = ran2.nextInt(tamTab);
            if (vecL[iRan1][iRan2] == 0) {
                vecL[iRan1][iRan2] = 6;
                nj.posX[5] = iRan1;
                nj.posY[5] = iRan2;
                Tablero[iRan1][iRan2].setIcon(p.ImagenPrincesa2(tamTab));
                validar6 = false;
            }
        } while (validar6);

    }
    //valores Iniciales del Frame Principal

    public void RepintarVida() {
        switch (nj.getVidasJ2()) {
            case 0:
                iVida2.setIcon(p.ImagenVidas0());
                int gano = JOptionPane.showConfirmDialog(null, "Felicidades Ganaste  deseas jugar otra vez", "Jugar", JOptionPane.YES_NO_OPTION);
        if (gano == JOptionPane.YES_OPTION) {
            Bienvenida objeto=new Bienvenida();
            objeto.setVisible(true);
            dispose();

        } else {
            panel.dado.setEnabled(true);
        }
                break;
            case 1:
                iVida2.setIcon(p.ImagenVidas1());
                break;
            case 2:
                iVida2.setIcon(p.ImagenVidas2());
                break;
            case 3:
                iVida2.setIcon(p.ImagenVidas3());
                break;
            case 4:
                iVida2.setIcon(p.ImagenVidas4());
                break;
            case 5:
                iVida2.setIcon(p.ImagenVidas5());
                break;
            case 6:
                iVida2.setIcon(p.ImagenVidas6());
                break;
            case 7:
                iVida2.setIcon(p.ImagenVidas7());
                break;
            case 8:
                iVida2.setIcon(p.ImagenVidas8());
                break;
            case 9:
                iVida2.setIcon(p.ImagenVidas9());
                break;
            case 10:
                iVida2.setIcon(p.ImagenVidas10());
                break;
            case 11:
                iVida2.setIcon(p.ImagenVidas11());
                break;
            case 12:
                iVida2.setIcon(p.ImagenVidas12());
                

        

    
                break;
        }
        switch (nj.getVidasJ1()) {
            case 0:
                iVida1.setIcon(p.ImagenVidas0());
                int gano = JOptionPane.showConfirmDialog(null, "Felicidades Ganaste  deseas jugar otra vez", "Jugar", JOptionPane.YES_NO_OPTION);
        if (gano == JOptionPane.YES_OPTION) {
            Bienvenida objeto=new Bienvenida();
            objeto.setVisible(true);
            dispose();
            

        } else {
            panel.dado.setEnabled(true);
        }
                break;
            case 1:
                iVida1.setIcon(p.ImagenVidas1());
                break;
            case 2:
                iVida1.setIcon(p.ImagenVidas2());
                break;
            case 3:
                iVida1.setIcon(p.ImagenVidas3());
                break;
            case 4:
                iVida1.setIcon(p.ImagenVidas4());
                break;
            case 5:
                iVida1.setIcon(p.ImagenVidas5());
                break;
            case 6:
                iVida1.setIcon(p.ImagenVidas6());
                break;
            case 7:
                iVida1.setIcon(p.ImagenVidas7());
                break;
            case 8:
                iVida1.setIcon(p.ImagenVidas8());
                break;
            case 9:
                iVida1.setIcon(p.ImagenVidas9());
                break;
            case 10:
                iVida1.setIcon(p.ImagenVidas10());
                break;
            case 11:
                iVida1.setIcon(p.ImagenVidas11());
                break;
            case 12:
                iVida1.setIcon(p.ImagenVidas12());
                break;
        }
    }

}
