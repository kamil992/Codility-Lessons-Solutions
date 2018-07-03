package Codility;

public class MinAvgTwoSlice {
    /**
     * 50%
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {4,2,2,5,1,5,8};

        System.out.println(solution(a));
    }


    public static int solution(int[] A){

        double min = A[0] + A[1] / 2;
        double avg = 0;
        double sum = 0;
        int result = 0;
        for(int i = 0; i < A.length - 1; i++){
            sum = A[i];
            for(int j = i + 1 ; j < A.length; j++){
                sum += A[j];
                avg = sum / (j - i + 1);
               // System.out.println(avg = sum / (j - i + 1));
                if(avg < min){
                    min = avg;
                    result = i;
                }
            }
        }


        return  result;
    }
}
