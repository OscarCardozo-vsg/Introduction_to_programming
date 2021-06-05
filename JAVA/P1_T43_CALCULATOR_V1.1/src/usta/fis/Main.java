package usta.fis;

//AUTHOR     : Oscar Javier Cardozo Diaz
//DESCRIPTION: This software was made to make operation
//DATE       : 15/04/2021
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        p_show_info_program();
            System.out.println("please choose a option:");
            System.out.println("1.sum");
            System.out.println("2.subtraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");
            int v_operation = keyboard.nextInt();
                while (v_operation < 1 || v_operation > 4) {
                 System.err.println("ERROR: the number that you put must be between 1 and 4, please input again the number:");
                 v_operation = keyboard.nextInt();
                 }
                 if (v_operation == 1) {
                int v_total_sum = p_sum();
                System.out.println("The total is: " + v_total_sum);
            }
                 if (v_operation == 2) {
                int v_total_sub = p_sub();
                System.out.println("The total is: " + v_total_sub);
            }
                 if (v_operation == 3) {
                int v_total_mult = p_mult();
                System.out.println("The total is: " + v_total_mult);
            }
                 if (v_operation == 4) {
                int v_total_div = p_div();
                System.out.println("The total is: " + v_total_div);
            }
    }

    public static void p_show_info_program() {
        //This method show the name of the program and him creator.
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║      SoftCalculator V1.2     ║");
        System.out.println("║   Oscar Javier Cardozo Diaz  ║");
        System.out.println("║           16/04/2021         ║");
        System.out.println("╚══════════════════════════════╝");
    }
    public static int p_sum(){
        //this method was made to calculate a sum
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please put the how many numbers you want to sum:");
        int v_sum_numbers = keyboard.nextInt();
        int v_total_sum= 0;
        for (int i=1; i<=v_sum_numbers;i=i+1){
            System.out.println("please input the "+i+" number: ");
            int v_sum_num = keyboard.nextInt();
            v_total_sum= v_total_sum+v_sum_num;
        }
        return v_total_sum;
    }
    public static int p_sub(){
        //this method was made to calculate a subtraction
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please put the first number that you want to subtract:");
        int v_sub_number_1 = keyboard.nextInt();
        System.out.println("please put the second number that you want to subtract:");
        int v_sub_number_2 = keyboard.nextInt();
        int v_total_sub= v_sub_number_1-v_sub_number_2;
        return v_total_sub;
    }
    public static int p_mult(){
        //this method was made to calculate a multiplication
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please put the how many numbers you want to multiply:");
        int v_mult_numbers = keyboard.nextInt();
        int v_total_mult= 0;
        for (int i=1; i<=v_mult_numbers;i=i+1){
            System.out.println("please input the "+i+" number: ");
            int v_mult_num = keyboard.nextInt();
            v_total_mult= v_total_mult*v_mult_num;
        }
        return v_total_mult;
    }
    public static int p_div(){
        //this method was made to calculate a division
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please put the first number that you want to divide:");
        int v_div_number_1 = keyboard.nextInt();
        System.out.println("please put the second number that you want to divide:");
        int v_div_number_2 = keyboard.nextInt();
        int v_total_div= v_div_number_1/v_div_number_2;
        return v_total_div;
    }
}
