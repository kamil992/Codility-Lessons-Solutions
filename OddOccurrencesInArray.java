package Codility;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] a = {9,3,9,3,9,7,9};
        System.out.println(solution(a));

    }

    public static int solution(int[] A){
        int num = 0;

        for(int i = 0; i < A.length; i++){
            num = num ^ A[i];
        }
        return num;
    }
}
