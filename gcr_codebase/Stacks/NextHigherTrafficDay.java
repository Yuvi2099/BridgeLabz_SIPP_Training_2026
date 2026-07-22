package gcr_codebase.Stacks;
import java.util.*;
public class NextHigherTrafficDay {
    public static int[] nextBusierDay(int[] visitors) {

        int n = visitors.length;

        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {

                answer[stack.pop()] = visitors[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] visitors = new int[n];

        for (int i = 0; i < n; i++)
            visitors[i] = sc.nextInt();

        int[] ans = nextBusierDay(visitors);

        System.out.println(Arrays.toString(ans));
    }
}