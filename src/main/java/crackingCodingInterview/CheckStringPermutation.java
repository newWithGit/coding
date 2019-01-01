package crackingCodingInterview;

import java.util.Arrays;
/**
 * Check if one string is permutation of another
 */
public class CheckStringPermutation {
    public static void main(String[] args) {
        //System.out.println(checkIfPermutation("abc", "cba"));
        System.out.println(checkForPermutationFreqCheck("sdsad", "dassd"));
    }

    /*
     * if length of string varies - return false
     * sort the strings, check s1.charAt(i) == s2.charAt(i)
     * if loop exists with all true - retrun true, else false
     *
     */
    static boolean checkIfPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int k = 0;
        while(k < s1.length()) {
            if (c1[k] != c2[k])
                return false;
            k++;
        }
        return true;
        /*System.out.println(Arrays.toString(c1) + " " + Arrays.toString(c2));
        return c1.equals(c2);*/
    }

    /*
     * Check without using sort and one array
     *
     */
    static boolean checkForPermutationFreqCheck(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] letter = new int[128];
        char[] c1 = s1.toCharArray();
        for (char c : c1) {
            letter[c]++;
        }
        char[] c2 = s2.toCharArray();
        for (char c : c2) {
            letter[c]--;
            if (letter[c] < 0)
                return false;
        }
        return true;
    }
}
