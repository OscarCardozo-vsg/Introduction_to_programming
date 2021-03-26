package usta.fis;

//AUTHOR     : Oscar Javier Cardozo Diaz/Nicolas Casas Bello/Santiago De La Vega
//DESCRIPTION: This software gonna calculate the average between different height children.
//DATE       : 26/03/2021
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_children= p_children();
        int v_total_height= p_height_children(v_children);
        int v_total= 0;
            v_total= v_total_height/v_children;
            System.out.println("The average height of "+v_children+" children is: "+v_total+" cm.");
    }

    public static void p_show_info_program() {
        //This method show the name of the program and him creator.
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║    SoftAverageHeight V1.0    ║");
        System.out.println("║   Oscar Javier Cardozo Diaz  ║");
        System.out.println("║           26/03/2021         ║");
        System.out.println("╚══════════════════════════════╝");
    }
    public static int p_children(){
        //This method gonna ask the number of children that the person want calculate.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, input the number of children that you want calculate: ");
        int v_children = keyboard.nextInt();
        while (v_children<=0){
            System.err.println("ERROR: the number of the children must be mayor than 0, please input again the number: ");
            v_children = keyboard.nextInt();
        }
        return v_children;
    }
    public static int p_height_children(int v_children){
        //In this method gonna ask the number of children and their height.
        Scanner keyboard = new Scanner(System.in);
        int v_total_height= 0;
        for (int i=1; i<=v_children;i=i+1){
            System.out.println("Please, input the height(cm.) of the "+i+" child: ");
            int v_height = keyboard.nextInt();
            while (v_height < 50 || v_height> 200) {
                System.err.println("ERROR: the number of the height must be between 50 and 200, please input again the number: ");
                v_height = keyboard.nextInt();
            }
            v_total_height= v_total_height+v_height;
        }
        return v_total_height;
    }

}
