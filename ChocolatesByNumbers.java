package Codility;

public class ChocolatesByNumbers {
    public static void main(String[] args) {
        ChocolatesByNumbers chocolatesByNumbers = new ChocolatesByNumbers();
        System.out.println(chocolatesByNumbers.solution(10,4));
    }

    public int solution(int N, int M) {
        return N / gcd(N, M);
    }

    public static int gcd(int N, int M) {
        if (N % M == 0)
            return M;

        return gcd(M, N % M);
    }
}
