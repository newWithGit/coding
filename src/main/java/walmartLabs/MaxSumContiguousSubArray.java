package walmartLabs;

public class MaxSumContiguousSubArray {

    public static void main(String[] args) {
        int[] arr = {-1,-9,8,25,-8,0,-36,36,-50};
        System.out.println(findMaxSum(arr));
    }

    private static int findMaxSum(int[] arr) {
        int sum = 0;
        int maxSum = 0;
        for(int i : arr) {
            sum += i;
            /*if (sum == 0 || sum > maxSum) {
                maxSum = sum;
            }*/

            if (sum < 0) {
                sum = 0;
            }

            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
