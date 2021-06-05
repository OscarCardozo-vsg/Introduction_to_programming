package usta.fis;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        char[] charArray;
        String letter = "";
        int counter = 0;
        System.out.println("this program show info about of capicua letters or numbers, input ENTER to end the program.");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Input the number or letters that you want:");
        letter = keyboard.next();
        p_capicua(letter);
        System.out.println(p_answer(letter));
    }
    public static String p_answer(String letter){
        if (!p_capicua(letter)==true){
            return "es capicua";
        }else{
            return "no es capicua";
        }

    }

    public static boolean p_capicua (String letter) {
        char []charArray;
        charArray= new char[letter.length()];
        charArray= letter.toCharArray();

        for(int i=0; i<charArray.length; i++){
            if(charArray[i]==charArray[charArray.length-(i+1)]){
            return false;
            }
        }return true;

    }
}