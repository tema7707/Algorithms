import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Item {
    float density;
    int weight;

    Item(int cost, int weight) {
        this.weight = weight;
        density = (float) cost / weight;
    }
}

class Main {
    public static void main(String[] args) {
        // Input
        ArrayList<Item> items = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int w = s.nextInt();
        for (int i = 0; i < n; i++) {
            items.add(new Item(s.nextInt(), s.nextInt()));
        }

        // Solution
        float ans = 0;
        items.sort(Comparator.comparingDouble(o -> -o.density));

        for (Item section : items) {
            if (section.weight < w) {
                ans += section.density * section.weight;
                w -= section.weight;
            } else {
                ans += section.density * w;
                break;
            }
        }

        // Print answer
        System.out.println(ans);
    }
}