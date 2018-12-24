package google;

import java.util.Arrays;

public class StringCompressionDecompression {
    public static void main(String[] args) {
        //decompress(String str);
        stringRevSpecialChar();
    }

    private static void stringRevSpecialChar() {
        String input = "a*d&e$f*******";//#dfg%fvvbg#ds@d;
        char[] array = input.toCharArray();
        char outArray[] = new char[input.length()];

        for (int i = 0; i < array.length; i++) {
            if (!(Character.isLetter(array[i]) || Character.isDigit(array[i]))) {
                outArray[i] = array[i];
            }
        }

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            if (Character.isLetter(array[i]) || Character.isDigit(array[i])) {
                while (outArray[j] != '\u0000') {
                    j++;
                }
                outArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(outArray));
    }
}
