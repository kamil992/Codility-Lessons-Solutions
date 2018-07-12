package Codility;

public class CountFactors {
    public static void main(String[] args) {

        System.out.println(solution(24));
    }


    public static int solution(int N){
        int counter = 0;
        double sqrtN = Math.sqrt(N);

        for(int i = 1; i <= sqrtN; i++){
            if(N % i == 0){
                //System.out.println(N + " % " + i + " = " + N % i);
                if(i * i != N){
                   // System.out.println("i * i = " + i * i);
                    counter += 2;
                }else{
                    counter += 1;
                }
            }
        }
        return counter;
    }
    //71%
    public static int solution1(int N){
        int counter = 0;

        for(int i = 1; i <= N; i++){
            if(N % i == 0)
                counter++;
        }

        return counter;
    }
}
