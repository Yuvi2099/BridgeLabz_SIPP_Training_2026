package gcr_codebase.LinkedList;
import java.util.*;
public class SortedLogStreams {
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node mergeLogStreams(Node a, Node b) {

        Node dummy = new Node(0);

        Node tail = dummy;

        while (a != null && b != null) {

            if (a.data <= b.data) {

                tail.next = a;
                a = a.next;

            } else {

                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null)
            tail.next = a;
        else
            tail.next = b;

        return dummy.next;
    }

    static void print(Node head) {

        while (head != null) {

            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        Node merged = mergeLogStreams(list1, list2);

        print(merged);
    }
}