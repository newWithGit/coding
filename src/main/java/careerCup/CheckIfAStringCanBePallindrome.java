package careerCup;

/*
 Logic - in a palindrome at max one char can be odd numbered eg - 'abba' / 'aba'
 */
public class CheckIfAStringCanBePallindrome {

    static boolean checkIfCanBePallindrome(String s) {
        int[] letters = new int[128];
        int countOddStr = 0, idx = 0, val;
        for(; idx < s.length(); idx++) {
            val = s.charAt(idx);
            letters[val]++;
            if (letters[val] % 2 > 0) {
                countOddStr++;
            } else {
                countOddStr--;
            }
        }
        if (countOddStr > 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfCanBePallindrome("aba"));
    }
}
