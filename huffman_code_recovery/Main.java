import java.util.*;

class Main {

    public static void main(String[] args) {
        // Input
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int length = s.nextInt();
        s.nextLine();
        Map<String, String> alphabet = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String info = s.nextLine();
            alphabet.put(info.substring(info.indexOf(':') + 2), Character.toString(info.charAt(0)));
        }
        String input = s.nextLine();

        // Solution
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < length; i++) {
            buffer.append(input.charAt(i));
            if (alphabet.containsKey(buffer.toString())) {
                System.out.print(alphabet.get(buffer.toString()));
                buffer.setLength(0);
            }
        }
    }
}