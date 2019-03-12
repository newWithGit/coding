package virtusa;

public class CountPrimeSubstring {
    public static void main(String[] args) {

    }

    private static int[] countPrimeSubstring(final int number) {
        int input = number;
        while(input > 0) {

        }
        return null;
    }

    private static final boolean isPrime(int num) {
        boolean isPrime = true;
        if (num % 2 == 0)
            return false;
        if (num % 3 == 0)
            return false;
        if (num % 5 == 0)
            return false;
        for (int i = 7; i < Math.sqrt(num) + 1; i+=2 ) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
