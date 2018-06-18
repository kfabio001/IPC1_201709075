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
public class Jugadores {

    public int getVidasJ1() {
        return VidasJ1;
    }

    public void setVidasJ1(int VidasJ1) {
        this.VidasJ1 = VidasJ1;
    }

    public int getVidasJ2() {
        return VidasJ2;
    }

    public void setVidasJ2(int VidasJ2) {
        this.VidasJ2 = VidasJ2;
    }
    public String[] Guerreros;
    public int[] Ordenar;
    private int VidasJ1;
    private int VidasJ2;

    public String getJugador1Nombre() {
        return Jugador1Nombre;
    }

    public void setJugador1Nombre(String Jugador1Nombre) {
        this.Jugador1Nombre = Jugador1Nombre;
    }

    public String getJugador2Nombre() {
        return Jugador2Nombre;
    }

    public void setJugador2Nombre(String Jugador2Nombre) {
        this.Jugador2Nombre = Jugador2Nombre;
    }

    public int getCasillas() {
        return Casillas;
    }

    public void setCasillas(int Casillas) {
        this.Casillas = Casillas;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public Jugadores(String Jugador1Nombre, String Jugador2Nombre, int Casillas) {
        posX = new int[6];
        posY = new int[6];
        ActAtack = new boolean[6];
        for (int i = 0; i < 6; i++) {
            ActAtack[i] = true;
        }
        VidasJ1 = 5;
        VidasJ2 = 5;
        this.Jugador1Nombre = Jugador1Nombre;
        this.Jugador2Nombre = Jugador2Nombre;
        this.Casillas = Casillas;
        Guerreros = new String[6];
        Ordenar = new int[6];
    }

    public Jugadores() {
    }

    private String Jugador1Nombre;
    private String Jugador2Nombre;

    public int[] posX;
    public int[] posY;
    private int Casillas;
    private String tiempo;
    public boolean[] ActAtack;
}
