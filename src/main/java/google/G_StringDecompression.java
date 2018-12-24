package google;

/**
 * String are provided in this fashion
 * Level 1 -
 *      Input - 2[ab]3[zxcf]4[abcd]
 *      Output - ababzxcfzxcfzxcfabcdabcdabcdabcd
 * Level 2 -
 *      Input - 2[3[zxcf]ab4[abcd]]
 *      Output - zxcfzxcfzxcfababcdabcdabcdabcdzxcfzxcfzxcfababcdabcdabcdabcd
 */
public class G_StringDecompression {
    public static void main(String[] args) {
        String input1 = "2[ab]3[zxcf]4[abcd]";
        String input2 = "2[3[zxcf]ab4[abcd]]";
        System.out.println(G_StringDecompression.decompressString(input1));
    }

    private static String decompressString(final String input) {
        char[] arr = input.replace("[", "").toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder tempSb = new StringBuilder();
        int loop = 0;
        for (Character c: arr) {
            if (Character.isDigit(c)) {
                loop = Character.digit(c, 10);
            } else if (c.equals(']')) {
                while (loop-- > 0) {
                    sb.append(tempSb);
                }
                tempSb = tempSb.delete(0, tempSb.length());
            } else {
              tempSb.append(c);
            }
        }
        return sb.toString();
    }
}
