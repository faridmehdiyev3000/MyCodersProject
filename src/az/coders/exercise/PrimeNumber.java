package az.coders.exercise;
public class PrimeNumber {

    public static void main(String[] args) {


        int n = 100, c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;

            }

        }

        if (c == 2) {
            System.out.println(n + "is a prime number");
        } else {
            System.out.println(n + "is not a prime number");
        }


    }
}

