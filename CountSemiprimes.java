package Codility;
//todo
public class CountSemiprimes {
    public static void main(String[] args) {
        int[] p = new int[]{1, 4, 16};
        int[] q = new int[]{26, 10, 20};

//        for (Integer i : solution(26, p, q)) {
//            System.out.println(i);
//        }
    }

    //todo 33%
//    public static int[] solution(int N, int[] P, int[] Q) {
//
//    }

    public int[] getSeive(int N) {
        int[] seiveArray = new int[N + 1];
        int i = 2;

        while (i * i <= N) {
            if (seiveArray[i] == 0) {
                int num = i * i;
                while (num <= N) {
                    if (seiveArray[num] == 0) {
                        seiveArray[num] = i;
                    }
                    num = num + i;
                }
            }
            i++;
        }
        return seiveArray;
    }
}
