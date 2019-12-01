import java.util.*;

class Main {
    private static void mergeSort(int[] A) {
        if (A.length <= 1)
            return;

        int[] left = new int[A.length / 2 + A.length % 2];
        int[] right = new int[A.length / 2];
        split(A, left, right);
        mergeSort(left);
        mergeSort(right);
        merge(A, left, right);
    }

    private static void split(int[] A, int[] left, int[] right) {
        System.arraycopy(A, 0, left, 0, left.length);
        System.arraycopy(A, left.length, right, 0, right.length);
    }

    private static void merge(int[] A, int[] left, int[] right) {
        int l = 0;
        int r = 0;
        for (int i = 0; i < A.length; i++) {
            if (r == right.length || l != left.length && left[l] >= right[r]) {
                A[i] = left[l++];
            } else {
                A[i] = right[r++];
            }
        }
    }

    public static void main(String[] args) {
        // Input
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }

        // Solution
        mergeSort(A);

        // Print
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+ " ");
        }
    }
}