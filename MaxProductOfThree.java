package Codility;

import java.util.Arrays;

//todo
public class MaxProductOfThree {

    public static void main(String[] args) {
        int[] A = new int[6];
        A[0] = -3;
        A[1] = 1;
        A[2] = 2;
        A[3] = -2;
        A[4] = 5;
        A[5] = 6;

        System.out.println(solution(A));
    }


    public static int solution(int[] A){
        Arrays.sort(A);
        int maxThree = 1;

        for(int i = A.length - 3 ; i < A.length; i++){
            maxThree *= A[i];
        }
        int otherMax = A[0] * A[1] * A[A.length - 1];


        return maxThree = (maxThree > otherMax) ? maxThree : otherMax;
    }
}
