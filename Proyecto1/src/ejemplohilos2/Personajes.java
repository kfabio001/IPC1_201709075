/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohilos2;

import com.sun.javafx.scene.control.skin.Utils;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author FABIO SANCHEZ
 */
public class Personajes {
    public int posper=0;
    public ImageIcon imgper;
    
    public ImageIcon obtenerImagen(int tamx){
        ImageIcon per = new ImageIcon(getClass().getResource("/Imagenes/pikachu.png"));
        Image per1=per.getImage();
        Image imgtam = per1.getScaledInstance(150, tamx, Image.SCALE_SMOOTH);
        per = new ImageIcon(imgtam);
        return per;
    }
}
