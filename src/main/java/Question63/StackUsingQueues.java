package Question63;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    private int top;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        top = -1;
    }

    public void push(int x) {
        queue1.offer(x);
        top = x;
    }

    public int pop() {
        while (queue1.size() > 1) {
            top = queue1.poll();
            queue2.offer(top);
        }

        int result = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return result;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.top()); // 2
        System.out.println("Pop element: " + stack.pop()); // 2
        System.out.println("Is stack empty? " + stack.empty()); // false
    }
}
