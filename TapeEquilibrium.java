package Codility;
//ONLY 66%
public class TapeEquilibrium {
    public static void main(String[] args) {
        System.out.println(Math.subtractExact(3,10));
        int[] arr = {3,1,2,4,3};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A){
        int firstSum = A[0];
        int allSum = 0;
        int diff;
        for(int i = 0; i < A.length; i++){
            allSum += A[i];
        }
        int min = Math.max(A[0], allSum - A[0]) - Math.min(A[0], allSum - A[0]);//7
        for(int i = 1; i < A.length - 1; i++){
            firstSum += A[i];//6->10
            int newAllSum = Math.max(firstSum,allSum) - Math.min(firstSum,allSum);//7->3
            diff = Math.max(firstSum, newAllSum) - Math.min(firstSum, newAllSum);//1->7

            if(diff < min) {
                min = diff;//5->1
            }
        }
        return min;
    }
}
