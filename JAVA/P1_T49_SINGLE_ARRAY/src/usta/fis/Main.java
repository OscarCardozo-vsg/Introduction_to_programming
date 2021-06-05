package usta.fis;

import java.util.Scanner;

public class Main {
public static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        int[] SingleArray;
        int size =0;
        int i= 0;
        int score= 0;
        float average= 0;
        System.out.println("please type the size for your single array:");
        size= keyboard.nextInt();
        SingleArray= new int[size];

        System.out.println("please type the score that you know the average:");

        while (i<SingleArray.length){
            System.out.println("please type the "+(i+1)+" score:");
            score = keyboard.nextInt();
            SingleArray[i] = score;
            i++;//i=i+1//before to close while bracket"}"
        }
        average=p_calculate_average(SingleArray);
        System.out.println("your average score is: "+average);
    }
    public static float p_calculate_average(int[] SingleArray){
        int counter= 0, sum= 0;
        float average= 0;

        while (counter<SingleArray.length){
            sum+=SingleArray[counter];
            counter++;
        }
        average= sum/SingleArray.length;
        return average;
    }
}
