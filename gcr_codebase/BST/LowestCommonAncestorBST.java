package gcr_codebase.BST;
import java.util.*;
public class LowestCommonAncestorBST {

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

    static Node lowestCommonAncestor(Node root, int p, int q) {

        Node current = root;

        while (current != null) {

            if (p < current.val && q < current.val)
                current = current.left;

            else if (p > current.val && q > current.val)
                current = current.right;

            else
                return current;
        }

        return null;
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

        System.out.print("Enter first node: ");
        int p = sc.nextInt();

        System.out.print("Enter second node: ");
        int q = sc.nextInt();

        Node lca = lowestCommonAncestor(root, p, q);

        if (lca != null)
            System.out.println("Lowest Common Ancestor = " + lca.val);
        else
            System.out.println("LCA not found.");

        sc.close();
    }
}