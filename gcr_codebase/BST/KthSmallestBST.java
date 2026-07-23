package gcr_codebase.BST;
import java.util.*;
public class KthSmallestBST {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);

        if (val < root.val)
            root.left = insert(root.left, val);
        else if (val > root.val)
            root.right = insert(root.right, val);

        return root;
    }

    static int kthSmallest(Node root, int k) {

        Stack<Node> stack = new Stack<>();
        Node current = root;
        int count = 0;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            count++;

            if (count == k)
                return current.val;

            current = current.right;
        }

        return -1;
    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++)
            root = insert(root, sc.nextInt());

        System.out.print("BST (Inorder): ");
        inorder(root);

        System.out.println();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println(k + "th smallest element = " + kthSmallest(root, k));

        sc.close();
    }
}