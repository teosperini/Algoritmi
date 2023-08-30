import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] A = {10,8,3,15,7,9,13,4,11,6};
        quickSort1(A, 0, A.length - 1);
        Arrays.stream(A).forEach(System.out::println);
        System.out.println("\n");
        int[] B = {8,2,5,3,9,4,7,6,1};
        quickSort2(B,0, B.length - 1);
        Arrays.stream(B).forEach(System.out::println);
    }

    public static void quickSort1(int[] A, int p, int r){
        if (p < r){
            int q = partition1(A,p,r);
            quickSort1(A,p,q);
            quickSort1(A,q+1,r);
        }
    }
    public static int partition1(int[] A, int p, int r){
        int pivot = A[p];
        int i = p-1;
        int j = r+1;
        do {
            do {
                j-=1;
            }while (A[j] > pivot);
            do {
                i+=1;
            }while (A[i]< pivot);
            int app;
            if(i<j) {
                app = A[i];
                A[i] = A[j];
                A[j] = app;
            }
        }while (i<j);
        return j;
    }

    public static void quickSort2(int[] array, int start, int end){
        if (end < start) return;
        int pivot = partition2(array, start, end);
        quickSort2(array, start, pivot-1);
        quickSort2(array, pivot + 1, end);
    }

    public static int partition2(int[] array, int start, int end){
        int pivot = array[end];
        int i = start -1;

        for(int j = start; j <= end -1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
