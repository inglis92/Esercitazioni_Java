public class IsPalindroma {
    public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(!isPalindrome("absca"));
        System.out.println(!isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }

    private static boolean isPalindrome(String s) {
        if(s == null)
            return false;

        //Se la parole è di un solo carattere allora sarà sicuemente palindroma
        if(s.length() < 2)
            return true;


        boolean palindroma = true;
        int startIndex = 0;
        int endIndex = s.length()-1;

		/* Uso due indici uno che parte dalla prima posizione e verrà
		   incrementato di uno ad ogni iterazione e un'altro indice che parte
		   dall'ultima posizione della frase e verrà decrementato di uno
		   ad ogni iterazione*/
        for(; startIndex < endIndex; startIndex++, endIndex-- ) {
			/* Ad ogni iterazione controllo i due valori che si
			   trovano nelle posizioni puntate dai due indici.
			   Se sono diversi il contenuto di 'word' non sarà palindroma */
            if(s.charAt(startIndex) != s.charAt(endIndex)) {
                palindroma = false;
                break;
            }
        }

        return palindroma;
    }
    }

