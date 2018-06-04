package Codility;

public class PermMissingElem {

    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        System.out.println(solution(a));
    }
    public static int solution(int[] A) {
        long num = A.length + 1;

        long lookinFor = num * (num + 1) / 2;

        for(long a : A){
            lookinFor = lookinFor - a;
        }
        return (int)lookinFor;
    }
}
