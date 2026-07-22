package gcr_codebase.Stacks;
import java.util.*;
public class DepthUndoBuffer {
    static class UndoBuffer {

        private String[] data;
        private int top;

        UndoBuffer(int maxDepth) {
            data = new String[maxDepth];
            top = -1;
        }

        public boolean push(String edit) {

            if (top == data.length - 1) {
                System.out.println("Stack Overflow");
                return false;
            }

            data[++top] = edit;
            return true;
        }

        public String pop() {

            if (isEmpty())
                throw new RuntimeException("Nothing to undo");

            return data[top--];
        }

        public String peek() {

            if (isEmpty())
                throw new RuntimeException("Stack is Empty");

            return data[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {

        UndoBuffer stack = new UndoBuffer(5);

        stack.push("Edit1");
        stack.push("Edit2");
        stack.push("Edit3");

        System.out.println("Top : " + stack.peek());
        System.out.println("Undo : " + stack.pop());
        System.out.println("Top : " + stack.peek());
    }
}