package Codility;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,5,6,7,8,8,7};
        System.out.println(solution(6,a));
        int[] b = new int[8];

    }


    public static int solution(int X, int[] A){
        int[] newInt = new int[X+1];

        int count = 0;

        for (int i = 0; i < A.length; i++){
            if (newInt[A[i]] == 0){
                newInt[A[i]] = A[i];
                count++;
                if (count == X){
                    return i;
                }
            }
        }

        return -1;
    }
}
