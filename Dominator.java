package Codility;

import rekurencje.Array;

import java.util.Arrays;


// 91%  exceeded limit by 0.01s
public class Dominator {
    public static void main(String[] args) {

        int[] a = new int[]{3, 4, 3, 2, 3, -1, 3, 3};

        System.out.println(solution(a));
    }

    public static int solution(int[] A) {

        if (A.length == 1)
            return 0;
        if (A.length < 1)
            return -1;

        int[] B = Arrays.stream(A)
                .sorted().toArray();

        int dominator = B[((B.length) / 2)];
        int counter = 0;
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == dominator) {
                counter++;
                index = i;
            }

        }
        if (counter > A.length / 2)
            return index;

        return -1;
    }
}
