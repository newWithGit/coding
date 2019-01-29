package GS;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {
    final private static void findDegree(final int[] arr) {
        Map<Integer, int[]> map = new HashMap<>();
        int maxFre = 0, startIdx = 0, endIdx = 0;
        for (int i = 0; i<arr.length; i++ ) {
            int[] a = new int[3]; // will store frequency, starting index, last repeating index till now
            if (map.get(arr[i]) != null) {
                a = map.get(arr[i]);
                a[0] = ++a[0]; // updating frequency
                a[2] = i;
                if (maxFre < a[0]) {
                    maxFre = a[0];
                    startIdx = a[1];
                    endIdx = a[2];
                } else if (maxFre == a[0] && (endIdx - startIdx > a[2] - a[1])) {
                    maxFre = a[0];
                    startIdx = a[1];
                    endIdx = a[2];
                }
            } else {
                a[0] = 1;
                a[1] = i;
                a[2] = i;
                map.put(arr[i], a);
            }
        }

        System.out.println(String.format("maxFreq = %d, startIdx = %d, endIdx = %d", maxFre, startIdx, endIdx));
    }

    final private static void updateDegree(final int[] a, int maxFre, int startIdx, int endIdx) {
        maxFre = a[0];
        startIdx = a[1];
        endIdx = a[2];
    }

    public static void main(String[] args) {
        findDegree(new int[]{1,2,1,5,2,6,1,9,2});
    }
}
