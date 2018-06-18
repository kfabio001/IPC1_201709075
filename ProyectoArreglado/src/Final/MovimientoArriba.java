/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author FABIO SANCHEZ
 */
public class MovimientoArriba extends Thread{
   
    public PanelTablero panel;
    public Jugadores nombrej;
    public int cantidad=0;
    public int a=0,b=0;

    public MovimientoArriba(int cantidad,PanelTablero panel, Jugadores nombrej) {
        this.panel = panel;
        this.nombrej = nombrej;
        this.cantidad = cantidad;
        
    }

    
    public boolean Comprobar(){
        
        if(a<=0)return true;
        return false;
    }
    public void MoverAba(int cantidad){
        
        a=0;
        boolean seguir=true;
        do{
            
            for(int i = 0; i <panel.tamT;i++){
                for(int j =0; j <panel.tamT;j++){
                    if(nombrej.Ordenar[panel.turno-1]==panel.vecL[i][j]){
                        a=i;
                        b=j;
                        seguir=false;
                        
                    }
                }
            }
        }while(seguir);
        
        //compruebo que el valor de los movimientos sea mayor a sero para que l jugador se siga moviendo
        if(cantidad <=0){
            if(nombrej.Ordenar[panel.turno-1]!=3 ||nombrej.Ordenar[panel.turno-1]!=6){
            atacar();
            return;
            }else{
                        LogicaAtaques atq = new LogicaAtaques(panel, nombrej);
                        atq.AtaquePrincesa();
            }
        }
        //compruebode que el personaje no se salga del tablero 
        //si se sale es devuelto al centro y se le resta una vida al jugador en turno
        if(Comprobar()){
            
            cantidad=0;
            panel.vecL[a][b]=0;
            panel.lTablero[a][b].setIcon(null);
            System.out.println(panel.vecL[a][b]);
             if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                    panel.RepintarVida();
            panel.Repintar();
            Caracol();
           if(nombrej.Ordenar[panel.turno-1]!=3 ||nombrej.Ordenar[panel.turno-1]!=6){
            atacar();
            return;
            }else{
                        LogicaAtaques atq = new LogicaAtaques(panel, nombrej);
                        atq.AtaquePrincesa();
            }
            
            /*aqui debo poner el codigo para que el personaje sea colocado en el centro de tablero y 
            si encuentra un espacio diferente de cero debe hacer una espiral hasta encontrar un lugar en */
        }else{
            try {
                //si el espacio siguiente a la posicion actual esta basio se movera un espacio
                if(panel.vecL[a-1][b]==0){
                    Mover1();
                    cantidad--;
                    
                //si en la posicion siguiente se encuentra una bomba y en su movimiento le queda solo uno entonces el personaje caera en una bomba
                //y perdera un vida
                }else if(panel.vecL[a-1][b]==7 && cantidad<=1){
                    if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                    panel.RepintarVida();
                    Mover1();
                    cantidad--;
                    
                //comprueba si el personaje va a pasar por ensima de una bomba  
                }else if(panel.vecL[a-1][b]==7 && cantidad>1){
                    Mover1();
                    cantidad--;
                    Thread.sleep(50);
                    if(Comprobar()){
                        cantidad=0;
                         panel.vecL[a][b]=7;
                        panel.lTablero[a][b].setIcon(null);
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                        panel.RepintarVida();
                        panel.Repintar();
                        Caracol(); 
                       if(nombrej.Ordenar[panel.turno-1]!=3 ||nombrej.Ordenar[panel.turno-1]!=6){
            atacar();
            return;
            }else{
                        LogicaAtaques atq = new LogicaAtaques(panel, nombrej);
                        atq.AtaquePrincesa();
            }
                    }else if(panel.vecL[a-1][b]==7 && cantidad<=1){
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                        panel.RepintarVida();
                        Mover1(); 
                        panel.vecL[a+1][b]=7;
                        panel.Repintar();
                        cantidad--;
                        
                    }else if(panel.vecL[a-1][b]==7 && cantidad >1){
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=7;
                        panel.Repintar();
                        Thread.sleep(50);
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=7;
                        panel.Repintar();
                        Thread.sleep(50);
                    }else if(panel.vecL[a-1][b]==8 && cantidad<=1){
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()+1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()+1);}
                        panel.RepintarVida();
                        
                        Mover1();
                        panel.vecL[a+1][b]=7;
                        panel.Repintar();
                        cantidad--;
                        
                    }else if(panel.vecL[a-1][b]==8 && cantidad >1){
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=8;
                        panel.Repintar();
                        Thread.sleep(50);
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=7;
                        panel.Repintar();
                        Thread.sleep(50);
                    }else{
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=7;
                        panel.Repintar();
                    }
                    
                }else if(panel.vecL[a-1][b]==8 && cantidad<=1){
                    
                    if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()+1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()+1);}
                    panel.RepintarVida();
                    Mover1();
                    cantidad--;
                    
                    
                    
                }else if(panel.vecL[a-1][b]==8 && cantidad>1){
                    Mover1();
                    cantidad--;
                    Thread.sleep(50);
                    if(Comprobar()){
                        cantidad=0;
                        panel.vecL[a][b]=8;
                        panel.lTablero[a][b].setIcon(null);
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                        panel.RepintarVida();
                        panel.Repintar();
                        Caracol(); 
                       if(nombrej.Ordenar[panel.turno-1]!=3 ||nombrej.Ordenar[panel.turno-1]!=6){
            atacar();
            return;
            }else{
                        LogicaAtaques atq = new LogicaAtaques(panel, nombrej);
                        atq.AtaquePrincesa();
            }
                    }else if(panel.vecL[a-1][b]==7 && cantidad<=1){
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                        panel.RepintarVida();
                        Mover1(); 
                        panel.vecL[a+1][b]=8;
                        panel.Repintar();
                        cantidad--;
                        
                    }else if(panel.vecL[a-1][b]==7 && cantidad >1){
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=8;
                        panel.Repintar();
                        Thread.sleep(50);
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=7;
                        panel.Repintar();
                        Thread.sleep(50);
                    }else if(panel.vecL[a-1][b]==8 && cantidad<=1){
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()+1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()+1);}
                        panel.RepintarVida();
                        Mover1(); 
                        panel.vecL[a+1][b]=8;
                        panel.Repintar();
                        cantidad--;
                    }else if(panel.vecL[a-1][b]==8 && cantidad >1){
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=8;
                        panel.Repintar();
                        Thread.sleep(50);
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=8;
                        panel.Repintar();
                        Thread.sleep(50);
                    }else{
                        Mover1();
                        cantidad--;
                        panel.vecL[a+1][b]=8;
                        panel.Repintar();
                    }
                }else{
                    Random selec = new Random();
                    int nr  = selec.nextInt(2);
                    if(nr==0){
                        MovimientoDerecha md = new MovimientoDerecha(cantidad, panel, nombrej);
                        System.out.println("derecha");
                        md.start();
                    }else{
                        MovimientoIzquierda mi = new MovimientoIzquierda(cantidad, panel, nombrej);
                        System.out.println("Izquierda");
                        mi.start();
                    }
                    cantidad=0;
                }
                
                
                Thread.sleep(50);
                MoverAba(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(MovimientoDerecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void run(){
        MoverAba(cantidad);
    }
    public void Caracol(){
        int c,d,e,f,g;
            boolean encontrado=false;
            c=(panel.tamT)/2;
            d=c;
            e=c;
            do{
                f=e;
                for(g = d;g>= e-1;g--){
                    if(!encontrado){
                        if(panel.vecL[g][f]==0){
                            panel.vecL[g][f]=nombrej.Ordenar[panel.turno-1];
                            panel.vecL[a][b]=0;
                            panel.Repintar();
                            encontrado=true;
                        }
                    }
                }
                g++;
                for(f = g+2;f<= d+1;f++){
                    if(!encontrado){
                        if(panel.vecL[g][f]==0){
                            panel.vecL[g][f]=nombrej.Ordenar[panel.turno-1];
                            panel.vecL[a][b]=0;
                            panel.Repintar();
                            encontrado=true;
                        }
                    }
                }
                f--;
                for(g = e;g<= d+1;g++){
                    if(!encontrado){
                        if(panel.vecL[g][f]==0){
                            panel.vecL[g][f]=nombrej.Ordenar[panel.turno-1];
                            panel.vecL[a][b]=0;
                            panel.Repintar();
                            encontrado=true;
                        }
                    }
                }
                g--;
                for(f = d;f>= e;f--){
                    if(!encontrado){
                        if(panel.vecL[g][f]==0){
                            panel.vecL[g][f]=nombrej.Ordenar[panel.turno-1];
                            panel.vecL[a][b]=0;
                            panel.Repintar();
                            encontrado=true;
                        }
                    }
                }
                d++;
                e--;
            }while(!encontrado);
    }
    public void Mover1(){
        panel.vecL[a][b]=0;
        panel.lTablero[a][b].setIcon(null);
        panel.Repintar(); 
        a= a-1;
        panel.vecL[a][b]=nombrej.Ordenar[panel.turno-1];
        panel.Repintar();
        //cantidad--;
    }
    public void atacar(){
        
                int resp = JOptionPane.showConfirmDialog(null, "Deseas Atacar", "Atacar",JOptionPane.YES_NO_OPTION);
                if(resp== JOptionPane.YES_OPTION){
                    System.out.println("Puede atacar");
                   
                    panel.atacarAbajo.setEnabled(true);
                    panel.atacarArriba.setEnabled(true);
                    panel.atacarDerecha.setEnabled(true);
                    panel.atacarIzquierda.setEnabled(true);
                    
                }else{
                    panel.dado.setEnabled(true);
                }
            
            
    }
}

    

