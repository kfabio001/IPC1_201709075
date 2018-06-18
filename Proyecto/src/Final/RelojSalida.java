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
    Jugadores nombrej;
    PanelTablero panel;
    
    
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
                
                nombrej.setTiempo(display.PrintTime(minutos, segundos, nombrej));
                //System.out.println(nj.getTiempo());
                panel.reloj.setText(nombrej.getTiempo());
                
            }
            
        }
    };

    RelojSalida(Jugadores nombrej, PanelTablero panel) {
        timer = new Timer();
        display = new Reloj();
        this.nombrej=nombrej;
        this.panel = panel;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void start(int timeout, int interval){
        timer.schedule(task, timeout, interval);
    }
}  

