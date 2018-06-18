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
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Orden extends JFrame{
    
    JLabel nombreJug1;
    JLabel nombreJug2;
    JComboBox seleccionar1;
    JComboBox seleccionar2;
    JLabel jugPer1;
    JLabel jugPer2;
    JLabel jugPer3;
    JLabel jugPer11;
    JLabel jugPer22;
    JLabel jugPer33;
    JButton agregar1;
    JButton agregar2;
    JButton siguiente;
    JButton jugar;
    int index1 = 0;
    int index2 = 0;
    RelojSalida to;
    Jugadores nj;
    PanelTablero tv ;
    
    
     
    
    public Orden(Jugadores nj) {
        
        this.nj = nj;
        
        add(cBox1());
        add(cBox2());
        add(Jugador1());
        add(Jugador2());
        add(J1P1());
        add(J1P2());
        add(J1P3());
        add(Agregar1());
        add(J2P1());
        add(J2P2());
        add(J2P3());
        add(Agregar2());
        add(Jugar());
        
        
        Inicializar();
        //NombresJugadores nj = new NombresJugadores() ;
        
    }
    
    
    public JLabel Jugador1(){
        nombreJug1 = new JLabel("Jugador 1 : "+ nj.getJugador1Nombre() +" Elije a tus personajes");
        nombreJug1.setBounds(20, 50, 260, 30);
        return nombreJug1;
    }
    public JLabel J1P1(){
        jugPer1 = new JLabel();
        jugPer1.setBorder(BorderFactory.createLineBorder(Color.red));
        jugPer1.setBounds(20, 90, 200, 30);
        return jugPer1;
    }
    public JLabel J1P2(){
        jugPer2 = new JLabel();
        jugPer2.setBorder(BorderFactory.createLineBorder(Color.red));
       jugPer2.setBounds(20, 130, 200, 30);
        return jugPer2;
    }
    public JLabel J1P3(){
        jugPer3 = new JLabel();
        jugPer3.setBorder(BorderFactory.createLineBorder(Color.red));
        jugPer3.setBounds(20, 170, 200, 30);
        return jugPer3;
    }
    public JButton Agregar1(){
        
        agregar1 = new JButton("Agregar");
        agregar1.setBounds(250, 160, 100, 30);
        agregar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                switch (index1){
                    case 0:
                        if(seleccionar1.getSelectedItem() == "Guerrero Mario Rojo"){
                            jugPer1.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.Guerreros[0] = jugPer1.getText();
                            nj.Ordenar[0] = 1;
                            
                        }else if(seleccionar1.getSelectedItem() == "Mago Mario Rojo"){
                            jugPer1.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.Guerreros[0] = jugPer1.getText();
                            nj.Ordenar[0] = 2;
                            
                        }else if(seleccionar1.getSelectedItem() == "Princesa Peach Roja"){
                            jugPer1.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.Guerreros[0] = jugPer1.getText();
                            nj.Ordenar[0] = 3;
                            
                        }
                        index1++;
                        break;
                    case 1:
                        if(seleccionar1.getSelectedItem() == "Guerrero Mario Rojo"){
                            jugPer2.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.Guerreros[2] = jugPer2.getText();
                            nj.Ordenar[2] = 1;
                            index1++;
                        }else if(seleccionar1.getSelectedItem() == "Mago Mario Rojo"){
                            jugPer2.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.Guerreros[2] = jugPer2.getText();
                            nj.Ordenar[2] = 2;
                            index1++;
                        }else if(seleccionar1.getSelectedItem() == "Princesa Peach Roja"){
                            jugPer2.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.Guerreros[2] = jugPer2.getText();
                            nj.Ordenar[2] = 3;
                            index1++;
                        }
                        break;
                    case 2:
                        if(seleccionar1.getSelectedItem() == "Guerrero Mario Rojo"){
                            jugPer3.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.Guerreros[4] = jugPer3.getText();
                            nj.Ordenar[4] = 1;
                            index1++;
                        }else if(seleccionar1.getSelectedItem() == "Mago Mario Rojo"){
                            jugPer3.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.Guerreros[4] = jugPer3.getText();
                            nj.Ordenar[4] = 2;
                            index1++;
                        }else if(seleccionar1.getSelectedItem() == "Princesa Peach Roja"){
                            jugPer3.setText((String)seleccionar1.getSelectedItem());
                            seleccionar1.removeItemAt(seleccionar1.getSelectedIndex());
                            nj.Guerreros[4] = jugPer3.getText();
                            nj.Ordenar[4] = 3;
                            index1++;
                        }

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Solo tres personajes");
                        
                }
            }
        });
        return agregar1;
    }
    public JLabel J2P1(){
        jugPer11 = new JLabel();
        jugPer11.setBorder(BorderFactory.createLineBorder(Color.blue));
        jugPer11.setBounds(530, 90, 200, 30);
        return jugPer11;
    }
    public JLabel J2P2(){
        jugPer22 = new JLabel();
        jugPer22.setBorder(BorderFactory.createLineBorder(Color.blue));
        jugPer22.setBounds(530, 130, 200, 30);
        return jugPer22;
    }
    public JLabel J2P3(){
        jugPer33 = new JLabel();
        jugPer33.setBorder(BorderFactory.createLineBorder(Color.blue));
        jugPer33.setBounds(530, 170, 200, 30);
        return jugPer33;
    }
    public JButton Agregar2(){
        agregar2 = new JButton("Agregar");
        agregar2.setBounds(750, 160, 100, 30);
        agregar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switch (index1){
                   case 3:
                        if(seleccionar2.getSelectedItem() == "Guerrero Mario Azul"){
                            jugPer11.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.Guerreros[1] = jugPer11.getText();
                            nj.Ordenar[1] = 4;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Mago Mario Azul"){
                            jugPer11.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.Guerreros[1] = jugPer11.getText();
                            nj.Ordenar[1] = 5;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Princesa Peach Azul"){
                            jugPer11.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.Guerreros[1] = jugPer11.getText();
                            nj.Ordenar[1] = 6;
                            index1++;
                        }
                        break;
                    case 4:
                        if(seleccionar2.getSelectedItem() == "Guerrero Mario Azul"){
                            jugPer22.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.Guerreros[3] = jugPer22.getText();
                            nj.Ordenar[3] = 4;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Mago Mario Azul"){
                            jugPer22.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.Guerreros[3] = jugPer22.getText();
                            nj.Ordenar[3] = 5;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Princesa Peach Azul"){
                            jugPer22.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.Guerreros[3] = jugPer22.getText();
                            nj.Ordenar[3] = 6;
                            index1++;
                        }
                        break;
                    case 5:
                        if(seleccionar2.getSelectedItem() == "Guerrero Mario Azul"){
                            jugPer33.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.Guerreros[5] = jugPer33.getText();
                            nj.Ordenar[5] = 4;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Mago Mario Azul"){
                            jugPer33.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.Guerreros[5] = jugPer33.getText();
                            nj.Ordenar[5] = 5;
                            index1++;
                        }else if(seleccionar2.getSelectedItem() == "Princesa Peach Azul"){
                            jugPer33.setText((String)seleccionar2.getSelectedItem());
                            seleccionar2.removeItemAt(seleccionar2.getSelectedIndex());
                            nj.Guerreros[5] = jugPer33.getText();
                            //System.out.println(nj.strPersonajes[5]);
                            nj.Ordenar[5] = 6;
                            index1++;
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Solo tres personajes");
                        
                }
            }
        });
        return agregar2;
    }
    public JLabel Jugador2(){
        nombreJug2 = new JLabel("Jugador 2 : "+ nj.getJugador2Nombre()+" Elije a tus personajes");
        nombreJug2.setBounds(530, 50, 260, 30);
        return nombreJug2;
    }
    public JButton Jugar(){
        jugar = new JButton("PLAY");
        jugar.setBounds(465, 250, 70, 70);
        jugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(jugPer3.getText()!= "" && jugPer33.getText()!=""){
                    
                    tv = new PanelTablero(nj);
                    
                    to = new RelojSalida(nj,tv);
                    to.start(0, 1000);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Debe ingresar el orden de todos sus personajes");
                }
            }
        });
        return jugar;
    }
    public JComboBox cBox1(){
        seleccionar1 = new JComboBox();
        seleccionar1.addItem("Guerrero Mario Rojo");
        seleccionar1.addItem("Mago Mario Rojo");
        seleccionar1.addItem("Princesa Peach Roja");
        seleccionar1.setBounds(250, 90, 200, 40);
        return seleccionar1;
    }
    public JComboBox cBox2(){
        seleccionar2 = new JComboBox();
        seleccionar2.addItem("Guerrero Mario Azul");
        seleccionar2.addItem("Mago Mario Azul");
        seleccionar2.addItem("Princesa Peach Azul");
        seleccionar2.setBounds(750, 90, 200, 40);
        
        return seleccionar2;
    }
    public void Inicializar(){
        setLayout(null);
        setSize(1000, 380);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
