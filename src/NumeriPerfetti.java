public class NumeriPerfetti {
    // Java program to check if a given
    // number is perfect or not

        // Returns true if n is perfect
        static boolean isPerfect(int n)
        {
            // sum will store the sum of proper divisors
            // As 1 is a proper divisor for all numbers
            // initialised sum with 1
            int sum = 1;

            // Looping through the numbers to check if they are
            // divisors or not
            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    sum += i;
                }

            }

            // If sum of divisors is equal to
            // n, then n is a perfect number
            if (sum == n && sum !=1)
                return true;

            return false;
        }

        // Driver program
        public static void main(String[] args)
        {
            int n = 1000;
            for (int i = 0; i < n; i++) {
                if (isPerfect(i))
                    System.out.println(i);
            }
        }
    }
