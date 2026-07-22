package gcr_codebase.Stacks;
import java.util.*;
public class ServerLoadSpan {
    public static int[] loadSpan(int[] load) {

        int n = load.length;

        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && load[stack.peek()] <= load[i]) {

                stack.pop();
            }

            if (stack.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - stack.peek();

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] load = new int[n];

        for (int i = 0; i < n; i++)
            load[i] = sc.nextInt();

        int[] ans = loadSpan(load);

        System.out.println(Arrays.toString(ans));
    }
}