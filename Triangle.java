package Codility;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] A = new int[6];
        A[0] = 10;
        A[1] = 2;
        A[2] = 5;
        A[3] = 1 ;
        A[4] = 8 ;
        A[5] = 20;

        int[] a = {10,50,5,1};

        System.out.println(solution(A));

    }

    public static int solution(int[] A){

        if(A.length < 3)
            return 0;

        Arrays.sort(A);

        for(int i = 0; i < A.length - 2; i++){
            if(A[i] >= 0 && A[i] > A[i + 2] - A[i + 1])
                return 1;
        }
        return 0;
    }
}
