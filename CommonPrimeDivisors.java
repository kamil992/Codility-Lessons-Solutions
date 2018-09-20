package Codility;

public class CommonPrimeDivisors {

    public static void main(String[] args) {
        CommonPrimeDivisors commonPrimeDivisors = new CommonPrimeDivisors();
        int[] A = {15, 10, 3};
        int[] B = {75, 30, 5};

        System.out.println(commonPrimeDivisors.solution(A, B));
    }


    public int solution(int[] A, int[] B) {
        int counter = 0;

        for (int i = 0; i < A.length; i++) {
            if (hasSamePrimes(A[i], B[i]))
                counter++;
        }
        return counter;
    }

    public static boolean hasSamePrimes(int a, int b) {
        int numA;
        int numB;
        int gcdVar = gcd(a, b);

        do {
            numA = gcd(a, gcdVar);
            if (numA == 1)
                break;

            a /= numA;

        } while (a != 1);

        if (a != 1)
            return false;

        do {
            numB = gcd(b, gcdVar);
            if (numB == 1)
                break;
            b /= numB;
        } while (b != 1);

        if (b != 1)
            return false;

        return true;

    }


    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;

        return gcd(b, a % b);
    }

}
