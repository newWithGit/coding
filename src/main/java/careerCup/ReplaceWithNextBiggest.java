package careerCup;

import java.util.Arrays;

/**
 * Replace each number by its next bigger number from right side of current index.
 * if no bigger number found print that number itself.
 * Eg: 2,5,9,6,3,4,8,15,12
 * OutPut : 3,6,12,8,4,8,12,15,12
 */
public class ReplaceWithNextBiggest {
    public static void main(String[] args) {
        int[] input = {2,5,9,6,3,4,8,15,12};
        ReplaceWithNextBiggest.replaceElements(input);
    }

    private static void replaceElements(final int[] input) {
        int[] output = new int[input.length];
        for (int i =0 ; i<input.length; i++) {
            int big = 0;
            for (int j = i ; j< input.length; j++ ) {
                if (input[j] > input[i]) {
                    if (big == 0)
                        big = input[j];
                    else if (big > input [j]) {
                        big = input[j];
                    }
                }
            }
            if (big != 0 ) {
                output[i] = big;
            } else {
                output[i] = input[i];
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
