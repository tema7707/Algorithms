import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Input
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // Solution
        boolean[] numbers = new boolean[n];
        int i = 1, sum = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // simplest solution
        if (n <= 2) {
            System.out.println(1);
            System.out.println(n);
            return;
        }

        // two or more numbers
        while (sum < n) {
            ans.add(i);
            numbers[i-1] = true;
            sum += i++;
        }
        while (sum != n) {
            sum -= ans.remove(ans.size() -1 );
            if (!numbers[n - sum]) {
                ans.add(n - sum);
                break;
            }
        }

        // Print answer
        System.out.println(ans.size());
        for (Integer item : ans) {
            System.out.print(item + " ");
        }
    }
}