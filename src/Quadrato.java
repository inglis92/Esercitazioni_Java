import java.util.Scanner;
public class Quadrato {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserisci il numero di cui calcolare il quadrato: ");
        int n=sc.nextInt();
        CalcolaQuadrato(n);
    }
    private static int CalcolaQuadrato(int n) {
        int somma =0;
        int i = 0;
        for (i=0; i<n; i++){
            somma = somma + (2*i+1);
        }
        System.out.println(somma);
        return somma;
    }
}
