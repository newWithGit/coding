package Test;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {

    public static void main(String[] args) {
        int[] inputArr = {9,7,5,3};
        int divisor = 6;

        /*int[] inputArr = {92,75,65,48,45,35};
        int divisor = 10;*/

        /*int[] inputArr = {91,74,66,48};
        int divisor = 10;*/

        /*int[] inputArr = {1,2,66,48};
        int divisor = 10;*/

        System.out.println(checkIfPairingIsPossible(inputArr, divisor));
    }

    private static boolean checkIfPairingIsPossible(int[] input, int divisor) {
        int[] modifiedArray = input.clone();

        for (int i = 0; i < input.length; i++) {
            modifiedArray[i] = modifiedArray[i] % divisor;
        }

        Map<Integer, Integer> elements = new HashMap<>();

        for (int i : modifiedArray) {
            if (elements.containsKey(i))
                elements.put(i, (elements.get(i) + 1));
            else {
                elements.put(i, 1);
            }
        }

        for (int i : modifiedArray) {
            int numberToFind = Math.abs(i - divisor);
            if (!elements.containsKey(numberToFind)) {
                return false;
            } else {
                int frequency = elements.get(numberToFind);
                if (frequency > 1) {
                    elements.put(numberToFind, frequency--);
                } else {
                    elements.remove(numberToFind);
                }
            }
        }

        return true;
    }

}
