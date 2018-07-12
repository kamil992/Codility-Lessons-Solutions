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

//50%
    public static int solution(int[] A){
        float minAvg = Float.MAX_VALUE;
        int minPossition = 0;
        float avg = 0;
        for(int i = 0; i < A.length - 1; i++){
            avg = (A[i] + A[i + 1]) / 2;
            if(avg < minAvg){
                minAvg = avg;
                minPossition = i;
            }
        }
        for(int i = 0; i < A.length - 2; i++){
            avg = (A[i] + A[i + 1] + A[i + 2]) / 3;
            if(avg < minAvg){
                minAvg = avg;
                minPossition = i;
            }
        }
        return minPossition;
    }


    //50%
    public static int solution1(int[] A){


        double min = A[0] + A[1] / 2;
        double avg = 0;
        double sum = A[0] + A[1];
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
