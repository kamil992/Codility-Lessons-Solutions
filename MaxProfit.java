package Codility;

public class MaxProfit {

    public static void main(String[] args) {
        int[] A = new int[6];

        A[0] = 23171;
        A[1] = 21011;
        A[2] = 21123;
        A[3] = 21366;
        A[4] = 21013;
        A[5] = 21367;

        System.out.println(solution(A));
    }

    public static int solution(int[] A){

        if(A.length == 0 || A.length == 1)
            return 0;

        int min = A[0];
        int maxProfit = 0;

        for(int i = 1; i < A.length; i++){
            maxProfit = Math.max(maxProfit, A[i] - min);
            min = Math.min(A[i], min);
        }
        return maxProfit;
    }
}
