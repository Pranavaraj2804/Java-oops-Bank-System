package stack;

import java.util.Stack;

public class stack {
    static void main() {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(12);
        stack.push(56);
        stack.push(22);
        stack.push(44);
        stack.push(2);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
