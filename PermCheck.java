package Codility;

import java.util.Arrays;

public class PermCheck {

    public int solution(int[] A) {
        Arrays.sort(A);
        int counter = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == i + 1)
                counter++;
        }
        if(counter == A.length)
            return 1;

        return 0;
    }

}
