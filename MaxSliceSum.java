package Codility;

public class MaxSliceSum {
    public static void main(String[] args) {

        int[] A = new int[5];
        A[0] = 3;
        A[1] = 2;
        A[2] = -6;
        A[3] = 4;
        A[4] = 0;

        int[] B = new int[]{-2,1,1};

        System.out.println(solution(B));

    }

    public static int solution(int[] A){
        int maxEnd = A[0];
        int result = A[0];


        for(int i = 1; i < A.length; i++){
            maxEnd = Math.max(maxEnd + A[i], A[i]);
            result = Math.max(maxEnd, result);
        }

        return result;
    }
}
