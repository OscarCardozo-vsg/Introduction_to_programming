package usta;

//AUTHOR     :  Oscar Javier Cardozo Diaz
//DESCRIPTION:  This software gonna calculate the money that a person saved
//DATE       :  23/03/2021
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_total_saved= 0;
        for (int i=1; i<=12;i=i+1) {
            System.out.println("please input the saved month in " + i + " month");
            v_total_saved = v_total_saved + p_user_saved_money();
        }
        System.out.println("The total money that you saved in the year is: "+v_total_saved+"$.");
    }

    public static void p_show_info_program(){
        //this method is about the software and who created it.
        System.out.println("╔═════════════════════════╗");
        System.out.println("║      SoftSaved V1.0     ║");
        System.out.println("║Oscar Javier Cardozo Diaz║");
        System.out.println("║        25/03/2021       ║");
        System.out.println("╚═════════════════════════╝");
    }
    public static int p_user_saved_money(){
        //this method return the saved money in a month.
        Scanner keyboard= new Scanner(System.in);
        System.out.println("please input the money(COP) that you saved:");
        int v_saved= keyboard.nextInt();
        while (v_saved<0){
            System.err.println("ERROR: the number must be mayor than 0, please input the number again:");
            v_saved= keyboard.nextInt();
        }
        return v_saved;
    }
}
