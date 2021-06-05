package usta.fis;

//AUTHOR     : Oscar Javier Cardozo Diaz
//DESCRIPTION: This software was calculate the average
//DATE       : 26/04/2021
import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║       SoftAverage V1.1       ║");
        System.out.println("║   Oscar Javier Cardozo Diaz  ║");
        System.out.println("║           26/04/2021         ║");
        System.out.println("╚══════════════════════════════╝");

        float v_total = 0;
        float v_total_1 = 0;
        int counter = 0;
        int contador = 0;
        int v_term_1_1 = 0;
        int v_average_1 = 0;
        int v_average = 0;
        System.out.println("Porfavor, digite el número de cortes que cursaste: ");
        int v_term = keyboard.nextInt();
        float[] v_numbers = new float[v_term];

        for (counter = 0; counter < v_term; counter++) {
            System.out.println("Digite cuantas notas sacaron en el corte " + (counter + 1) + ":");
            int v_term_1 = keyboard.nextInt();
            for (contador = 0; contador < v_term_1; contador++) {
                System.out.println("Digite la Nota " + (contador + 1) + ":");
                v_term_1_1 = keyboard.nextInt();
                v_average_1 += v_term_1_1;
                v_average = v_average_1 / v_term_1;
            }
            for (counter = 0; counter < v_term; counter++) {
                System.out.println("su calificación del corte " + (counter + 1) + " es:" + v_average);
            }
            v_total_1 += v_average;
            v_total = v_total_1 / v_term;
            System.out.println("su promedio es:" + v_total);
        }
    }
}

