package Codility;

import rekurencje.Array;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = 1;// -1/1
        a[1] = 5;// -4/6
        a[2] = 2;// 0/4
        a[3] = 1;// 2/4
        a[4] = 4;// 0/8
        a[5] = 0;// 5/5
        System.out.println(solution(a));// = 11

    }


    public static int solution(int[] A) {
        int[] left = getLeftRadius(A);//    -1, -4, 0, 2, 0, 5   ->    -4, -1, 0, 0, 2, 5
        int[] right = getRightRadius(A);//   1,  6, 4, 4, 8, 5   ->     1,  4, 4, 5 ,6, 8

        int counter = 0; // counter of intersections
        int k = 0;

        for (int i = 0; i < A.length; i++) {

            while (k < A.length && right[i] >= left[k]) {// [0] -> (1 > 4) // (1 > -1) // (1 > 0) ...
                counter += k; // 0 -> 1 -> 2  -> ... next intersects
                counter -= i; // 0 -> 1 -> 2 -> ...  delete doublets
                k++; // 1 -> 2 -> 3 -> ...
            }
        }

        if (counter > 100000)
            return -1;

        return counter;
    }

    public static int[] getLeftRadius(int[] A) {
        int[] left = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            left[i] = i - A[i];
        }
        Arrays.sort(left);
        return left;
    }

    public static int[] getRightRadius(int[] A) {
        int[] right = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            right[i] = i + A[i];
        }
        Arrays.sort(right);
        return right;
    }

}
