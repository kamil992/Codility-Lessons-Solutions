package Codility;

public class MaxDoubleSliceSum {
    public static void main(String[] args) {
        int[] A = new int[8];
        A[0] = 3;
        A[1] = 2;
        A[2] = 6;
        A[3] = -1;
        A[4] = 4;
        A[5] = 5;
        A[6] = -1;
        A[7] = 2;

        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        int[] A1 = new int[A.length];
        int[] A2 = new int[A.length];
        int result = 0;
        for(int i = 1; i < A.length - 1; i++){
            A1[i] = Math.max(0, A1[i - 1] + A[i]);
        }

        for(int i = A.length - 2; i > 0; i--){
            A2[i] = Math.max(0, A2[i + 1] + A[i]);
        }
        for(int i = 1; i < A.length - 1; i++){
            result = Math.max(result, A1[i - 1] + A2[i + 1]);
        }
        return result;
    }
}
