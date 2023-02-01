import java.util.*;
import java.util.Comparator;
import java.util.Scanner;
public class MinimoMassimo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers (comma-separated):");
        String a = sc.nextLine();
        int[] values = parseNumbers(a);
        computeMinAndMax(values);
    }

    static int[] parseNumbers(String s) {
        //divido la stringa togliendo le virgole
        String [] arrayNumeriStringa = s.split(",");
        // creo nuovo array dove salvare le stringhe trasformate in numeri
        int[] arrayNumeri  = new int[arrayNumeriStringa.length];
        // scrivo le stringhe di numeri in un nuovo array sottoforma di cifre.
        for (int i = 0; i < arrayNumeri.length; i++)
           arrayNumeri[i] = Integer.parseInt(arrayNumeriStringa[i]);
        //creo un array della stessa dimensione dell'array di cifre
        int [] arrayNumeriOrdinato = new int[arrayNumeri.length];
        //ordino l'arrayNumeri in ordine crescente
        Arrays.sort(arrayNumeri);
        System.out.println("Array in ordine crescente: ");
        System.out.println(Arrays.toString(arrayNumeri));
        return arrayNumeri;
    }
        static void computeMinAndMax(int[] values) {
            int[] valori = new int[values.length];
            int min, max;
            min = max = valori[0];

            for (int i = 0; i < valori.length; i++) {

                if (valori[i] < min)
                    min = valori[i];
                if(valori[i] > max){
                    max = valori[i];
                }
            }
            System.out.println("min is: " + min + "; max is: " + max);
        }
}

