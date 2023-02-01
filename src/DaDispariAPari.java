import java.util.Arrays;

public class DaDispariAPari {
    public static void main(String[] args) {
        int [] array = new int[]{1,3,4,5,6,7,9,10,13};
        System.out.println(Arrays.toString(DispariaPari(array)));
    }
    public static int[] DispariaPari(int[] Array){
        for (int i = 0; i < Array.length; i++) {
            if ((Array[i]%2)!= 0){
                Array[i]= Array[i] * 2;
            }
        }
        return Array;
    }
}
