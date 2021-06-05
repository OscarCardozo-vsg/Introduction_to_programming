syspackage usta.fis;

import java.util.Scanner;

public class Main {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int array[] = new int[5];
        int v_div = 0;
        System.out.println("Please type 5 values to the array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please type a odd number, number " + (i + 1));
            array[i] = keyboard.nextInt();
            v_div= array[i]%2;
            while (v_div!= 1){
                System.err.println("ERROR: the number that you put isn´t a odd number");
                array[i] = keyboard.nextInt();
                v_div= array[i]%2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("The value is: " + array[i]);
        }
    }
}

