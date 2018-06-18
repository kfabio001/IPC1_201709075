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
public class LogicaAtaques {

    public LogicaAtaques(PanelTablero panel, Jugadores nombrej) {
        this.panel = panel;
        this.nombrej = nombrej;

    }

    public void AtaqueArriba() {
        do {

            for (int i = 0; i < panel.tamTab; i++) {
                for (int j = 0; j < panel.tamTab; j++) {
                    if (nombrej.Ordenar[panel.turno - 1] == panel.vecL[i][j]) {
                        a = i;
                        b = j;
                        seguir = false;
                    }
                }
            }
        } while (seguir);

        if (nombrej.Ordenar[panel.turno - 1] == 1) {
            if ((a - 1) >= 0) {
                if (panel.vecL[a - 1][b] == 4 || panel.vecL[a - 1][b] == 5 || panel.vecL[a - 1][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 2);
                    panel.RepintarVida();
                }
            }
            if ((a - 2) >= 0) {
                if (panel.vecL[a - 2][b] == 4 || panel.vecL[a - 2][b] == 5 || panel.vecL[a - 2][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 2);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 4) {
            if ((a - 1) >= 0) {
                if (panel.vecL[a - 1][b] == 1 || panel.vecL[a - 1][b] == 2 || panel.vecL[a - 1][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 2);
                    panel.RepintarVida();
                }
            }
            if ((a - 2) >= 0) {
                if (panel.vecL[a - 2][b] == 1 || panel.vecL[a - 2][b] == 2 || panel.vecL[a - 2][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 2);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 2) {
            if ((a - 1) >= 0) {
                if (panel.vecL[a - 1][b] == 4 || panel.vecL[a - 1][b] == 5 || panel.vecL[a - 1][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a - 2) >= 0) {
                if (panel.vecL[a - 2][b] == 4 || panel.vecL[a - 2][b] == 5 || panel.vecL[a - 2][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a - 3) >= 0) {
                if (panel.vecL[a - 3][b] == 4 || panel.vecL[a - 3][b] == 5 || panel.vecL[a - 3][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a - 4) >= 0) {
                if (panel.vecL[a - 4][b] == 4 || panel.vecL[a - 4][b] == 5 || panel.vecL[a - 4][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 5) {
            if ((a - 1) >= 0) {
                if (panel.vecL[a - 1][b] == 1 || panel.vecL[a - 1][b] == 2 || panel.vecL[a - 1][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a - 2) >= 0) {
                if (panel.vecL[a - 2][b] == 1 || panel.vecL[a - 2][b] == 2 || panel.vecL[a - 2][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a - 3) >= 0) {
                if (panel.vecL[a - 3][b] == 1 || panel.vecL[a - 3][b] == 2 || panel.vecL[a - 1][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a - 4) >= 0) {
                if (panel.vecL[a - 4][b] == 1 || panel.vecL[a - 4][b] == 2 || panel.vecL[a - 4][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
        }
        panel.dado.setEnabled(true);
    }

    public void AtacarAbajo() {
        do {

            for (int i = 0; i < panel.tamTab; i++) {
                for (int j = 0; j < panel.tamTab; j++) {
                    if (nombrej.Ordenar[panel.turno - 1] == panel.vecL[i][j]) {
                        a = i;
                        b = j;
                        seguir = false;
                    }
                }
            }
        } while (seguir);

        if (nombrej.Ordenar[panel.turno - 1] == 1) {
            if ((a + 1) <= panel.tamTab - 1) {
                if (panel.vecL[a + 1][b] == 4 || panel.vecL[a + 1][b] == 5 || panel.vecL[a + 1][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 2);
                    panel.RepintarVida();
                }
            }
            if ((a + 2) <= panel.tamTab - 1) {
                if (panel.vecL[a + 2][b] == 4 || panel.vecL[a + 2][b] == 5 || panel.vecL[a + 2][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 2);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 4) {
            if ((a + 1) <= panel.tamTab - 1) {
                if (panel.vecL[a + 1][b] == 1 || panel.vecL[a + 1][b] == 2 || panel.vecL[a + 1][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 2);
                    panel.RepintarVida();
                }
            }
            if ((a + 2) <= panel.tamTab - 1) {
                if (panel.vecL[a + 2][b] == 1 || panel.vecL[a + 2][b] == 2 || panel.vecL[a + 2][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 2);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 2) {
            if ((a + 1) <= panel.tamTab - 1) {
                if (panel.vecL[a + 1][b] == 4 || panel.vecL[a + 1][b] == 5 || panel.vecL[a + 1][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a + 2) <= panel.tamTab - 1) {
                if (panel.vecL[a + 2][b] == 4 || panel.vecL[a + 2][b] == 5 || panel.vecL[a + 2][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a + 3) <= panel.tamTab - 1) {
                if (panel.vecL[a + 3][b] == 4 || panel.vecL[a + 3][b] == 5 || panel.vecL[a + 3][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a + 4) <= panel.tamTab - 1) {
                if (panel.vecL[a + 4][b] == 4 || panel.vecL[a + 4][b] == 5 || panel.vecL[a + 4][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 5) {
            if ((a + 1) <= panel.tamTab - 1) {
                if (panel.vecL[a + 1][b] == 1 || panel.vecL[a + 1][b] == 2 || panel.vecL[a + 1][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a + 2) <= panel.tamTab - 1) {
                if (panel.vecL[a + 2][b] == 1 || panel.vecL[a + 2][b] == 2 || panel.vecL[a + 2][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a + 3) <= panel.tamTab - 1) {
                if (panel.vecL[a + 3][b] == 1 || panel.vecL[a + 3][b] == 2 || panel.vecL[a + 1][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((a + 4) <= panel.tamTab - 1) {
                if (panel.vecL[a + 4][b] == 1 || panel.vecL[a + 4][b] == 2 || panel.vecL[a + 4][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
        }
        panel.dado.setEnabled(true);
    }

    public void AtacarDerecha() {
        do {

            for (int i = 0; i < panel.tamTab; i++) {
                for (int j = 0; j < panel.tamTab; j++) {
                    if (nombrej.Ordenar[panel.turno - 1] == panel.vecL[i][j]) {
                        a = i;
                        b = j;
                        seguir = false;
                    }
                }
            }
        } while (seguir);

        if (nombrej.Ordenar[panel.turno - 1] == 1) {
            if ((b + 1) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 1] == 4 || panel.vecL[a][b + 1] == 5 || panel.vecL[a][b + 1] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 2);
                    panel.RepintarVida();
                }
            }
            if ((b + 2) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 2] == 4 || panel.vecL[a][b + 2] == 5 || panel.vecL[a][b + 2] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 2);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 4) {
            if ((b + 1) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 1] == 1 || panel.vecL[a][b + 1] == 2 || panel.vecL[a][b + 1] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 2);
                    panel.RepintarVida();
                }
            }
            if ((b + 2) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 2] == 1 || panel.vecL[a][b + 2] == 2 || panel.vecL[a][b + 2] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 2);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 2) {
            if ((b + 1) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 1] == 4 || panel.vecL[a][b + 1] == 5 || panel.vecL[a][b + 1] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b + 2) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 2] == 4 || panel.vecL[a][b + 2] == 5 || panel.vecL[a][b + 2] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b + 3) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 3] == 4 || panel.vecL[a][b + 3] == 5 || panel.vecL[a][b + 3] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b + 4) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 4] == 4 || panel.vecL[a][b + 4] == 5 || panel.vecL[a][b + 4] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 5) {
            if ((b + 1) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 1] == 1 || panel.vecL[a][b + 1] == 2 || panel.vecL[a][b + 1] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b + 2) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 2] == 1 || panel.vecL[a][b + 2] == 2 || panel.vecL[a][b + 2] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b + 3) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 3] == 1 || panel.vecL[a][b + 3] == 2 || panel.vecL[a][b + 3] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b + 4) <= panel.tamTab - 1) {
                if (panel.vecL[a][b + 4] == 1 || panel.vecL[a][b + 4] == 2 || panel.vecL[a][b + 4] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
        }
        panel.dado.setEnabled(true);
    }

    public void AtacarIzquierda() {
        do {

            for (int i = 0; i < panel.tamTab; i++) {
                for (int j = 0; j < panel.tamTab; j++) {
                    if (nombrej.Ordenar[panel.turno - 1] == panel.vecL[i][j]) {
                        a = i;
                        b = j;
                        seguir = false;
                    }
                }
            }
        } while (seguir);

        if (nombrej.Ordenar[panel.turno - 1] == 1) {
            if ((b - 1) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 1] == 4 || panel.vecL[a][b - 1] == 5 || panel.vecL[a][b - 1] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 2);
                    panel.RepintarVida();
                }
            }
            if ((b - 2) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 2] == 4 || panel.vecL[a][b - 2] == 5 || panel.vecL[a][b - 2] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 2);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 4) {
            if ((b - 1) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 1] == 1 || panel.vecL[a][b - 1] == 2 || panel.vecL[a][b - 1] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 2);
                    panel.RepintarVida();
                }
            }
            if ((b - 2) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 2] == 1 || panel.vecL[a][b - 2] == 2 || panel.vecL[a][b - 2] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 2);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 2) {
            if ((b - 1) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 1] == 4 || panel.vecL[a][b - 1] == 5 || panel.vecL[a][b - 1] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b - 2) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 2] == 4 || panel.vecL[a][b - 2] == 5 || panel.vecL[a][b - 2] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b - 3) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 3] == 4 || panel.vecL[a][b - 3] == 5 || panel.vecL[a][b - 3] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b - 4) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 4] == 4 || panel.vecL[a][b - 4] == 5 || panel.vecL[a][b - 4] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                }
            }
        } else if (nombrej.Ordenar[panel.turno - 1] == 5) {
            if ((b - 1) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 1] == 1 || panel.vecL[a][b - 1] == 2 || panel.vecL[a][b - 1] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b - 2) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 2] == 1 || panel.vecL[a][b - 2] == 2 || panel.vecL[a][b - 2] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b - 3) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 3] == 1 || panel.vecL[a][b - 3] == 2 || panel.vecL[a][b - 3] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
            if ((b - 4) <= panel.tamTab - 1) {
                if (panel.vecL[a][b - 4] == 1 || panel.vecL[a][b - 4] == 2 || panel.vecL[a][b - 4] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                }
            }
        }
        panel.dado.setEnabled(true);
    }

    public void AtaquePrincesa() {

        do {

            for (int i = 0; i < panel.tamTab; i++) {
                for (int j = 0; j < panel.tamTab; j++) {
                    if (nombrej.Ordenar[panel.turno - 1] == panel.vecL[i][j]) {
                        a = i;
                        b = j;
                        seguir = false;
                    }
                }
            }
        } while (seguir);
        if (nombrej.Ordenar[panel.turno - 1] == 3) {
            if ((a + 1) >= 0) {
                if (panel.vecL[a + 1][b] == 4 || panel.vecL[a + 1][b] == 5 || panel.vecL[a + 1][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                    nombrej.ActAtack[panel.vecL[a + 1][b] - 1] = false;
                }
            }
            if ((a - 1) >= 0) {
                if (panel.vecL[a - 1][b] == 4 || panel.vecL[a - 1][b] == 5 || panel.vecL[a - 1][b] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                    nombrej.ActAtack[panel.vecL[a - 1][b] - 1] = false;
                }
            }
            if ((b + 1) >= 0) {
                if (panel.vecL[a][b + 1] == 4 || panel.vecL[a][b + 1] == 5 || panel.vecL[a][b + 1] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                    nombrej.ActAtack[panel.vecL[a][b + 1] - 1] = false;
                }
            }
            if ((b - 1) >= 0) {
                if (panel.vecL[a][b - 1] == 4 || panel.vecL[a][b - 1] == 5 || panel.vecL[a][b - 1] == 6) {
                    nombrej.setVidasJ2(nombrej.getVidasJ2() - 1);
                    panel.RepintarVida();
                    nombrej.ActAtack[panel.vecL[a][b - 1] - 1] = false;
                }
            }
        }
        if (nombrej.Ordenar[panel.turno - 1] == 6) {
            if ((a + 1) >= 0) {
                if (panel.vecL[a + 1][b] == 1 || panel.vecL[a + 1][b] == 2 || panel.vecL[a + 1][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                    nombrej.ActAtack[panel.vecL[a + 1][b] - 1] = false;
                }
            }
            if ((a - 1) >= 0) {
                if (panel.vecL[a - 1][b] == 1 || panel.vecL[a - 1][b] == 2 || panel.vecL[a - 1][b] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                    nombrej.ActAtack[panel.vecL[a - 1][b] - 1] = false;
                }
            }
            if ((b + 1) >= 0) {
                if (panel.vecL[a][b + 1] == 1 || panel.vecL[a][b + 1] == 2 || panel.vecL[a][b + 1] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                    nombrej.ActAtack[panel.vecL[a][b + 1] - 1] = false;
                }
            }
            if ((b - 1) >= 0) {
                if (panel.vecL[a][b - 1] == 1 || panel.vecL[a][b - 1] == 2 || panel.vecL[a][b - 1] == 3) {
                    nombrej.setVidasJ1(nombrej.getVidasJ1() - 1);
                    panel.RepintarVida();
                    nombrej.ActAtack[panel.vecL[a][b - 1] - 1] = false;
                }
            }
        }

        panel.dado.setEnabled(true);
    }
    public PanelTablero panel;
    public Jugadores nombrej;
    public int a;
    public int b;
    public boolean seguir;

}
