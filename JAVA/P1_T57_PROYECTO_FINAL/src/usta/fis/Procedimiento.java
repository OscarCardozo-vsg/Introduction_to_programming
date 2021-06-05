package usta.fis;

import javax.swing.*;

public class Procedimiento {
    private static Confirmation esGanador3;
    static final String MARCA_0 = "O";
    static final String MARCA_x = "x";
    static int f, c, n = 0;
    static boolean ganador = false;
    static int jugadas = 0;
    static String T[][] = new String[n][n];

    public static String[][] procedimiento(int n) {
        mostrartablero(T, n);

        while (ganador == false) {
            //Jugador O
            JOptionPane.showMessageDialog(null, "Jugada de O");
            f = Integer.valueOf(JOptionPane.showInputDialog(null, "Fila= \n"));
            c = Integer.valueOf(JOptionPane.showInputDialog(null, "Columna = \n"));
            if ((T[f - 1][c - 1] == MARCA_x) || (T[f - 1][c - 1] == MARCA_0)) {
                JOptionPane.showMessageDialog(null, "La casilla marcada ya está llena, perdiste tu turno");
            } else {
                T[f - 1][c - 1] = MARCA_0;
            }
            mostrartablero(T, n);

            jugadas++;

            //Jugador X
            JOptionPane.showMessageDialog(null, "Jugada de X");
            f = Integer.valueOf(JOptionPane.showInputDialog(null, "Fila= \n"));
            c = Integer.valueOf(JOptionPane.showInputDialog(null, "Columna = \n"));
            if ((T[f - 1][c - 1] == MARCA_x) || (T[f - 1][c - 1] == MARCA_0)) {
                JOptionPane.showMessageDialog(null, "La casilla marcada ya está llena, perdiste tu turno");
            } else {
                T[f - 1][c - 1] = MARCA_x;
            }
            mostrartablero(T, n);
            jugadas++;
            if (n == 3 && jugadas == 9) {
                break;
            } else if (n == 5 && jugadas == 25) {
                break;
            }
        }
        return T;
    }

        public static void showInfo(){
            esGanador3 = new Confirmation();

            if (n == 3) {
                if (Confirmation.esGanador3(T, MARCA_0)) {
                    JOptionPane.showMessageDialog(null, "!!Gana el jugador O");
                    ganador = true;
                }
            } else if (n == 5) {
                if (Confirmation.esGanador5(T, MARCA_0)) {
                    JOptionPane.showMessageDialog(null, "!!Gana el jugador O");
                    ganador = true;
                }
            }
            if (n == 3) {
                if (Confirmation.esGanador3(T, MARCA_x)) {
                    JOptionPane.showMessageDialog(null, "!!Gana el jugador X");
                    ganador = true;
                }
            } else if (n == 5) {
                if (Confirmation.esGanador5(T, MARCA_x)) {
                    JOptionPane.showMessageDialog(null, "!!Gana el jugador X");
                    ganador = true;
                }
            }
        if (ganador == false) {
            JOptionPane.showMessageDialog(null, "Hubo empate!");
        }
    }

    private static void mostrartablero(String[][] T,int n) {

        String matriz = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz += "  | ";
                matriz += T[i][j];
            }
            matriz += "\n";
        }
        JOptionPane.showMessageDialog(null, matriz);
    }
}



