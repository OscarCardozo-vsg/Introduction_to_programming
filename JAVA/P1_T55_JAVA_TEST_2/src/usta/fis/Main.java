package usta.fis;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[][] matrix;
        int[][] matrixx;
        int value=0, diferencia = 0,x=0,y=0, v_full;
        String rows, input, matris = "", v_row, v_colum, matril="";
        int colums=4;

        JOptionPane.showMessageDialog(null,"This program create to informate the seating available" +
                        "\n in a bus.");
        rows = JOptionPane.showInputDialog("Please type the size of the rows:");


        matrix = new int[Integer.valueOf(rows)][colums];
        JOptionPane.showMessageDialog(null, "Please type the values" +
                "for the bidimensional array of: "+rows+" rows and "+colums+" colums.");

       v_row = JOptionPane.showInputDialog("Please type the row of the seating:");
       v_colum = JOptionPane.showInputDialog("Please type the colum of the seating:");

        matrixx= new int[Integer.valueOf(v_row)][Integer.valueOf(v_colum)];
        JOptionPane.showMessageDialog(null,"Your seating is: "+v_row+" row and "+v_colum+" colum.");
        for (int i = 0; i == Integer.valueOf(v_row); i++) {
            for (int j = 0; j == Integer.valueOf(v_colum); j++) {
                value=matrixx[i][j];
            }
        }

        matris = p_orden(matrixx, matris, rows, colums, diferencia, value);
        p_orden_2(matrixx, matris, v_row, v_colum, diferencia, value);
        JOptionPane.showMessageDialog(null, "The array is: \n" +matris);
        v_full= ((4*Integer.valueOf(rows))/2);
        JOptionPane.showMessageDialog(null, "The seating not abailable are:" +v_full);
    }

    public static String p_orden(int[][] matrixx, String matris, String rows, int colums, int diferencia, int value) {

        for (int i = 0; i < Integer.valueOf(rows); i++) {
            for (int j = 0; j < colums; j++) {
                diferencia = i % 2;
                if (diferencia == 0) {
                    matris = matris + "[" + "D" + "]";
                }
                if (diferencia == 1) {
                    matris = matris + "[" + "X" + "]";
                }
            }
                matris = matris + "\n";
            }
            return matris;
        }

    public static String p_orden_2(int[][] matrixx, String matris, String v_row, String v_colum, int diferencia, int value) {

        for (int i = 0; i < v_row.length(); i++) {
            for (int j = 0; j < v_colum.length(); j++) {
                if(matrixx[i][j]==);
                matris = matris + "[" + value + "]";
            }
            matris = matris + "\n";
        }
        return matris;
    }
}




