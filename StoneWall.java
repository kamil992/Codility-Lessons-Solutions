package Codility;

import java.util.Stack;

public class StoneWall {
    public static void main(String[] args) {
        int[] a = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.println(solution(a));
    }

    public static int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < H.length; i++) {
            while (!stack.isEmpty() && stack.peek() > H[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                stack.push(H[i]);
                count++;
            }

            if (stack.peek() == H[i]) {
                continue;
            }

            if (stack.peek() < H[i]) {
                stack.push(H[i]);
                count++;
            }

        }
        return count;
    }
}
