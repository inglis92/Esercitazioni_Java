import java.util.Scanner;

    public class OperazioniAritmetiche {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a:");
            int a=sc.nextInt();
            System.out.print("Enter b:");
            int b=sc.nextInt();
            computeValues(a, b);
        }

        private static void computeValues(int a, int b) {
            int Somma, Prodotto, Differenza, Divisione;
            Somma = a + b;
            Differenza = a-b;
            Prodotto = a*b;
            Divisione = a/b;

            System.out.println("La somma tra i due numeri è: " + Somma + ".");
            System.out.println("La differenza tra i due numeri è: " + Differenza + ".");
            System.out.println("Il prodotto tra i due numeri è: " + Prodotto + ".");
            System.out.println("La divisione tra i due numeri è: " + Divisione + ".");
        }
    }
