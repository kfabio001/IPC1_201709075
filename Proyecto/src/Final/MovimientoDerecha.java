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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author FABIO SANCHEZ
 */
public class MovimientoDerecha extends Thread{
    
    public PanelTablero panel;
    public Jugadores nombrej;
    public int cantidad=0;
    public int a=0,b=0;

    public MovimientoDerecha() {
        
    }

    public MovimientoDerecha(int cantidad,PanelTablero panel, Jugadores nombrej) {
        this.cantidad=cantidad;
        this.panel = panel;
        this.nombrej = nombrej;
    }
    public boolean Comprobar(){
        if(b>=panel.tamTab-1)return true;
        
        return false;
    }
    public void MoverDer(int cantidad){
        
        b=0;
        boolean seguir=true;
        do{
            
            for(int i = 0; i <panel.tamTab;i++){
                for(int j =0; j <panel.tamTab;j++){
                    if(nombrej.Ordenar[panel.turno-1]==panel.vecL[i][j]){
                        a=i;
                        b=j;
                        seguir=false;
                        
                    }
                }
            }
        }while(seguir);
        if(cantidad <=0){
            if(nombrej.Ordenar[panel.turno-1]!=3 ||nombrej.Ordenar[panel.turno-1]!=6){
            atacar();
            return;
            }else{
                        LogicaAtaques atq = new LogicaAtaques(panel, nombrej);
                        atq.AtaquePrincesa();
            }
        }
        if(Comprobar()){
            cantidad=0;
            panel.vecL[a][b]=0;
            panel.Tablero[a][b].setIcon(null);
            System.out.println(panel.vecL[a][b]);
            panel.Repintar();
            if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
            panel.RepintarVida();
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
                if(panel.vecL[a][b+1]==0){
                    mover1();
                    cantidad--;
                    
                }else if(panel.vecL[a][b+1]==7 && cantidad<=1){
                    
                    if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                    panel.RepintarVida();
                    mover1();
                    cantidad--;
                    
                    
                }else if(panel.vecL[a][b+1]==7 && cantidad>1){
                    
                    mover1();
                    cantidad--;
                    Thread.sleep(50);
                    
                    if(Comprobar()){
                        cantidad=0;
                        panel.vecL[a][b]=7;
                        panel.Tablero[a][b].setIcon(null);
                        panel.Repintar();
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                        panel.RepintarVida();
                        Caracol();
                        if(nombrej.Ordenar[panel.turno-1]!=3 ||nombrej.Ordenar[panel.turno-1]!=6){
            atacar();
            return;
            }else{
                        LogicaAtaques atq = new LogicaAtaques(panel, nombrej);
                        atq.AtaquePrincesa();
            }
                        
                    }else if(panel.vecL[a][b+1]==8 && cantidad<=1){
                        mover1();
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()+1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()+1);}
                        panel.RepintarVida();
                        panel.vecL[a][b-1]=7;
                        panel.Repintar();
                        cantidad--;
                        Thread.sleep(50);
                    }else if(panel.vecL[a][b+1]==8 && cantidad>1){
                        mover1();
                        panel.vecL[a][b-1]=7;
                        panel.Repintar();
                        cantidad--;
                        Thread.sleep(50);
                        mover1();
                        panel.vecL[a][b-1]=8;
                        panel.Repintar();
                        cantidad--;
                    }else if(panel.vecL[a][b+1]==7 && cantidad<=1){
                         mover1();
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                        panel.RepintarVida();
                        panel.vecL[a][b-1]=7;
                        panel.Repintar();
                        cantidad--;
                        Thread.sleep(50);
                    }else if(panel.vecL[a][b+1]==7 && cantidad>1){
                        mover1();
                        panel.vecL[a][b-1]=7;
                        panel.Repintar();
                        cantidad--;
                        Thread.sleep(50);
                        mover1();
                        panel.vecL[a][b-1]=7;
                        panel.Repintar();
                        cantidad--;
                    }else{
                        mover1();
                        cantidad--;
                        panel.vecL[a][b-1]=7;
                        panel.Repintar();
                    }
                    
                }else if(panel.vecL[a][b+1]==8 && cantidad<=1){
                    
                    if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()+1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()+1);}
                    panel.RepintarVida();
                    panel.vecL[a][b]=0;
                    panel.Tablero[a][b].setIcon(null);
                    panel.Repintar();
                    
                    b= b+1;
                    panel.vecL[a][b]=nombrej.Ordenar[panel.turno-1];
                    panel.Repintar();
                    cantidad--;
                    
                    
                }else if(panel.vecL[a][b+1]==8 && cantidad>1){
                    mover1();
                    cantidad--;
                    Thread.sleep(50);
                    if(Comprobar()){
                        cantidad=0;
                        panel.vecL[a][b]=7;
                        panel.Tablero[a][b].setIcon(null);
                        panel.Repintar();
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                        panel.RepintarVida();
                        Caracol();
                        if(nombrej.Ordenar[panel.turno-1]!=3 ||nombrej.Ordenar[panel.turno-1]!=6){
            atacar();
            return;
            }else{
                        LogicaAtaques atq = new LogicaAtaques(panel, nombrej);
                        atq.AtaquePrincesa();
            }
                       
                    }else if(panel.vecL[a][b+1]==8 && cantidad<=1){
                        mover1();
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()+1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()+1);}
                        panel.RepintarVida();
                        panel.vecL[a][b-1]=8;
                        panel.Repintar();
                        cantidad--;
                        Thread.sleep(50);
                    }else if(panel.vecL[a][b+1]==8 && cantidad>1){
                        mover1();
                        panel.vecL[a][b-1]=8;
                        panel.Repintar();
                        cantidad--;
                        Thread.sleep(50);
                        mover1();
                        panel.vecL[a][b-1]=8;
                        panel.Repintar();
                        cantidad--;
                    }else if(panel.vecL[a][b+1]==7 && cantidad<=1){
                         mover1();
                        if(panel.turno==1||panel.turno==3||panel.turno==5){nombrej.setVidasJ1(nombrej.getVidasJ1()-1);}else{nombrej.setVidasJ2(nombrej.getVidasJ2()-1);}
                        panel.RepintarVida();
                        panel.vecL[a][b-1]=8;
                        panel.Repintar();
                        cantidad--;
                        Thread.sleep(50);
                    }else if(panel.vecL[a][b+1]==7 && cantidad>1){
                        mover1();
                        panel.vecL[a][b-1]=8;
                        panel.Repintar();
                        cantidad--;
                        Thread.sleep(50);
                        mover1();
                        panel.vecL[a][b-1]=7;
                        panel.Repintar();
                        cantidad--;
                    }else{
                        mover1();
                        cantidad--;
                        panel.vecL[a][b-1]=7;
                        panel.Repintar();
                    }
                    
                }else{
                     Random selec = new Random();
                    int nr  = selec.nextInt(2);
                    if(nr==0){
                        MovimientoArriba ar = new MovimientoArriba(cantidad, panel, nombrej);
                        System.out.println("Arriba");
                        ar.start();
                    }else{
                        MovimientoAbajo ab = new MovimientoAbajo(cantidad, panel, nombrej);
                        System.out.println("Abajo");
                        ab.start();
                    }
                    cantidad = 0;
                }
                
                
                Thread.sleep(50);
                MoverDer(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(MovimientoDerecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void run(){
        MoverDer(cantidad);
    }
    public void Caracol(){
        int c,d,e,f,g;
            boolean encontrado=false;
            c=(panel.tamTab-1)/2;
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
    public void mover1(){
        panel.vecL[a][b]=0;
            panel.Tablero[a][b].setIcon(null);
                    panel.Repintar();
                    b= b+1;
                    panel.vecL[a][b]=nombrej.Ordenar[panel.turno-1];
                    panel.Repintar();
    }
    public void atacar(){
                
                int resp = JOptionPane.showConfirmDialog(null, "Desea Atacar", "Atacar",JOptionPane.YES_NO_OPTION);
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

