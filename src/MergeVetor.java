
public class MergeVetor {

    public static int[] juntar(int[] A, int tamA, int[] B, int tamB) {
        int[] C = new int[tamA + tamB];

        int i = 0, j = 0, k = 0;
        while (i < tamA && j < tamB) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < tamA) {
            C[k++] = A[i++];
        }
        while (j < tamB) {
            C[k++] = B[j++];
        }

        return C;
    }
}
