public class Cruciverba {
    public static void main(String[] args) {
        char[][] array = new char[][]{{'h', 'd', 'g', 'u', 'p', 'y', 's', 'p', 'a', 'o'}, {'t', 's', 'a', 'k', 'o', 'y', 'o', 'l', 'p', 's'}, {'r', 'c', 'm', 'c', 'n', 'r', 'i', 'a', 'a', 'b'}, {'i', 'o', 'b', 'a', 'i', 's', 'c', 't', 'l', 'a'}, {'g', 'r', 'e', 'l', 'f', 'a', 'c', 'e', 'o', 'l'}, {'l', 'f', 'r', 'a', 'l', 'l', 'u', 's', 'i', 'e'}, {'i', 'a', 'e', 'm', 'e', 'm', 'l', 's', 'l', 'n'}, {'a', 'n', 't', 'a', 'd', 'o', 'c', 'a', 'g', 'a'}, {'j', 'o', 't', 'r', 'b', 'n', 'd', 'g', 'o', 'd'}, {'l', 'y', 'o', 'o', 'u', 'e', 's', 'm', 's', 'm'}};
        cruciverba(array, "luccio");
    }
    public static boolean cruciverba(char[][] matrice, String parola) {
        //cerco la prima lettera scorrendo con doppio for righe e colonne
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                //prendo l' i-j- esimo carattere della matrice e controllo se coincide con la prima lettera
                //della parola da cercare
                char carattere = matrice[i][j];
                if (carattere != parola.charAt(0)) {
                    continue;
                }
                //considero la casella in alto controllando che sia la seconda lettera della parola
                //cerco in tutte le direzioni possibili
                //direzione alto
                if (i > parola.length() - 1 && matrice[i - 1][j] == parola.charAt(1)) {
                    //se anche il terzo carattere corrisponde, può essere la direzione giusta
                    char partenza = matrice[i - 2][j]; // partendo dal terzo carattere
                    int contatore = 2; //numero di caratteri controllati e risultati uguali
                    // finché numero caratteri = raggiunge la lunghezza della parola
                    // e al passo successivo ( dopo agg contatore) ho ancora caratteri uguali
                    // aggiorno il carattere di partenza al successivo passaggio di while
                    while (contatore < parola.length() && partenza == parola.charAt(contatore)) {
                        contatore++;
                        partenza = matrice[i - contatore][j];
                    }
                    // quando contatore raggiunge la lunghezza della parola cercata, ho trovato la parola
                    if (contatore == parola.length()) return true;
                }
                //direzione destra
                if (matrice[0].length - j > parola.length() && matrice[i][j + 1] == parola.charAt(1)) {
                    //se anche il terzo carattere corrisponde, può essere la direzione giusta
                    char partenza = matrice[i][j - 2]; // partendo dal terzo carattere
                    int contatore = 2; //numero di caratteri controllati e risultati uguali
                    // finché numero caratteri = raggiunge la lunghezza della parola
                    // e al passo successivo ( dopo agg contatore) ho ancora caratteri uguali
                    // aggiorno il carattere di partenza al successivo passaggio di while
                    while (contatore < parola.length() && partenza == parola.charAt(contatore)) {
                        contatore++;
                        partenza = matrice[i][j + contatore];
                    }
                    // quando contatore raggiunge la lunghezza della parola cercata, ho trovato la parola
                    if (contatore == parola.length()) return true;
                }
                //direzione basso
                if (matrice.length - i > parola.length() && matrice[i + 1][j] == parola.charAt(1)) {
                    //se anche il terzo carattere corrisponde, può essere la direzione giusta
                    char partenza = matrice[i + 2][j]; // partendo dal terzo carattere
                    int contatore = 2; //numero di caratteri controllati e risultati uguali
                    // finché numero caratteri = raggiunge la lunghezza della parola
                    // e al passo successivo ( dopo agg contatore) ho ancora caratteri uguali
                    // aggiorno il carattere di partenza al successivo passaggio di while
                    while (contatore < parola.length() && partenza == parola.charAt(contatore)) {
                        contatore++;
                        partenza = matrice[i + contatore][j];
                    }
                    // quando contatore raggiunge la lunghezza della parola cercata, ho trovato la parola
                    if (contatore == parola.length()) return true;
                }
                //direzione sinistra
                if (j >= parola.length() - 1 && matrice[i][j - 1] == parola.charAt(1)) {
                    //se anche il terzo carattere corrisponde, può essere la direzione giusta
                    char partenza = matrice[i][j - 2]; // partendo dal terzo carattere
                    int contatore = 2; //numero di caratteri controllati e risultati uguali
                    // finché numero caratteri = raggiunge la lunghezza della parola
                    // e al passo successivo ( dopo agg contatore) ho ancora caratteri uguali
                    // aggiorno il carattere di partenza al successivo passaggio di while
                    while (contatore < parola.length() && partenza == parola.charAt(contatore)) {
                        contatore++;
                        partenza = matrice[i][j - contatore];
                    }
                    // quando contatore raggiunge la lunghezza della parola cercata, ho trovato la parola
                    if (contatore == parola.length()) return true;
                }
            }
        }
        return false;
    }
}
