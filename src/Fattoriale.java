public class Fattoriale {
    public static void main(String[] args) {
        System.out.println(factorial(1) == (0));
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);
    }

    private static int factorial(int n) {
        int fattoriale = 1;
        if (n==1){
            fattoriale = 0;
        }
        for (int i = 1; i <= n; i++) fattoriale = fattoriale * i;
        return fattoriale;

    }

}
