package usta.fis;

//AUTHOR     : Oscar Javier Cardozo Diaz
//DESCRIPTION: This software was made to make operation
//DATE       : 29/04/2021
import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        p_show_info_program();
        int n[] =new int[100];
        System.out.println("please input the limit number until where gonna end the fibonacci number");
        int count = keyboard.nextInt();
        while (count < 0){
            count = keyboard.nextInt();
        }
        int[] v_fibonacci = p_fibonacci_num_1(count, n);
        System.out.println(" The fibonacci last number until the number that you chose is: " + v_fibonacci);
    }
    public static void p_show_info_program() {
        //This method show the name of the program and him creator.
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║   SoftFibonacciNumber V1.2   ║");
        System.out.println("║   Oscar Javier Cardozo Diaz  ║");
        System.out.println("║           16/04/2021         ║");
        System.out.println("╚══════════════════════════════╝");
    }
    public static int[] p_fibonacci_num_1(int count, int[] n) {
        n[1] = 0;
        n[2] = 1;
        int i;
        System.out.print(n[1]+ " " + n[2]);
        for (i = 2;n[1]+n[2] < count; ++i) {
            n[3] = n[1] + n[2];
            System.out.print(" " + n[3]);
            n[1] = n[2];
            n[2] = n[3];
        }
        return n[2] + "";
    }
}
