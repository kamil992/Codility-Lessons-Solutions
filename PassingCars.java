package Codility;

public class PassingCars {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,1};
        System.out.println(solution(nums));
    }

    public static int solution(int[] A){
        int counter = 0;
        int zeros = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] == 0)
                zeros++;

            if(A[i] == 1)
                counter += zeros;

            if(counter > 1000000000)
                return -1;
        }
        return counter;
    }
}
