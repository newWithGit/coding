package hackerrank.interviewKir;

public class Array_HourGlass {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };
        //System.out.println(arr[0].length);
        System.out.println(hourglassSum(arr));
    }

    static int hourglassSum(int[][]arr) {
        int sum = 0, maxSum = Integer.MIN_VALUE, len = arr.length, bre = arr[0].length;

        int row = 0, col = 0;
        while (col <= bre -3 ) {
            sum = arr[row][col] + arr[row][col+1]+ arr[row][col+2]+ arr[row+1][col+1] +
                    arr[row+2][col] + arr[row+2][col+1]+ arr[row+2][col+2];
            if (sum > maxSum)
                maxSum = sum;
            col ++;
            if (col == bre - 2) {
                row++;
                col = 0;
            }
            if (row == len - 2)
                break;
        }
        return maxSum;
    }
}
