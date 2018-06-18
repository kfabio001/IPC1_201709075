/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author FABIO SANCHEZ
 */
public class Personajes {
    
 
    public ImageIcon imagper;
    
    public ImageIcon ImagenBombas(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/bomba.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenVidas(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/hongo.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenCaballero1(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/Guerrero rojo.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenMago1(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/Mago rojo.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenPrincesa1(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/Princesa rojo.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenCaballero2(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/Guerrero azul.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenMago2(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/Mago azul.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenPrincesa2(int tamT){
        ImageIcon per= new ImageIcon(getClass().getResource("/Imagenes/Princesa azul.png"));
        Image per1 = per.getImage();
        Image imgtam = per1.getScaledInstance(600/tamT, 600/tamT, Image.SCALE_SMOOTH);
        per=new ImageIcon(imgtam);
        return per;  
    }
    public ImageIcon ImagenVidas0(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/0.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas1(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/1.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }public ImageIcon ImagenVidas2(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/2.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }public ImageIcon ImagenVidas3(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/3.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas4(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/4.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas5(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/5.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas6(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/6.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas7(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/7.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas8(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/8.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas9(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/9.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas10(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/10.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas11(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/11.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenVidas12(){
        ImageIcon vida= new ImageIcon(getClass().getResource("/Imagenes/12.png"));
        Image per1 = vida.getImage();
        Image imgtam = per1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        vida=new ImageIcon(imgtam);
        return vida; 
    }
    public ImageIcon ImagenDado1(){
        ImageIcon id1= new ImageIcon(getClass().getResource("/Imagenes/uno.jpg"));
        Image per1 = id1.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id1=new ImageIcon(imgtam);
        return id1; 
    }
    public ImageIcon ImagenDado2(){
        ImageIcon id2= new ImageIcon(getClass().getResource("/Imagenes/dos.jpg"));
        Image per1 = id2.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id2=new ImageIcon(imgtam);
        return id2; 
    }
    public ImageIcon ImagenDado3(){
        ImageIcon id3= new ImageIcon(getClass().getResource("/Imagenes/tres.jpg"));
        Image per1 = id3.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id3=new ImageIcon(imgtam);
        return id3; 
    }
    public ImageIcon ImagenDado4(){
        ImageIcon id4= new ImageIcon(getClass().getResource("/Imagenes/cuatro.jpg"));
        Image per1 = id4.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id4=new ImageIcon(imgtam);
        return id4; 
    }
    public ImageIcon ImagenDado5(){
        ImageIcon id5= new ImageIcon(getClass().getResource("/Imagenes/cinco.jpg"));
        Image per1 = id5.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id5=new ImageIcon(imgtam);
        return id5; 
    }
    public ImageIcon ImagenDado6(){
        ImageIcon id6= new ImageIcon(getClass().getResource("/Imagenes/seis.jpg"));
        Image per1 = id6.getImage();
        Image imgtam = per1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        id6=new ImageIcon(imgtam);
        return id6; 
    }
}
