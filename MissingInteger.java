package Codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
    public static void main(String[] args) {
        int[] a= {1,2,3};

        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        int minNum = 1;

        if(A.length == 0)
            return minNum;

        Set<Integer> numSet = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            if(A.length > 0)
                numSet.add(A[i]);
        }

        while(numSet.contains(minNum)){
            minNum++;
        }

        return minNum;
    }
}
