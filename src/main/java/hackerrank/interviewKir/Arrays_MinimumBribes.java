package hackerrank.interviewKir;

public class Arrays_MinimumBribes {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 3, 7, 8, 6, 4};
        //1 2 5 3 7 8 6 4
        /**
         * 12345678
         * 1 2 5 3 7 8 6 4
         *    -3  2     2 2
         * 1 2 3 4 5 6 7 8
         * 0 0 2-1 2 2-1-4
         * 12354678 - 1
         * 12534678 - 1
         * 12536478 - 1
         * 12536748 - 1
         * 12536784 - 1
         * 12537684 - 1
         * 12537864 - 1
         */
        //1 2 3 4 5 6 7 8
        Arrays_MinimumBribes.minimumBribes(input);
    }

    static void minimumBribes(final int[] q) {
        int forward = 0, backword = 0;
        for (int i = 0; i<q.length; i++) {
            if (q[i]-(i+1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, q[i]-2); j<i; j++) {
                if (q[j] > q[i]) {
                    forward ++;
                }
            }

        }
        System.out.println(forward);
    }
}
