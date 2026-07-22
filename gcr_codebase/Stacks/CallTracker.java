package gcr_codebase.Stacks;
import java.util.*;
public class CallTracker {
    static class Frame {

        String functionName;
        Frame next;

        Frame(String functionName, Frame next) {
            this.functionName = functionName;
            this.next = next;
        }
    }

    static class CallStack {

        private Frame top = null;

        public void push(String functionName) {
            top = new Frame(functionName, top);
        }

        public String pop() {

            if (isEmpty())
                throw new RuntimeException("Stack Empty");

            String name = top.functionName;
            top = top.next;

            return name;
        }

        public String peek() {

            if (isEmpty())
                throw new RuntimeException("Stack Empty");

            return top.functionName;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validate()");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}