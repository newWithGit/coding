package virtusa;

public class MinMove {
    private static int minMove(int[] a, int[] m) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += count(a[i], m[i]);
        }
        return count;
    }

    private static int count(int a, int m) {
        int count = 0;
        if (a == m)
            return count;
        while(a > 0 || m >0) {
            int rem1 = a % 10;
            a = a / 10;

            int rem2 = m % 10;
            m = m /10;

            count += Math.abs(rem1 - rem2);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a= {123, 456, 789};
        int[] b= {231, 654, 980};
        System.out.println(minMove(a, b));
    }
}
