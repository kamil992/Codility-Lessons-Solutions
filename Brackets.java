package Codility;

import java.util.Stack;

// 75%  !!!!!!
public class Brackets {

    public static void main(String[] args) {
        solution("{[()()]}");
    }

    //100% using stack
    public static int solution(String S) {
        if (S.length() == 0)
            return 1;

        if (S.length() % 2 != 0)
            return 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char sChar = S.charAt(i);

            switch (sChar) {
                case (')'):
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    break;
                case (']'):
                    if (!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    break;
                case ('}'):
                    if (!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    break;
                default:
                    stack.push(sChar);
                    break;
            }
        }
        if(stack.size() == 0)
            return 1;

        return 0;
    }

    //75% solution
    public static int solution1(String S) {
        int counter = 0;

        if (S.length() == 0)
            return 1;

        if (S.charAt(0) == '(' && S.charAt(S.length() - 1) != ')' ||
                S.charAt(0) == '[' && S.charAt(S.length() - 1) != ']' ||
                S.charAt(0) == '{' && S.charAt(S.length() - 1) != '}') {
            return 0;
        }

        if (S.length() % 2 != 0)
            return 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(' ||
                    S.charAt(i) == '[' ||
                    S.charAt(i) == '{') {
                counter++;
            }

            if (S.charAt(i) == ')' ||
                    S.charAt(i) == ']' ||
                    S.charAt(i) == '}') {
                counter--;
            }
            if (counter < 0)
                return 0;

        }

        if (counter == 0)
            return 1;

        return 0;
    }
}
