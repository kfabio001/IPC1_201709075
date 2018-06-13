
package ejemplohilos2;

/**
 *
 * @author FABIO SANCHEZ
 */
import java.util.logging.Level;
import java.util.logging.Logger;


public class Movimiento extends Thread{
    public int cantidad=0;
    public Tablero tab=null;
    
    public Movimiento(int cantidad,Tablero tablero){
        this.cantidad=cantidad;
        this.tab=tablero;
    }
    
    public boolean comprobar(){
        if(tab.per.posper>=tab.tam-1){
            return true;
        }
        return false;
    }
    
    public void moverArriba(int cantidad){
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
                tab.per.posper-=1;
                tab.vecL[tab.per.posper]=1;
                tab.repintar();
                cantidad --;
                Thread.sleep(900);
                moverArriba(cantidad);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public void run(){
        moverArriba(cantidad);
    }
}
    