import java.util.*;
public class PalindromaRicorsiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci la stringa da controllare: ");
        String stringaInput = sc.nextLine();
        System.out.println(isPalindrome(stringaInput));
    }

    static boolean isPalindrome(String str)
    {
        //Ritorno vero se la stringa ha 0 o 1 carattere
        if(str.length() == 0 || str.length() == 1)
            return true;
        //Se la stringa ha più caratteri
        //Controllo ricorsivamente se la prima e ultima lettera coincidono, anche le sottostringhe.
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));
        return false;
    }

}
