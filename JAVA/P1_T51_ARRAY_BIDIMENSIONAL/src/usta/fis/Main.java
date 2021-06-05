package usta.fis;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int down=3, rigth=4;
        Scanner keyboard= new Scanner(System.in);
        int[][] v_matrix=new int [down][rigth];
        JOptionPane.showMessageDialog(null, "This software was created to show a bidimensional array");

        System.out.println("Please type the values for the bidimensional array:");
            for(int i=0; i<down;i++){
                for(int j=0;j<rigth;j++){
                    System.out.print("Matrix is located [:"+i+","+j+"]=");//matrix[i][j]=
                    v_matrix[i][j]= keyboard.nextInt();
                }
            }
        System.out.println("----------------------------");
        System.out.println("the values of matrix are: ");
            for(int i=0;i<down;i++){
                for(int j=0;j<rigth;j++){
                    System.out.print(" "+v_matrix[i][j]+" ");
                    if(v_matrix[i][j]<10){System.out.print(" ");}
                    if(v_matrix[i][j]>99){System.out.print("");}
                }
                System.out.println(" ");
            }
    }
}

