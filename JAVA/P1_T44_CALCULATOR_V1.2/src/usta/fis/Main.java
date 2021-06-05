package usta.fis;

//AUTHOR     : Oscar Javier Cardozo Diaz
//DESCRIPTION: This software was made to make operation
//DATE       : 15/04/2021
import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        p_show_info_program();
        int v_operation = 0;
        do {
            System.out.println("please choose a option:");
            System.out.println("1.sum");
            System.out.println("2.subtraction");
            System.out.println("3.multiplication");
            System.out.println("4.division");
            System.out.println("5.prime");
            System.out.println("0.exit");
            v_operation = keyboard.nextInt();
            while (v_operation < 0 || v_operation > 5) {
                System.err.println("ERROR: the number that you put must be between 1 and 4, please input again the number:");
                v_operation = keyboard.nextInt();
            }
            p_results(v_operation);
        } while (v_operation != 0);
    }

    public static void p_show_info_program() {
        //This method show the name of the program and him creator.
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║      SoftCalculator V1.2     ║");
        System.out.println("║   Oscar Javier Cardozo Diaz  ║");
        System.out.println("║           16/04/2021         ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static String p_sum() {
        //this method was made to calculate a sum
        System.out.println("please put the how many numbers you want to sum:");
        int v_sum_numbers = keyboard.nextInt();
        int v_total_sum = 0;
        for (int i = 1; i <= v_sum_numbers; i = i + 1) {
            System.out.println("please input the " + i + " number: ");
            int v_sum_num = keyboard.nextInt();
            v_total_sum = v_total_sum + v_sum_num;
        }
        return v_total_sum + "";
    }

    public static String p_sub() {
        //this method was made to calculate a subtraction
        System.out.println("please put the first number that you want to subtract:");
        int v_sub_number_1 = keyboard.nextInt();
        System.out.println("please put the second number that you want to subtract:");
        int v_sub_number_2 = keyboard.nextInt();
        int v_total_sub = v_sub_number_1 - v_sub_number_2;
        return v_total_sub + "";
    }

    public static String p_mult() {
        //this method was made to calculate a multiplication
        System.out.println("please put the how many numbers you want to multiply:");
        int v_mult_numbers = keyboard.nextInt();
        int v_total_mult = 1;
        for (int i = 1; i <= v_mult_numbers; i = i + 1) {
            System.out.println("please input the " + i + " number: ");
            int v_mult_num = keyboard.nextInt();
            v_total_mult = v_total_mult * v_mult_num;
        }
        return v_total_mult + "";
    }

    public static String p_div() {
        //this method was made to calculate a division
        String v_convert = "";
        System.out.println("please put the first number that you want to divide:");
        int v_div_number_1 = keyboard.nextInt();
        System.out.println("please put the second number that you want to divide:");
        int v_div_number_2 = keyboard.nextInt();
        int v_total_div = v_div_number_1 / v_div_number_2;
        return v_total_div + "";
    }

    public static boolean p_prime() {
        System.out.println("please the numbers that you wanna know if is prime:");
        int v_number = keyboard.nextInt();
        int v_numbers_divide = 0;
        for (int a = 1; a <= v_number; a++) {
            if (v_number % a == 0) {
                v_numbers_divide++;
            }
            if (v_numbers_divide != 2) {
                return false;
            }
        }
        return true;
    }

    public static String p_prime_numbers(float v_number1) {
        String prime_numbers = "";
        int p_pos_counter = 0;
        int[] int_prime_numbers = new int[100];
        for (int i = 1; i <= v_number1; i++) {
            if (p_prime()) {
                prime_numbers = prime_numbers + String.valueOf(i) + ", ";
            }
        }
        return prime_numbers;
    }

        public static void p_results ( int v_operation){
            String v_total = "";
            String v_total_prime = "";
            switch (v_operation) {
                case 1:
                    v_total = p_sum();
                    System.out.println("The total is: " + v_total);
                    break;
                case 2:
                    v_total = p_sub();
                    System.out.println("The total is: " + v_total);
                    break;
                case 3:
                    v_total = p_mult();
                    System.out.println("The total is: " + v_total);
                    break;
                case 4:
                    v_total = p_div();
                    System.out.println("The total is: " + v_total);
                    break;
                case 5:
                    v_total_prime = "No es un número primo";
                    if (p_prime()) {
                        v_total_prime = "Es número primo";
                    }
                    System.out.println("The total is: " + v_total_prime);
                    break;
                default:
                    System.exit(0);
                    break;
            }
            if (v_total_prime.isEmpty()) {
                v_total_prime = String.valueOf(v_total);
            }
        }
    }