package Codility;


public class Nesting {
    public static void main(String[] args) {
        String S = "(()((())))";

        System.out.println(solution(S));
    }

    public static int solution(String S) {

        if (S.length() % 2 != 0)
            return 0;

        if (S.length() > 1000000)
            return 0;

        int num = 0;

        for (int i = 0; i < S.length(); i++) {

            if (S.charAt(i) == '(')
                num++;

            if (S.charAt(i) == ')')
                num--;


            if (num < 0)
                return 0;
        }


        if (num == 0)
            return 1;

        return 0;
    }
}
