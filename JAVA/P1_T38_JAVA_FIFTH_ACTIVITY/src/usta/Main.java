package usta;

//AUTHOR     :  Oscar Javier Cardozo Diaz
//DESCRIPTION:  This software gonna calculate the time of a bicycle
//DATE       :  25/03/2021
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	p_show_info_program();
        float v_time=0; //la variable v_time es decimal
        int v_distance=p_user_distance();
        int v_velocity=p_user_velocity();
        v_time= v_distance/v_velocity;
        System.out.println("The time between two cities: "+v_time+" hours");
    }
    public static void p_show_info_program(){
       System.out.println("╔═════════════════════════╗");
       System.out.println("║    SoftCalculate V1.0   ║");
       System.out.println("║Oscar Javier Cardozo Diaz║");
       System.out.println("║        25/03/2021       ║");
       System.out.println("╚═════════════════════════╝");
    }
    public static int p_user_distance(){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the distance(Km) between the 2 cities:");
        int v_distance= keyboard.nextInt();
        while (v_distance<0) {
            System.err.println("ERROR: you must input a number mayor than 0, please input the number again");
            v_distance = keyboard.nextInt();
        }
        return v_distance;
    }
    public static int p_user_velocity(){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input the constant velocity(Km/h) between the 2 cities:");
        int v_velocity= keyboard.nextInt();
        while(v_velocity==0){
            System.err.println("ERROR: you must input a number mayor than 0, please input the number again");
            v_velocity= keyboard.nextInt();
        }
        return v_velocity;
    }

}
