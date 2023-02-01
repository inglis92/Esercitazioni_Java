
    import java.util.Scanner;

    public class ContaOccorrenze {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter character a:");
            String a = sc.nextLine();
            System.out.print("Enter string b:");
            String b =sc.nextLine();
            countOccurrences(a.charAt(0), b);
        }

        static int countOccurrences(char a, String b) {
            int i, NumeroOccorrenze;
            NumeroOccorrenze = 0;
            for (i=0; i<b.length();i++){
                if (b.charAt(i)==a){
                    NumeroOccorrenze++;
                }
            }
            System.out.println(NumeroOccorrenze);
            return NumeroOccorrenze;
        }
    }

