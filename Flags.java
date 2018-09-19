package Codility;

import java.util.ArrayList;
import java.util.List;

//todo only 40%%
public class Flags {
    public static void main(String[] args) {
        int[] A = new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};

        System.out.println(solution1(A));

    }


    //40%
    public static int solution1(int[] A) {

        int allFlags = counterFlags(A);
        int peak = 0;

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                if (peak != 0) {
                    if (Math.abs(peak - i) < allFlags) {
                        allFlags--;
                        continue;
                    }
                }
                peak = i;
            }
        }

        return allFlags;
    }

    public static int counterFlags(int[] A) {
        int allFlags = 0;

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1])
                allFlags++;
        }

        return allFlags;
    }

//    public static int solution(int[] A) {
//        if (A.length < 3)
//            return 0;
//
//        List<Integer> intList = new ArrayList<>();
//
//        for (int i = 1; i < A.length - 1; i++) {
//            if (A[i] > A[i - 1] && A[i] > A[i + 1])
//                intList.add(i);
//        }
//
//        for (int i = 1; i <= A.length; i++) {
//
//            if (A.length % i != 0)
//                continue;
//
//            int num = 0;
//            int finalNum = A.length / i;
//
//            for (int peaks : intList) {
//
//                if (peaks / i > num)
//                    break;
//
//                if (peaks / i == num){
//                    num++;
//                }
//
//                if(num == finalNum)
//                    return finalNum;
//            }
//
//        }
//
//
//        return 0;
//    }

}
