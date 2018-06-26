/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

import java.util.Random;

/**
 *
 * @author FABIO SANCHEZ
 */
public class Generar {

    int ImprimirTurno = 1;
    int TotalTurnos = 1;
    int NoAvion = 1;
    int TipoAvion;
    int Pasajeros;
    int Maletas;
    int Documentos;
    int Desabordaje;
    int Mantenimiento;
    String tipoS;

    int NPasajero = 1;
int NMaletas=1;
    public void generarTipo() {

        while (TotalTurnos != 0) {
            Random tipo = new Random();
            TipoAvion = (int) (tipo.nextInt(3) + 1);
            
            System.out.println("-------------Turno " + ImprimirTurno+"------------------");
            
            if (TipoAvion == 1) {
                Random pasaj = new Random();
                Pasajeros = (int) (pasaj.nextInt(6) + 5);

                Random mant = new Random();
                Mantenimiento = (int) (mant.nextInt(3) + 1);
                tipoS = "pequeno";
                Desabordaje = 1;

                ListaPersona lp = new ListaPersona();
                lp.insertarFinalAvion(NoAvion, tipoS, Pasajeros, Desabordaje, Mantenimiento);
                lp.recorrerAvion();

                System.out.println("-------PASAJEROS-------");
                for (int i = 1; i <= Pasajeros; i++) {
                    Random male = new Random();
                    Maletas = (int) (male.nextInt(4) + 1);
                    Random doc = new Random();
                    Documentos = (int) (doc.nextInt(10) + 1);

                    ColaPasajeros lpj = new ColaPasajeros();
                    lpj.insertarFinalPasajeros(NPasajero, Maletas, Documentos);

                    lpj.recorrerPasajeros();
                    NPasajero++;
                    

                }
                System.out.println("-------Maletas-------");
                for (int i = 1; i <= Maletas; i++) {
                    ListaCirMalestas lcm = new ListaCirMalestas();
                    lcm.insertarMalestasInicio(NMaletas);
                    NMaletas++;
                }

            } else {
                if (TipoAvion == 2) {

                    Random pasaj = new Random();
                    Pasajeros = (int) (pasaj.nextInt(11) + 15);
                    Random mant = new Random();
                    Mantenimiento = (int) (mant.nextInt(3) + 2);

                    Desabordaje = 2;
                    tipoS = "mediano";
                    ListaPersona lp = new ListaPersona();
                    lp.insertarFinalAvion(NoAvion, tipoS, Pasajeros, Desabordaje, Mantenimiento);
                    lp.recorrerAvion();

                    System.out.println("-------PASAJEROS-------");
                    for (int i = 1; i <= Pasajeros; i++) {
                        Random male = new Random();
                        Maletas = (int) (male.nextInt(4) + 1);
                        Random doc = new Random();
                        Documentos = (int) (doc.nextInt(10) + 1);

                        ColaPasajeros lpj = new ColaPasajeros();
                        lpj.insertarFinalPasajeros(NPasajero, Maletas, Documentos);

                        lpj.recorrerPasajeros();
                        NPasajero++;

                    }
                    System.out.println("-------Maletas-------");
                for (int i = 1; i <= Maletas; i++) {
                    ListaCirMalestas lcm = new ListaCirMalestas();
                    lcm.insertarMalestasInicio(NMaletas);
                    NMaletas++;
                }
                } else {
                    if (TipoAvion == 3) {
                        Random pasaj = new Random();
                        Pasajeros = (int) (pasaj.nextInt(11) + 30);
                        Random mant = new Random();
                        Mantenimiento = (int) (mant.nextInt(4) + 3);

                        Desabordaje = 3;
                        tipoS = "grande";

                        ListaPersona lp = new ListaPersona();
                        lp.insertarFinalAvion(NoAvion, tipoS, Pasajeros, Desabordaje, Mantenimiento);
                        lp.recorrerAvion();

                        System.out.println("-------PASAJEROS-------");
                        for (int i = 1; i <= Pasajeros; i++) {
                            Random male = new Random();
                            Maletas = (int) (male.nextInt(4) + 1);
                            Random doc = new Random();
                            Documentos = (int) (doc.nextInt(10) + 1);

                            ColaPasajeros lpj = new ColaPasajeros();
                            lpj.insertarFinalPasajeros(NPasajero, Maletas, Documentos);

                            lpj.recorrerPasajeros();
                            NPasajero++;

                        }
                        System.out.println("-------Maletas-------");
                for (int i = 1; i <= Maletas; i++) {
                    ListaCirMalestas lcm = new ListaCirMalestas();
                    lcm.insertarMalestasInicio(NMaletas);
                    NMaletas++;
                }

                    } else {
                        System.out.println("no salio");
                    }

                }

            }
            NoAvion++;
            TotalTurnos--;
            ImprimirTurno++;

            // ListaPersona lp = new ListaPersona();
            // lp.insertarFinalAvion(NoAvion, tipoS, Pasajeros, Desabordaje, Mantenimiento);
            // lp.recorrerAvion();
        }

    }

    public void generarPasajeros() {
        ColaPasajeros lpj = new ColaPasajeros();
        lpj.insertarFinalPasajeros(Pasajeros, Maletas, Documentos);
        lpj.recorrerPasajeros();

    }

}
