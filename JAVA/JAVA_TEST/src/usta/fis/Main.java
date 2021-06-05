package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        p_information();
        int v_num_1 = 0;
        int v_digitos = 0;
        System.out.println("porfavor digite cuantos digitos tiene el numero que quieres usar ");
        v_digitos = keyboard.nextInt();
        int array[] = new int[v_digitos];

        for (int i = 0; i < array.length; i++) {
            System.out.println("porfavor digite el " + (i + 1) + " digito del numero que quieres usar ");
            array[i] = keyboard.nextInt();
        }
        boolean v_total = p_validacion(array, v_digitos);
        if(v_total= true) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("the number "+v_num_1+" es un numero capicua");
            }
        }
        if(v_total= false){
            System.out.println("the number "+v_num_1+" es un numero capicua");
        }
    }

    public static boolean p_validacion(int[] array, int v_digitos) {
        for (int i = 0; i < array.length; i++){
            int v_div=array[0]%array[v_digitos];
            v_div=0;
        return true;
        }
    return false;
    }

    public static void p_information() {
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║       SoftCapicua V1.0       ║");
        System.out.println("║   Oscar Javier Cardozo Diaz  ║");
        System.out.println("║           10/05/2021         ║");
        System.out.println("╚══════════════════════════════╝");
    }
}
