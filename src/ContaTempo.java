import java.util.Scanner;
public class ContaTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci il numero di secondi da analizzare: ");
        int secondi = sc.nextInt();
        Tempo(secondi);

    }
    private static int Tempo(int n){
        int giorni= 0;
        int ore = 0;
        int minuti = 0;
        if (n<=60) {
            System.out.println("Corrispondono a 0 giorni, 0 ore, e " + n + " secondi");
        } else if (n>60 && n<3600) {
            minuti = n/ 60;
        } else if (n>= 3600 && n< 86400){
            ore = n / 3600;}
        else if(n>= 86400){
            giorni = n/ 86400;}
            System.out.println("corrispondono a "+ giorni + "giorni, " + ore + "ore e "+ minuti+ "minuti");
        return minuti;
        }

    }

