package hiteshSaturdayChallenge;

import java.util.*;

/**
 * https://www.youtube.com/watch?v=a4Py6rrf2Dk
 * 100001
 * 111111
 * 000001
 *
 */

public class ClassicCookieProblem {

    static Queue<Coordinates> chips;
    static List<Integer> result;
    static int cookieCount = 0;
    static int[] chipLenght(int[][] cookie) {
        int len = cookie.length, width = cookie[0].length, i, j;
        System.out.println(len + " " + width);
        chips  = new LinkedList<>();
        result = new ArrayList<>();
        for (i = 0; i < len; i++) {
            for(j = 0; j < width; j++) {
                if (cookie[i][j] == 1) {
                    chips.add(new Coordinates(i,j));
                    cookieCount += 1;
                    checkNeighbours(i, j, cookie, len, width);
                }
                if (cookieCount > 0)
                    result.add(cookieCount);
                cookieCount = 0;
            }
        }
        System.out.println(result);
        return null;
    }

    static void checkNeighbours(int i, int j, int[][] cookie, int len, int width) {
        cookie[i][j] = -1;
        // left
        if (j > 0 && cookie[i][j--] == 1) {
            chips.add(new  Coordinates(i, j--));
            //cookie[i][j--] = -1;
            cookieCount += 1;
        }
        // right
        if (j < width && cookie[i][j+1] == 1) {
            chips.add(new Coordinates(i, j+1));
            //cookie[i][j+1] = -1;
            cookieCount += 1;
        }
        // above
        if (i > 0  && cookie[i--][j] == 1) {
            chips.add(new Coordinates(i--, j));
            //cookie[i--][j] = -1;
            cookieCount += 1;
        }
        // below
        if (i < len && cookie[i+1][j] == 1) {
            chips.add(new Coordinates(i+1, j));
            //cookie[i+1][j] = -1;
            cookieCount += 1;
        }
        while (!chips.isEmpty()) {
            System.out.println(Arrays.deepToString(cookie));
            Coordinates c = chips.remove();
            checkNeighbours(c.getI(), c.getJ(), cookie, len, width);
        }
    }

    public static void main(String[] args) {
        int[][] cookie = {
                {1,0,0,0,0,1},
                {1,1,1,1,1,1},
                {0,0,0,0,0,1}
        };
        chipLenght(cookie);
    }

    static class Coordinates {
        int i;
        int j;
        public Coordinates(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public Coordinates() {}

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }
}
