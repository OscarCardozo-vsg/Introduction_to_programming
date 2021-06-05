package usta.fis;

import javax.swing.*;

public class Main {
    private static Procedimiento procedimiento;
    static final String MARCA_VACIO = " ";


    public static void main(String[] args) {
        procedimiento = new Procedimiento();
        int n = 0;
        boolean op = true;
        String T[][] = new String[n][n];

        JOptionPane.showMessageDialog(null, "Juego Triqui\n");
        while (op) {

            int selec = Integer.valueOf(JOptionPane.showInputDialog(null, "Ecoja un numero segun las siguientes opciones:\n" +
                    "1. Triqui de 3x3\n" +
                    "2. Triqui de 5x5\n"));

            if (selec == 1) {
                n = 3;
                op = false;
            } else if (selec == 2) {
                n = 5;
                op = false;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                procedimiento.procedimiento(n);
            }
        }
        procedimiento.showInfo();
        limpiartablero(T, n);
    }

    private static void limpiartablero(String[][] t, int n) {
        int f, c;
        for (f = 0; f < n; f++) {
            for (c = 0; c < n; c++) {
                t[f][c] = MARCA_VACIO;
            }
        }
    }
}



