package gcr_codebase.Trees;
import java.util.*;
public class SortedLeaderBoard {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static void inorder(Node node, List<Integer> result) {

        if (node == null)
            return;

        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    static List<Integer> getSortedLeaderboard(Node root) {

        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println(getSortedLeaderboard(root));
    }
}