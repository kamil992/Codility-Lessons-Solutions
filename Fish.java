package Codility;

import java.util.Stack;

public class Fish {

    public static void main(String[] args) {

        int[] A = new int[5];
        int[] B = new int[5];
        A[0] = 4;
        A[1] = 3;
        A[2] = 2;
        A[3] = 1;
        A[4] = 5;

        B[0] = 0;
        B[1] = 1;
        B[2] = 0;
        B[3] = 0;
        B[4] = 0;
        System.out.println(solution(A, B));
    }

    public static int solution(int[] A, int[] B) {

        int livingFish = 0;
        boolean isOpposite = false;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {

            if (B[i] == 1) {
                if (!isOpposite) {
                    isOpposite = true;
                }
                stack.push(A[i]);
            } else {
                if (!isOpposite) {
                    livingFish++;
                } else {

                    while (!stack.isEmpty() && A[i] > stack.peek()) {
                        stack.pop();
                    }

                    if (stack.isEmpty()) {
                        isOpposite = false;
                        livingFish++;
                    }
                }
            }
        }
        return stack.size() + livingFish;
    }


}
