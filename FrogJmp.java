package Codility;

public class FrogJmp {

    public static void main(String[] args) {

        System.out.println(solution(10,85,30));
    }

    static int solution(int X, int Y, int D){
        int diff = Y - X;
        if (diff % D == 0)
            return diff /D;
        else
            return diff/D + 1; // 75 / 30 = 2 + 1 = 3
    }
}
