package Test;

public class StarPattern {

    public static void main(String[] args) {
        printPyramid(7);
    }

    private static void printPyramid(final int lines) {
        for (int i = 0; i < lines; i++) {

            for (int j = lines-i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int k = i; k >= 0; k-- ) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
