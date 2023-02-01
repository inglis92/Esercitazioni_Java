import java.util.Scanner;
public class StampaVocaliEConsonanti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci la parola da analizzare: ");
        String frase = sc.nextLine();
        QuanteVocaliConsonanti(frase);
    }

    private static int QuanteVocaliConsonanti(String s) {
        int numeroconsonanti = 0, numerovocali = 0;
        for (int i = 0; i < s.length(); i++) {
            char lettera = s.charAt(i);
            if (lettera == 'a' || lettera == 'e' || lettera == 'i' || lettera == 'o' || lettera == 'u') {
                numerovocali++;
            } else if (lettera!=' ')
                numeroconsonanti++;


        }
        System.out.println("Nel tuo input ci sono " + numerovocali + " vocali e " + numeroconsonanti + " consonanti");
        return numeroconsonanti;
    }
}
