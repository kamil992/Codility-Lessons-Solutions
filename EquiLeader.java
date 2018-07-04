package Codility;

import java.util.Arrays;

public class EquiLeader {
    public static void main(String[] args) {
        int[] A = {4, 3, 4, 4, 4, 2};

        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int counter = 0;

        int[] B = Arrays.stream(A)
                .sorted().toArray();

        //leader number
        int dominator = B[((B.length) / 2)];

        //number of leader
        int dominatorNum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == dominator)
                dominatorNum++;
        }

        int countOfDominator = 0;

        for (int i = 0; i < A.length; i++) {

            if (A[i] == dominator) {
                countOfDominator++;

            }
            int rightPart = (dominatorNum - countOfDominator);


            if (countOfDominator > ((i + 1) / 2) && rightPart > ((A.length - i - 1) / 2)) {
                counter++;
            }
        }

        return counter;
    }
}
