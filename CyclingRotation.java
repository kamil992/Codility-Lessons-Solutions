package Codility;

public class CyclingRotation {

    public static int[] cyclicRotation(int[] a, int p){
        int[] b = new int[a.length];
        int k;// new place of number in array

        for(int i = 0; i < a.length; i++){
            k = (i + p) % a.length;

            b[i] = a[k];
        }
        return b;
    }

}
