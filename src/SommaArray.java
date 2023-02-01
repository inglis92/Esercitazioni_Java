import java.util.Arrays;

public class SommaArray {
    public static void main(String[] args) {
        int [] arrayInteri = new int[]{1,2,3,4,5,6,7,8,9,10};
        SommaRicorsivaArray(arrayInteri);
    }
    public static int SommaRicorsivaArray(int[] arrayInteri){
        int somma = Arrays.stream(arrayInteri).sum();
        System.out.println(somma);
        return somma;
    }
}
