package Question71;

import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            mergedArray[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int arr1[]= {1,6,9,7,3};
        int arr2[]= {8,5,4,9};

        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));

    }

}
