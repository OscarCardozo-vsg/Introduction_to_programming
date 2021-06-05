package usta.fis;

public class Main {

    public static void main(String[] args) {
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            int serie = 0;
            p_show_info_program();
            System.out.println("Type the number fibonacci");
            serie = keyboard.nextInt();
            int fibo_array[] = new int[100];
            fibo_array = series_fibonacci(serie, fibo_array);
            System.out.println("The series fibonacci for the number " + serie + " is:");
            while (fibo_array[i] != -1){ //fibo_array[i]>=0, ó fibo_array[i]!=-1 {
                if (fibo_array[i+1] != -1) {
                    System.out.print(fibo_array[i] + ", ");
                }else{
                    System.out.println((fibo_array[i]));
                }
                i++
            }

            public static void p_show_info_program(){
                // DATE: 03/05/2021
                // DESCRIPTION: This array show you the Fibonacci sequence
                System.out.println("--------------------------------------------");
                System.out.println("         ARRAYS EXAMPLE                     ");
                System.out.println("      Maker:Juan Felipe Villanueva Arias    ");
                System.out.println("        DESCRIPTION:Array Fibonacci sequence");
                System.out.println("--------------------------------------------");
            }

            public static int[] series_fibonacci(int v_limit, int[] fibo_array) {
                fibo_array[0] = 0;
                fibo_array[1] = 1;
                for (int i = 1; fibo_array[i - 1] + fibo_array[i] < v_limit; i++) {
                    fibo_array[i + 1] = fibo_array[i - 1] + fibo_array[i];
                    fibo_array[i + 2] = -1;
                }
                return fibo_array;
            }
        }
    }
}
    }
}
