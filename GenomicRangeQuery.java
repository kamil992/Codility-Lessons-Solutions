package Codility;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
//SCORE= 62% , CORECTNESS = 100% , PERFORMANCE = 0%
public class GenomicRangeQuery {
    public static void main(String[] args) {
        String c = "CAGCCTA";

        int[] P = new int[]{2, 5, 0};
        int[] Q = new int[]{4, 5, 6};

        int[] arr = solution(c, P, Q);
        for (int i : arr)
            System.out.println(i);

    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] resultArrays = new int[P.length];
        String gens = S.toUpperCase();


        if (P.length != Q.length)
            return new int[]{};

        for (int i = 0; i < resultArrays.length; i++) {
            int result = 4;

            if (gens.substring(P[i], Q[i] + 1).contains("A") && 1 < result) {
                result = 1;
            }
            if (gens.substring(P[i], Q[i] + 1).contains("C") && 2 < result) {
                result = 2;
            }
            if (gens.substring(P[i], Q[i] + 1).contains("G") && 3 < result) {
                result = 3;
            }
            if (gens.substring(P[i], Q[i] + 1).contains("T") && 4 < result) {
                result = 4;
            }
            resultArrays[i] = result;
        }
        return resultArrays;
    }

}
