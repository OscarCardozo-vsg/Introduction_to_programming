package usta.fis;

//AUTHOR     : Oscar Javier Cardozo Diaz
//DESCRIPTION: This software was made to make operation
//DATE       : 29/04/2021
import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please input the number until where gonna end the fibonacci number");
        int count = keyboard.nextInt();
        String v_fibonacci = p_fibonacci_num_1(count);
        System.out.println("The fibonacci number until the number that you chose is: " + v_fibonacci);
    }

    public static String p_fibonacci_num_1(int count) {
        int n1 = 0, n2 = 1, n3, i;
        System.out.print(n1 + " " + n2);
        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        return n2 + "";
    }
}
