package Codility;

import java.util.Arrays;

// 66%
public class MaxCounters {

    public static void main(String[] args) {
        int[] a = {3, 4, 4, 6, 1, 4, 4};
        int[] c = solution(5, a);
        for (int b : c) {

            System.out.println(b);
        }


    }

    public static int[] solution(int N, int[] A) {

        int[] newArr = new int[N];// newArr{0,0,0,0,0}


        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                Arrays.sort(newArr);
                newArr = setAll(newArr);
                continue;
            }
            newArr[(A[i]) - 1]++;
        }
        return newArr;
    }

    private static int[] setAll(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[a.length - 1];
        }
        return a;
    }
}
