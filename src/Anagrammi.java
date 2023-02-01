import java.util.Scanner;

public class Anagrammi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a:");
        String a = sc.nextLine();
        System.out.print("Enter string b:");
        String b = sc.nextLine();
        anagrams(a, b);
    }

    static void anagrams(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i) || a.length() != b.length()) {
                System.out.println("non anagrammi");
            } else System.out.println("anagrammi");
        }
    }
}




