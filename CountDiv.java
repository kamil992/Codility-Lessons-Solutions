package Codility;

public class CountDiv {
    public static void main(String[] args) {
        CountDiv countDiv = new CountDiv();

        System.out.println(countDiv.solution(6,11,2));
        System.out.println(countDiv.solution2(11,345,17));

    }

    public int solution(int A, int B, int K){
        int counter = 0;

        for(int i = A; i <= B; i++){
            if(i % K == 0)
                counter++;
        }
        return counter;
    }

    public int solution2(int A, int B, int K){

        return B / K - A / K + (A % K == 0 ? 1 : 0);
    }
}
