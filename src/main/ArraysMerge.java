package main;

import java.util.Arrays;

public class ArraysMerge {

    public int[] merge (int[] a, int[] b){
        int[] result = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int n = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                result[n] = a[i];
                i++;
            }
            else {
                result[n] = b[j];
                j++;
            }
            n++;
        }

        while (i < a.length)
            result[n++] = a[i++];

        while (j < b.length)
            result[n++] = b[j++];

        System.out.println(Arrays.toString(result));
        return result;
    }
}
