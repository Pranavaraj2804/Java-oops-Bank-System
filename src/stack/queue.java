package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    static void main() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(56);
        queue.add(45);
        queue.add(22);
        queue.add(51);
        queue.add(54);
        System.out.println(queue.peek());
        System.out.println(queue.add(90));
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(99);
        deque.addFirst(5);
        deque.addLast(67);
        System.out.println(deque.removeFirst());

        System.out.println( deque.removeLast());



    }
}
