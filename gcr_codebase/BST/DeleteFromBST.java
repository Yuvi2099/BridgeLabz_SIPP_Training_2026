package gcr_codebase.BST;
import java.util.*;
public class DeleteFromBST {
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

    static Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    static Node delete(Node root, int key) {

        if (root == null)
            return null;

        if (key < root.val) {
            root.left = delete(root.left, key);
        } else if (key > root.val) {
            root.right = delete(root.right, key);
        } else {

            // Case 1: Leaf
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 3: Two children
            Node successor = findMin(root.right);

            root.val = successor.val;

            root.right = delete(root.right, successor.val);
        }

        return root;
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

        System.out.print("BST before deletion: ");
        inorder(root);

        System.out.println();

        System.out.print("Enter value to delete: ");
        int key = sc.nextInt();

        root = delete(root, key);

        System.out.print("BST after deletion: ");
        inorder(root);

        sc.close();
    }
}