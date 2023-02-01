 import java.util.Arrays;
 import java.util.Scanner;

    public class Fibonacci {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter index:");
            int index =sc.nextInt();
            fibonacci(index);
        }

        static void fibonacci(int index) {
            int[] Fibonacci = new int[index];
            int somma= 0;
            Fibonacci[0] = 0;
            Fibonacci[1] = 1;
            for (int i = 2; i < Fibonacci.length; i++) {
                Fibonacci[i] = Fibonacci[i] + Fibonacci [i-1]+ Fibonacci [i-2];
                somma = Fibonacci[i] + Fibonacci [i-1]+ Fibonacci [i-2];
            }

            System.out.println((somma));
        }
    }

