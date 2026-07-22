package gcr_codebase.LinkedList;

import java.util.*;
public class PlaylistQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void insertAfter(Node current, int trackId) {

        if (current == null)
            return;

        Node newNode = new Node(trackId);

        newNode.next = current.next;
        current.next = newNode;
    }

    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        insertAfter(head.next, 30);

        printList(head);
    }
}