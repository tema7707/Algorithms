import java.util.*;

class Main {
    private static class Node implements Comparable<Node>{
        final int sum;
        String code;

        void buildCode(String code) {
            this.code = code;
        }

        Node(int sum) {
            this.sum = sum;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(sum, o.sum);
        }
    }

    private static class ParentNode extends Node {
        Node left, right;

        @Override
        void buildCode(String code) {
            this.code = code;
            this.left.buildCode(code + "0");
            this.right.buildCode(code + "1");
        }

        ParentNode(Node left, Node right) {
            super(left.sum + right.sum);
            this.left = left;
            this.right = right;
        }
    }

    private static class LeafNode extends Node {
        char symbol;

        @Override
        void buildCode(String code) {
            this.code = code;
            System.out.println(symbol + ": " + code);
        }

        LeafNode(char symbol, int sum) {
            super(sum);
            this.symbol = symbol;
        }
    }

    public static void main(String[] args) {
        // Input
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        // Solution
        // count frequency
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        // init priority queue
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        Map<Character, Node> charNodes = new HashMap<>();
        for (Map.Entry<Character, Integer> item : count.entrySet()) {
            Node node = new LeafNode(item.getKey(), item.getValue());
            priorityQueue.add(node);
            charNodes.put(item.getKey(), node);
        }
        // build tree
        int sum = 0;
        while (priorityQueue.size() > 1) {
            Node first = priorityQueue.poll();
            Node second = priorityQueue.poll();
            ParentNode parent = new ParentNode(first, second);
            priorityQueue.add(parent);
            sum += parent.sum;
        }
        Node root = priorityQueue.poll();

        // Print answer
        System.out.println(count.size() + " " + (count.size() == 1 ? input.length() : sum));
        if (count.size() == 1) {
            root.buildCode("1");
        } else {
            root.buildCode("");
        }
        for (int i = 0; i < input.length(); i++) {
            System.out.print(charNodes.get(input.charAt(i)).code);
        }
    }
}