package usta.fis;

//AUTHOR     : Oscar Javier Cardozo Diaz
//DESCRIPTION: This software was made to make operation
//DATE       : 15/04/2021
import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int counter=0;
        int v_total_1=0;
        int v_total_average=0;
        int v_note=0;
        System.out.println("please put the numbers of term that you did: ");
        int v_term= keyboard.nextInt();
        float [] v_numbers = new float[v_term];

        for (counter=0;counter<v_term;counter++){
            System.out.println("Digite la nota del corte "+(counter+1)+":");
            v_numbers[counter]= keyboard.nextInt();
            v_total_1+=v_numbers[counter];
            v_total_average= v_total_1/v_term;
        }
        if (counter==0) {
            for (counter = 0; counter < v_term; counter++) {
                System.out.println("su calificación del corte " + (counter + 1) + " es:" + (v_numbers[counter] * 0.1));
            }
        }
        else if (counter==1) {
            for (counter = 0; counter < v_term; counter++) {
                System.out.println("su calificación del corte " + (counter + 1) + " es:" + (v_numbers[counter] * 0.3));
            }
        }
        else if (counter==1) {
            for (counter = 0; counter < v_term; counter++) {
                System.out.println("su calificación del corte " + (counter + 1) + " es:" + (v_numbers[counter] * (0.6/(v_term-2))));
            }
        }
        System.out.println("su promedio es:"+v_total_average);
    }
}