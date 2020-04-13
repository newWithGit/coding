package leetcode.java;

import java.util.Arrays;
/**
 * Median - If length is odd - (n-1)/2
 *          If Length is even - [n/2 + (n-1)/2]/2
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {5,7,19,26,56,89};
        int[] arr2 = {25,27,39,46,66,79};

        //bruteForce(arr1, arr2);
        optimalSolution(arr1, arr2);
    }
    // combine the arrays , sort them and then find median
    static void bruteForce(final int[] arr1, final int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i<arr1.length ; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i<arr2.length ; i++) {
            merged[i + arr1.length] = arr2[i];
        }

        Arrays.parallelSort(merged);
        System.out.println(Arrays.toString(merged));

    }

    // Optimal solution recursive
    /**
     * 1) Calculate the medians m1 and m2 of the input arrays ar1[]
     *    and ar2[] respectively.
     * 2) If m1 and m2 both are equal then we are done.
     *      return m1 (or m2)
     * 3) If m1 is greater than m2, then median is present in one
     *    of the below two subarrays.
     *     a)  From first element of ar1 to m1 (ar1[0...|_n/2_|])
     *     b)  From m2 to last element of ar2  (ar2[|_n/2_|...n-1])
     * 4) If m2 is greater than m1, then median is present in one
     *    of the below two subarrays.
     *    a)  From m1 to last element of ar1  (ar1[|_n/2_|...n-1])
     *    b)  From first element of ar2 to m2 (ar2[0...|_n/2_|])
     * 5) Repeat the above process until size of both the subarrays
     *    becomes 2.
     * 6) If size of the two arrays is 2 then use below formula to get
     *   the median.
     *     Median = (max(ar1[0], ar2[0]) + min(ar1[1], ar2[1]))/2
     */

    static void optimalSolution(final int[] arr1, final int[] arr2) {
        int len1  = arr1.length, len2 = arr2.length;
        if (len1 == 2 &&  len2 == 2) {
            int median= (Math.max(arr1[0], arr1[1]) + Math.min(arr2[0], arr2[1])) / 2;
            System.out.println(median);
            return;
        }
        float med1 , med2 ;

        if (len1%2 == 0) {
            med1 = (arr1[len1/2] + arr1[(len1-1)/2])/2;
        } else {
            med1 = arr1[(len1-1)/2];
        }

        if (len2%2 == 0) {
            med2 = (arr2[len2/2] + arr2[(len2-1)/2])/2;
        } else {
            med2 = arr2[(len2-1)/2];
        }

        if (med1 > med2) {
            optimalSolution(Arrays.copyOfRange(arr1, 0, len1/2), Arrays.copyOfRange(arr2, (len2-1)/2, len2));
        } else if (med1 < med2) {
            optimalSolution(Arrays.copyOfRange(arr1, (int) (len1-1)/2, len1), Arrays.copyOfRange(arr2, 0, len2/2));
        } else {
            System.out.println(med1);
            return;
        }

    }

}
