package Codility;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(solution(9));
    }

    public static int solution(int N) {
        int binaryGap = 0;

        for (int j = 0; N > 0; N /= 2) {
            if (N % 2 == 0) {
                j++;
            } else {
                if (j > binaryGap) {
                    binaryGap = j;
                }
                j = 0;
            }
        }

        return binaryGap;
    }

}
