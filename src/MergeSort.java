import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length <= 1) return; // base case
        int middle = array.length / 2;

        int[] leftArray = Arrays.copyOfRange(array, 0, middle);
        int[] rightArray = Arrays.copyOfRange(array, middle, array.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int i = 0, l = 0, r = 0; //indices

        //check the conditions for merging
        while(l < leftArray.length && r < rightArray.length) {
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftArray.length) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightArray.length) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7, 1, 8, 0, 3};
        mergeSort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}