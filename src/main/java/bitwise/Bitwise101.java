package bitwise;

public class Bitwise101 {
    public static void main(String[] args) {
        int a = 6;
        System.out.println(Integer.toBinaryString(a));
        int b = 9;
        // << left shift is equivalent to multiplication with 2
        // >> right shift is equivalent to division with 2
        System.out.println(String.format("b << 1 = %d", b >> 1));

        // The value of expression (x & 1) would be non-zero only if x is odd,
        // otherwise the value would be zero
        System.out.println(b & 1);

        System.out.println(8&6);
        System.out.println(4|3);
        System.out.println(25>>>2);
    }
}
