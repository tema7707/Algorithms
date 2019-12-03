import java.util.*;

class Main {

    static Scanner s = new Scanner(System.in);
    static int[] inputArr() {
        String dirtyLine = s.nextLine();
        String[] input = dirtyLine.split(" ");
        int n = Integer.parseInt(input[0]);
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(input[i + 1]);
        }
        return A;
    }

    private static int binSearch(int k, int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int pivot = (r + l) / 2;
            if (arr[pivot] == k) {
                return pivot + 1;
            }
            if (arr[pivot] < k) {
                l = pivot + 1;
            } else {
                r = pivot - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Input
        int[] A = inputArr();
        int[] B = inputArr();

        // Solution
        for (int k : B) {
            System.out.print(binSearch(k, A) + " ");
        }
    }
}