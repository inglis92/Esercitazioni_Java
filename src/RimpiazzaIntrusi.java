import java.util.Scanner;

public class RimpiazzaIntrusi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a=sc.nextLine();
        System.out.print("Enter string:");
        String b=sc.nextLine();
        System.out.print("Enter string:");
        String c=sc.nextLine();
        replaceIntruder(a, b, c);
    }

    private static void replaceIntruder(String a, String b , String c) {
        int i;
        String NewC = c.replace(a, b);
        System.out.println(NewC);
    }

}