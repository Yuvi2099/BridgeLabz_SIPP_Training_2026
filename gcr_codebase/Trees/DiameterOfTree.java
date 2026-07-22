package gcr_codebase.Trees;
import java.util.*;
public class DiameterOfTree {
    static class Node {

        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static int diameter = 0;

    static int height(Node node) {

        if (node == null)
            return -1;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight + 2);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    static int longestCommunicationPath(Node root) {

        diameter = 0;

        height(root);

        return diameter;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(longestCommunicationPath(root));
    }
}