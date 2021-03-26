package com.company;

//AUTHOR     :  Oscar Javier Cardozo Diaz
//DESCRIPTION:  This software uses methods in your code.
//DATE       :  23/03/2021
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        p_user_distance();
    }

        public static void p_show_info_program(){
        /*
        Date       : 23/03/2021
        Description: this method show the info of the software
        */
        System.out.println("--------------------------------");
        System.out.println("SoftMethod V1.0");
        System.out.println("Maker: Oscar Javier Cardozo Diaz");
        System.out.println("Descr: used method");
        System.out.println("--------------------------------");
    }
    public static int p_user_distance() {
        Scanner keyboard = new Scanner(System.in);
        int v_distance;
        System.out.println("Type the distance between tow cities:");
        v_distance = keyboard.nextInt();
        while (v_distance < 0)
            System.err.println("EEROR: The distant between the two cities must be mayor than 0");
        v_distance = keyboard.nextInt();
        }
        return v_distance;

    }
