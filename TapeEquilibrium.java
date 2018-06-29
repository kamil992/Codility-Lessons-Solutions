package Codility;
//ONLY 66%
public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,3};
        System.out.println(solution(arr));

        System.out.println(Math.abs(3 - 10));
    }

    public static int solution(int[] A){
        int leftSum = A[0];
        int allSum = add(A);
        int rightSum = allSum - A[0];
        int diff;

        int min = Math.abs(leftSum - rightSum);
        for(int i = 1; i < A.length - 1; i++){
            if(A[i] < -1000 || A[i] > 1000 || A.length >100000)
                continue;

            leftSum += A[i];
            rightSum -= A[i];

            diff = Math.abs(leftSum - rightSum);

            if(diff < min) {
                min = diff;
            }
        }
        return min;
    }

    private static int add(int[] A){
        int allSum = 0;
        for(int i = 0; i < A.length; i++){
            allSum += A[i];
        }
        return allSum;
    }

}
