package ola;
import java.util.Arrays;

/**
 * Problem : A man is standing at ground with a gun, and many men are dropping from sky at
 * different speed. Men are at different height and different speed.
 * Man on ground can shoot one man at each second. Even if one man dropping from sky makes to ground
 * the game is over and man on the ground looses.
 * 1) you have to find out that will man with gu will survive or not
 * 2) in what sequence he should shoot the men.
 *
 * Input - two array, first array gives height of each man from ground, second gives speed of dropping
 * Output - whether man with gun will survive or not, in what sequence he should shoot
 */
public class OLA_ShotGunProblem {

    private final static int[] heightArr = {100, 50, 400, 30, 200, 1000};
    private final static int[] speedArr = {2, 5, 10, 1, 3, 10};
    private static int[] killSequence = new int[heightArr.length];

    public static void main(String[] args) {
        System.out.println(OLA_ShotGunProblem.willManSurvive());
        System.out.println(Arrays.toString(killSequence));
    }

    private final static boolean willManSurvive() {

        int[] timeTakenArray = OLA_ShotGunProblem.calculateTimeArray();
        System.out.println(Arrays.toString(timeTakenArray));
        int[] cloneArr = timeTakenArray.clone();

        Arrays.sort(cloneArr);

        for (int i = 0; i < cloneArr.length-1 ; i++) {
            if (cloneArr[i] == cloneArr[i+1]) return false;
        }
        OLA_ShotGunProblem.getKillSequence(timeTakenArray,cloneArr);
        return true;
    }

    private final static int[] calculateTimeArray() {
        int noOfPerson = OLA_ShotGunProblem.heightArr.length;
        int[] timeTakenArray = new int[noOfPerson];
        for (int i = 0; i < noOfPerson; i++) {
            timeTakenArray[i] = OLA_ShotGunProblem.heightArr[i] / OLA_ShotGunProblem.speedArr[i];
        }
        return timeTakenArray;
    }

    private final static void getKillSequence(final int[] timeTakenArray,final int[] cloneArr){
        for (int i = 0; i<cloneArr.length; i++) {
            //OLA_ShotGunProblem.killSequence[i] = Arrays.binarySearch(timeTakenArray, timeTakenArray[i]);
        }
    }
}
