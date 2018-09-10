package Codility;

public class CountSemiprimes {
    public static void main(String[] args) {
        int[] p = new int[]{1, 4, 16};
        int[] q = new int[]{26, 10, 20};

        for (Integer i : solution(26, p, q)) {
            System.out.println(i);
        }
    }

    //todo 33%
    public static int[] solution(int N, int[] P, int[] Q) {

    int counter;

    int[] intArr = new int[P.length];

        for (int i = 0; i < P.length; i++) {
        counter = 0;
        for (int j = Math.min(P[i], Q[i]); j <= Math.max(P[i], Q[i]); j++) {
            if(j == 2)
                continue;

            if(hasOnlyPrimes(j))
                counter++;

        }
        intArr[i] = counter;
    }

        return intArr;
}

    public static boolean hasOnlyPrimes(int number) {
        double num = number;
        if (num / 2 == 2.0 || num / 3 == 2.0 || num / 5 == 2.0 || num == 2.0)
            return true;

        int temprorary = 0;

        if(number % 2 == 0){
            temprorary = number / 2;
            if(isPrime(temprorary))
                return true;
        }

        if(number % 3 == 0){
            temprorary = number / 3;
            if(isPrime(temprorary))
                return true;
        }

        if(number % 5 == 0){
            temprorary = number / 5;
            if(isPrime(temprorary))
                return true;
        }

        return false;
    }

    public static boolean isPrime(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                counter++;
        }
        if (counter == 2)
            return true;
        return false;
    }
}
