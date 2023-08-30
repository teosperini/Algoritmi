import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] A = {7,2,2,1,4,5,3,2,1};
        Arrays.stream(countingSort(A)).forEach(System.out::println);
    }
    public static int[] countingSort(int[] A){
        int[] B = new int[Arrays.stream(A).max().getAsInt()];
        Arrays.stream(A).forEach(x -> B[x-1] += 1);
        int i = 1;
        while(i < B.length){
            B[i] += B[i-1];
            i += 1;
        }
        int j = A.length - 1;
        int[] ris = new int[A.length];
        while (j >=  0){
            int index = B[A[j] - 1]; //prendo l'ultimo elemento di A e lo uso come indice per prendere il valore nell'array B
            B[A[j] -1 ] -= 1;     //
            ris[index - 1] = A[j];
            --j;
        }
        return ris;
    }
}
