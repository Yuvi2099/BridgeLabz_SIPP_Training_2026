package gcr_codebase.Trees;
import java.util.*;
public class LevelOrderTraversal {
    static class Node {

        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static List<List<Integer>> broadcastByLevel(Node root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Node node = queue.poll();

                level.add(node.val);

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }

            result.add(level);
        }

        return result;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(broadcastByLevel(root));
    }
}