package gcr_codebase.BST;
import java.util.*;
public class FastUsernameLookUp{

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
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

    static boolean search(Node root, int target) {
        Node current = root;

        while (current != null) {
            if (current.val == target)
                return true;

            if (target < current.val)
                current = current.left;
            else
                current = current.right;
        }

        return false;
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

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        System.out.print("BST (Inorder): ");
        inorder(root);

        System.out.println();

        System.out.print("Enter value to search: ");
        int target = sc.nextInt();

        if (search(root, target))
            System.out.println(target + " found in BST.");
        else
            System.out.println(target + " not found in BST.");

        sc.close();
    }
}