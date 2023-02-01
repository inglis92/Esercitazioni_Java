public class Armonica {
    public static void main(String[] args) {
        System.out.println(harmonicSum(0) == (0));
        System.out.println(harmonicSum(1) == (1));
        System.out.println(harmonicSum(2) == (3/2));
        System.out.println(harmonicSum(3) == (11/6));
    }

    private static double harmonicSum(int n) {
        int sommaArmonica =1;
        if (n == 0) {
            sommaArmonica = 0;
        } else if (n == 1) {
            sommaArmonica = 1;
        }else{
        for (int i = 2; i <= n; i++) {
            sommaArmonica = 1+(1 / i);
        }}
        return sommaArmonica;
    }
}
