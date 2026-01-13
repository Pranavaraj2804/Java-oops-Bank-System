package stack;

import java.util.LinkedList;

public class Main {
    static void main () throws StackException {
        CustomStack stack = new CustomStack();
        stack.push(45);
        stack.push(12);
        stack.push(56);
        stack.push(22);
        stack.push(44);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(2);



        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peak());
        System.out.println(stack.peak());





    }
}
