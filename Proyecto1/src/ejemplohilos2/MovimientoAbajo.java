/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohilos2;

/**
 *
 * @author FABIO SANCHEZ
 */
import java.util.logging.Level;
import java.util.logging.Logger;

    public class MovimientoAbajo extends Thread {
   public int cant=0;
    public Tablero tab=null;
    
    public MovimientoAbajo(int cantidad,Tablero tablero){
        this.cant=cantidad;
        this.tab=tablero;
    }
    
    public boolean comprobar(){
        if(tab.per.posper>=tab.tam-1){
            return true;
        }
        return false;
    }
    
    public void MoverAbajo(int cantidad){
        if(cantidad<=0){
            return;
        }
        if(comprobar()){
            //regresamos el personaje a la posicion 0
            cantidad=0;
            tab.vecL[tab.tam-1]=0;
            tab.vecG[tab.tam-1].setIcon(null);
            tab.per.posper=0;
            tab.vecL[0]=1;
            tab.repintar();
            return;
        }else{
            try {
                //mover una poscicion
                tab.vecL[tab.per.posper]=0;
                tab.vecG[tab.per.posper].setIcon(null);
                tab.repintar();
                tab.per.posper+=1;
                tab.vecL[tab.per.posper]=1;
                tab.repintar();
                cantidad --;
                Thread.sleep(900);
                MoverAbajo(cantidad);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MovimientoAbajo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public void run(){
        MoverAbajo(cant);
    }
}
    
    

