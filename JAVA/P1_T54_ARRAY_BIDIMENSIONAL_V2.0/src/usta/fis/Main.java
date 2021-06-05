package usta.fis;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[][] matrix;
        int value, biggest, length, space;
        String rows, input, matris = "";
        String colums= "4";

        JOptionPane.showMessageDialog(null,"This program create to informate the seating available" +
                "\n in a bus.");
        rows = JOptionPane.showInputDialog("Please type the size of the rows:");


        matrix = new int[Integer.valueOf(rows)][Integer.valueOf(colums)];
        JOptionPane.showMessageDialog(null, "Please type the values" +
                "for the bidimensional array of: " + colums + " colums and " + rows + " rows");

        for (int i = 0; i < Integer.valueOf(colums); i++) {
            for (int j = 0; j < Integer.valueOf(rows); j++) {
                input = JOptionPane.showInputDialog("Please type the value array[" + i + "][" + j + "]=");
                value = Integer.valueOf(input);
                matrix[i][j] = value;
            }
        }
        matris = p_orden(matrix, matris, rows, colums);
        biggest = p_digitos(matrix);
        length = p_contar(biggest);
        space=p_espacios(matrix, length);
        JOptionPane.showMessageDialog(null, "The array is: \n" +matris+space);
        //System.out.println(space);
    }

    public static String p_orden(int[][] matrix, String matris, String rows, String colums) {

        for (int i = 0; i < Integer.valueOf(rows); i++) {
            for (int j = 0; j < Integer.valueOf(colums); j++) {
                matris = matris + "[" + matrix[i][j] + "]";
            }
            matris = matris + "\n";
        }
        return matris;
    }

    public static int p_digitos(int[][] matrix) {
        int biggest = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (biggest < matrix[i][j]) {
                    biggest = matrix[i][j];
                }
            }

        }
        return biggest;
    }

    public static int p_contar(int myNumber) {
        String value = String.valueOf(myNumber);
        return value.length();
    }

    public static int p_espacios(int[][] matrix, int length){
        int total_space= 0;
        for (int i = 0; i <matrix.length; i++){
            for (int j = 0; j < matrix[i].length ; j++){
                total_space=length-matrix[i][j];
            }
        }
        return total_space;
    }
}

/*if (total_space==1){
        return Integer.valueOf(".");
        }
        if(total_space==2){
        return Integer.valueOf("..");
        }
        if(total_space==3){
        return Integer.valueOf("...");
        }
        if(total_space==4){
        return Integer.valueOf("....");
        }*/
