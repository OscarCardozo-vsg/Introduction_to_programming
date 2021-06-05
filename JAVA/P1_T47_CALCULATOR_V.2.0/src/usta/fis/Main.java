package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard= new Scanner(System.in);

    public static void main(String[] args) {
	int v_numberOne= 0;
    int v_numberTwo= 0;
    int v_result= 0;
    int v_operatioToDo= 0;
    p_infoprogram();
    System.out.println("Please input the first number: ");
    v_numberOne = keyboard.nextInt();
    System.out.println("Please input the second number: ");
    v_numberTwo = keyboard.nextInt();
    System.out.println("Please choose a operation: 1.sum 2.sub 3.mult 4.div 5.prime ");
    v_operatioToDo = keyboard.nextInt();
    v_result= p_operation(v_numberOne, v_numberTwo, v_operatioToDo);
    System.out.println("The result is : "+v_result);
    }

    public static int p_operation(int number1, int number2, int operation){
        String v_total_prime= "";
        if (operation==1){
            return number1+number2;
        }
        if(operation==2){
            return number1-number2;
        }
        if(operation==3){
            return number1*number2;
        }
        if(operation==4){
            if(number2!=0) {
                return number1 / number2;
            }
        }
        if(operation==5){
            v_total_prime = "No es un número primo";
            if (p_prime()) {
                v_total_prime = "Es número primo";
            }
            System.out.println("The total is: " + v_total_prime);
        }
        return 0;
    }

    public static boolean p_prime(int v_number) {
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
    public static void p_infoprogram(){
        System.out.println("This program suplay, substract, multiply, divide two integer number.");
        System.out.println("Developer: Oscar Javier Cardozo Diaz");
        System.out.println("Date: 07/05/2021");
        System.out.println("----------------------------------------------------------------------");
    }
}
