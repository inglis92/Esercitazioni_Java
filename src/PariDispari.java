import java.util.Scanner;

public class PariDispari {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number =sc.nextInt();
        checkEvenOdd(number);
    }

    private static void checkEvenOdd(int number) {
        int Resto = number % 2;
        if (Resto == 0){
           System.out.println("Il numero è pari");
        } else
            System.out.println("Il numero è dispari");
    }
}

