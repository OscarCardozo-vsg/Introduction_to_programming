package usta.fis;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
		String answer;
		int amount = 0;
		int number_1=0;
		int number_2=0;
		int result = 0;
		int[] array;
		JOptionPane.showMessageDialog(null,"Hi, this program a calculator and do arimethic operations.","CALCULATOR", JOptionPane.INFORMATION_MESSAGE );
		String[] operations = {
				"Sumatory",
				"Subtraction",
				"Multiplication",
				"Division",};
		String respuesta = (String) JOptionPane.showInputDialog(null, "choose a operation", "Operation", JOptionPane.DEFAULT_OPTION, null, operations, operations[0]);

		if (respuesta=="Sumatory"||respuesta=="Multiplication"){
			answer = JOptionPane.showInputDialog("please type the amount of numbers that you will use to Sum or Multiply:");
			amount = Integer.valueOf(answer);
		}
		if (respuesta=="Subtraction"||respuesta=="Division"){
			answer = JOptionPane.showInputDialog("please input the first number.");
			number_1 = Integer.valueOf(answer);
			answer = JOptionPane.showInputDialog("please input the second number.");
			number_2 = Integer.valueOf(answer);
		}

		array= new int[amount];
		for(int i=0; i<amount; i++){
			answer=JOptionPane.showInputDialog("please input the "+(i+1)+" number.");
			array[i]= Integer.valueOf(answer);
		}

		result= p_calculator(array,respuesta,number_1,number_2, amount);
		JOptionPane.showMessageDialog(null,"your answere is: "+result,"Answere", JOptionPane.INFORMATION_MESSAGE );
    }

    public static int p_calculator(int []array, String respuesta,int number_1, int number_2, int amount) {
		int result = 0;
		int result_m= 1;
		int result_total = 0;

		if (respuesta == "Sumatory") {
			for (int i = 0; i < amount; i++) {
				result = result + array[i];
				result_total = Integer.valueOf(result);
			}
			return result_total;
		}
		if (respuesta == "Subtraction") {
			result_total= number_1-number_2;
			return result_total;
			}

		if (respuesta == "Multiplication") {
			for (int i = 0; i < amount; i++) {
				result_m = result_m * array[i];
				result_total = Integer.valueOf(result_m);
			}
			return result_total;
		}
		if (respuesta == "Division") {
			result_total= number_1/number_2;
			return result_total;
		}
		return 0;
	}
}
