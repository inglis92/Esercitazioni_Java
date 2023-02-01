import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String s) {
        char[] ArrayStringaInvertita = new char[0];
        int i, j;
        for (i= s.length(); i<=0; i--) {
            for (j = 0; j < s.length(); j++) {
                ArrayStringaInvertita[i] = s.charAt(j);
            }
        }
        System.out.print(ArrayStringaInvertita);
    }
}