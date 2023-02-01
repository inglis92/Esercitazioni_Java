import java.util.Arrays;
import java.util.Scanner;
public class Tabelline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserisci n: ");
        int n = sc.nextInt();
        System.out.println("Inserisci m:");
        int m = sc.nextInt();
        int [] array = new int[m];
        System.out.println(Arrays.toString(Tabellina(n,m)));
    }

    public static int[] Tabellina(int a, int b){
        int [] Array = new int[b];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = Array[i] * b;
        }

        return Array;
        
    }
}
