package elementsOfProgrammingInterview.arrays;

import java.util.Arrays;

public class DutchFlagProblem {

    private static void reorderArrays(final int[] arr, final int pivotal) {
        int[] input = new int[arr.length];
        int newArrIdx = 0, idx = 0;
        // iterate and add all the elements less than pivotal
        idx = 0;
        while(idx < arr.length) {
            if (arr[idx] < arr[pivotal]) {
                input[newArrIdx++] = arr[idx];
            }
            idx++;
        }

        // iterate and add all the equal to pivotal
        idx = 0;
        while(idx < arr.length) {
            if (arr[idx] == arr[pivotal]) {
                input[newArrIdx++] = arr[idx];
            }
            idx++;
        }

        // iterate and add all the elements > than pivotal
        idx = 0;
        while(idx < arr.length) {
            if (arr[idx] > arr[pivotal]) {
                input[newArrIdx++] = arr[idx];
            }
            idx++;
        }

        System.out.println(Arrays.toString(input));
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,5,2,3,4,8,9,1,10,5};
        reorderArrays(arr, 3);
    }
}
