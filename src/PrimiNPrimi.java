import java.util.*;
public class PrimiNPrimi {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Quanti numeri primi vuoi trovare?");
       int n = sc.nextInt();
       TrovaPrimi(n);
    }

    public static void TrovaPrimi(int n){
        for(int i=1; i < n; i++){

            boolean Primo = true;

        //Controllo se il numero sia primo
            for(int j=2; j < i ; j++){

                if(i % j == 0){
                    Primo = false;
                    break;
                }
            }
        // stampo il numero
            if(Primo)
                System.out.print(i + " ");
        }
    }
}
