package usta.fis;
//AUTHOR     : Oscar Javier Cardozo Diaz
//DESCRIPTION: This software gonna calculate the cost of a parcel service
//DATE       : 25/03/2021
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        p_show_info_program();
        int v_total_weight = p_weight();
        int v_zone = p_zone();
        int v_total = 0;
        if (v_zone == 1) {
            v_total = v_total_weight * 11;
            System.out.println("the total cost of your sending to North America is: " + v_total + "$.");
        }
        if (v_zone == 2) {
            v_total = v_total_weight * 10;
            System.out.println("the total cost of your sending to Central America is: " + v_total + "$.");
        }
        if (v_zone == 3) {
            v_total = v_total_weight * 12;
            System.out.println("the total cost of your sending to South America is: " + v_total + "$.");
        }
        if (v_zone == 4) {
            v_total = v_total_weight * 24;
            System.out.println("the total cost of your sending to Europe is: " + v_total + "$.");
        }
        if (v_zone == 5) {
            v_total = v_total_weight * 27;
            System.out.println("the total cost of your sending to Asia is: " + v_total + "$.");
        }
    }
    public static void p_show_info_program() {
        System.out.println("╔═════════════════════════╗");
        System.out.println("║    SoftCalculate V1.0   ║");
        System.out.println("║Oscar Javier Cardozo Diaz║");
        System.out.println("║        25/03/2021       ║");
        System.out.println("╚═════════════════════════╝");
    }

    public static int p_weight(){
        //This method was created to ask the total of the package´s weigh that the person wanna send.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, input the number of package that you gonna send: ");
        int v_package = keyboard.nextInt();
            int v_total_weight= 0;
            for (int i=1; i<=v_package;i=i+1){
                System.out.println("Please, input the weight(Kg) of the "+i+" package: ");
                int v_weight = keyboard.nextInt();
                while (v_weight < 0) {
                    System.err.println("ERROR: the number weight must be mayor than 0, please input again the number: ");
                    v_weight = keyboard.nextInt();
                }
                v_total_weight= v_total_weight+v_weight;
            }
        return v_total_weight;
    }

    public static int p_zone() {
        //This method was created to ask the zone where the person wanna send the packages.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, input the zone where you gonna send the package(remember that the price is the cost per Kg): ");
        System.out.println("1.North America(11.00$).");
        System.out.println("2.Central America(10.00$).");
        System.out.println("3.South America(12.00$).");
        System.out.println("4.Europe(24.00$).");
        System.out.println("5.Asia(27.00$).");
        int v_zone = keyboard.nextInt();
        while (v_zone <= 0 || v_zone>5) {
            System.err.println("ERROR: the number must be between the 1 and the 5, please input again the number: ");
            v_zone = keyboard.nextInt();
        }
        return v_zone;
    }
}
