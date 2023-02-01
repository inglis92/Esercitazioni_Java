import java.util.*;
public class CriptaDecripta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j,k=3;//k è la chiave
        String p="";//p:parola da elaborare
        System.out.print("inserisci parola:");
        p=sc.nextLine();//parola da crittare o decrittare
        p=p.replaceAll(" ","" );//elimina gli eventuali spazi
        System.out.println(p);
        System.out.print("codifica(1) o decodifica(2)?:");
        j=sc.nextInt();
        if(j==1)System.out.println(Cripta(p,k));
        else if(j==2)System.out.println(Decripta(p,k));
        else System.out.println("errore digita 1 o 2");
    }//fine main

       /* if ( funzione.toLowerCase() == "codificare"){
            System.out.println("inserisci la frase da codificare: ");
            String fraseInput = sc.nextLine();
            String fraseInputSenzaSpazi = fraseInput.replaceAll(" ","");
            Cripta(fraseInputSenzaSpazi, chiave);
        } else if (funzione.toLowerCase() == "decodificare") {
            System.out.println("inserisci la frase da decodificare: ");
            String fraseInput = sc.nextLine();
            String fraseInputSenzaSpazi = fraseInput.replaceAll(" ", "");
            Decripta(fraseInputSenzaSpazi, chiave);
        }*/

        //else System.out.println("Inserisci un'operazione corretta da eseguire");


    public static String Cripta(String s, int k){
        String c= "";
        int ascii;
        for (int i = 0; i < s.length(); i++) {
            ascii = (int)s.charAt(i) + k;
            c+=(char)ascii;//converto il codice ASCII nella lettera corrispondente

        }

    return c;
    }
    public static String Decripta(String st, int k){
        int j;
        String c="";
        for(int i=0;i < st.length();i++){
            j=(int)st.charAt(i)-k;//nuovo codice ASCII della lettera attuale
            c+=(char)j;//converto il codice ASCII nella lettera corrispondente
        }//fine for
        return c;//parola decodificata
    }//fine decodifica
}
