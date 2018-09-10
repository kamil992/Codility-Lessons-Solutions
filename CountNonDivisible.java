package Codility;

//todo 55% because of performance
public class CountNonDivisible {
    public static void main(String[] args) {
        CountNonDivisible count = new CountNonDivisible();
        int[] arr = {3,1,2,3,6};

        for(int a : count.solution(arr)){
            System.out.println(a);
        }
    }

    public int[] solution(int[] A) {

        int counter = 0;
        int[] resultArray = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            counter = 0;
            for (int j = 0; j < A.length; j++) {
                if (i == j)
                    continue;

                if (A[i] % A[j] != 0)
                    counter++;
            }
            resultArray[i] = counter;
        }
        return resultArray;
    }
}
