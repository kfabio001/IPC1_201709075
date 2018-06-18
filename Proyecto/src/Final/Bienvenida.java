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
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bienvenida extends JFrame {

    JLabel BienvenidaMensaje;
    JLabel mensaje1, nombre1, nombre2;
   
    
    JTextField nombres1, nombres2;
    
    JButton siguiente;
    JButton Salir;
    JComboBox Casillas;

    JLabel fondoB;
    ImageIcon fondoi;

    public Bienvenida() {
        add(MensajeBienvenida());
        add(NomJugador1());
        add(NomJugador2());
        add(nombre1());
        add(nombre2());
        add(TipoTablero());
        add(Box());
        add(BotonContinuar());
        add(BotonSalir());
        add(fond());
        
        Inicializar();

    }

    
    public JComboBox Box() {
        Casillas = new JComboBox();
        Casillas.addItem("8x8");
        Casillas.addItem("9x9");
        Casillas.addItem("10x10");
        Casillas.addItem("11x11");
        Casillas.addItem("12x12");
        Casillas.addItem("13x13");
        Casillas.addItem("14x14");
        Casillas.addItem("15x15");
        Casillas.addItem("16x16");
        Casillas.addItem("17x17");
        Casillas.addItem("18x18");
        Casillas.setBounds(280, 350, 70, 30);
        return Casillas;
    }

    public JLabel MensajeBienvenida() {
        BienvenidaMensaje = new JLabel("Super Mario Wars");
        BienvenidaMensaje.setBounds(90, 10, 600, 180);
        BienvenidaMensaje.setFont(new Font("Ravie", Font.BOLD, 40));

        return BienvenidaMensaje;

    }

    public JLabel fond() {
        fondoi = new ImageIcon(getClass().getResource("/Imagenes/fondoB.png"));
        fondoB = new JLabel(fondoi);

        fondoB.setBounds(0, 0, 800, 600);

        return fondoB;
    }

    public JLabel nombre1() {
        nombre1 = new JLabel("Escribe tu nombre player 1");
        nombre1.setBounds(50, 100, 200, 80);
        return nombre1;
    }

    public JLabel nombre2() {
        nombre2 = new JLabel("Escribe tu nombre player 2");
        nombre2.setBounds(400, 100, 200, 80);
        return nombre2;
    }

    public JLabel TipoTablero() {
        mensaje1 = new JLabel("Tipo de tablero ");
        mensaje1.setBounds(270, 290, 250, 80);
        return mensaje1;
    }

    public JTextField NomJugador1() {
        nombres1 = new JTextField();
        nombres1.setBounds(50, 160, 150, 30);
        return nombres1;
    }

    public JTextField NomJugador2() {
        nombres2 = new JTextField();
        nombres2.setBounds(400, 160, 150, 30);
        return nombres2;
    }

    

    public JButton BotonContinuar() {
        siguiente = new JButton("Continuar");
        siguiente.setBounds(170, 420, 100, 40);
        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Jugadores nj = new Jugadores(nombres1.getText(), nombres2.getText(), Casillas.getSelectedIndex() + 8);

                Orden vo = new Orden(nj);
                dispose();
            }
        });
        return siguiente;
    }

    public JButton BotonSalir() {
        Salir = new JButton("Salir");
        Salir.setBounds(370, 420, 100, 40);
        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        });

        return Salir;
    }
public void Inicializar() {
        setLayout(null);
        setSize(700, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
