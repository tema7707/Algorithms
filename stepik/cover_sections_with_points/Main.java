import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Section {
    int start, finish;

    Section(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

class Main {
    public static void main(String[] args) {
        // Input
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Section> sections = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            sections.add(new Section(s.nextInt(), s.nextInt()));
        }

        // Solution
        sections.sort(Comparator.comparingInt(o -> o.finish));
        if (sections.size() == 0) {
            System.out.println(0);
            return;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(sections.get(0).finish);
        for (Section section : sections) {
            if (section.start <= ans.get(ans.size() - 1)) {
                continue;
            }
            ans.add(section.finish);
        }

        // Print answer
        System.out.println(ans.size());
        for (Integer digits : ans) {
            System.out.print(digits + " ");
        }
    }
}