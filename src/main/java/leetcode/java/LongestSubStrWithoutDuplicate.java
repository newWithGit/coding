package leetcode.java;

/**
 * Find the longest substring which have no duplicate
 * Trying with sliding window
 */
public class LongestSubStrWithoutDuplicate {
    static int idxOfNextElem;
    static int windowSize;
    static int maxSize;

    static void findLongestSubStr(String input) {
        int i, len = input.length();
        String str = input;
        for (i = 0; i< len;){
            // ifDuplicatePresent = false i.e no duplicate present in whole string so break from loop
            if (!ifDuplicatePresent(str, i, len)) {
                break;
            }
            i = ++idxOfNextElem;
        }
        System.out.println(maxSize);
    }
    /* Iterate through string
     * if duplicate found exit
     * Find till which char there is no duplicate, set it as idxOfNextElem
     * Find the length of window till duplicate check has been done, set it as windowSize
     */
    static boolean ifDuplicatePresent(String str, int idx, int strLen) {
        int[] letters = new int[128];
        int i = idx, val;
        boolean duplicatePresent = false;
        while(i < strLen) {
            val = str.charAt(i);
            letters[val]++;
            /*
             * if letters[val] > 1 character is getting repeated
             * so set window size = traversed - initial
             * idxOfNextElem = first occurence of repeating char is that substring
             */
            if (letters[val] > 1) {
                idxOfNextElem = getFirstOccurenceOfDupChar(str, idx, i, val);
                duplicatePresent = true;
                break;
            }
            i++;
        }
        windowSize = i - idx;
        if (maxSize < windowSize)
            maxSize = windowSize;
        return duplicatePresent;
    }

    static int getFirstOccurenceOfDupChar(String str, int startIdx, int endIdx, int val) {
        return str.substring(startIdx, endIdx+1).indexOf(val);
    }

    public static void main(String[] args) {
        findLongestSubStr("abcdcrtyuio");
    }
}
