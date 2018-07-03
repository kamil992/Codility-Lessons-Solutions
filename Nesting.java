package Codility;

import java.util.Arrays;
// 50%
public class Nesting {
    public static void main(String[] args) {
        String S = "(()())";

        System.out.println(solution(S));
    }

    public static int solution(String S) {
        int counter = 0;

        if (S.length() % 2 == 0) {

            if (S.length() > 1000000)
                return 0;

            int end = S.length() - 1;

            for (int i = 0; i < S.length()  ; i++) {

                if (S.charAt(i) == '(' && S.charAt(end) == ')')
                    counter++;

                end--;
                if (end == 0)
                    break;
            }
        }
        if (counter == S.length() / 2)
            return 1;

        return 0;
    }
}
