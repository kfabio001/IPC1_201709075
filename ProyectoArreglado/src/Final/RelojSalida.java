/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author FABIO SANCHEZ
 */
public class RelojSalida {
    
  	   
    private int minutos = 5;
    private int segundos =0;
    private Timer timer;
    private boolean isTimerRunning;
    private Reloj display;
    Jugadores nj;
    PanelTablero tv;
    
    
    //public TimeOut (NombresJugadores nj, TableroVentana tv){
    
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            isTimerRunning = true;
            if(segundos >0){
                segundos--;
            }else{
                segundos = 59;
                if(minutos > 0)minutos--;
                else{
                    isTimerRunning = false;
                    timer.cancel();
                    timer.purge();
                }
                    
            }
            if(isTimerRunning){
                
                nj.setTiempo(display.PrintTime(minutos, segundos, nj));
                //System.out.println(nj.getTiempo());
                tv.cronometro.setText(nj.getTiempo());
                
            }
            
        }
    };

    RelojSalida(Jugadores nj, PanelTablero tv) {
        timer = new Timer();
        display = new Reloj();
        this.nj=nj;
        this.tv = tv;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void start(int timeout, int interval){
        timer.schedule(task, timeout, interval);
    }
}  

