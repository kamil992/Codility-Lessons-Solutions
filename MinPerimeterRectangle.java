package Codility;

public class MinPerimeterRectangle {
    public static void main(String[] args) {

        System.out.println(solution(101));
    }


    public static int solution(int N){
        int min = Integer.MAX_VALUE;
        int i = 1;
        int result = 0;
        while(i * i <= N){
            if (N % i == 0){
                result = Math.min(min, (N/i + i) * 2);
            }
            i++;
        }

        return result;
    }
}
