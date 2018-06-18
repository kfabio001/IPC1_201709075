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
public class Reloj {
    
public String PrintTime(int minut, int second, Jugadores nj){
        String fullHour = "";
        
        fullHour += (minut > 9 )? minut : "0" + minut;
        fullHour += (second > 9 )? ":"+second: ":0"+second;
        
        
        return fullHour;
        //cronometro.updateUI();
    }
    
    
}