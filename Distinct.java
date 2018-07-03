package Codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static void main(String[] args) {
        int[] a = {3,2,1,1,2,3,1};
        System.out.println(solution(a));

    }

    public static  int solution(int[] A){

        Set<Integer> intSet = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            intSet.add(A[i]);
        }

        return intSet.size();
    }
}
