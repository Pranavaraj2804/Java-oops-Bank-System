package stack;

public class QueueMain extends CustomQueue {
    static void main() throws Exception{
        CustomQueue queue = new CustomQueue();
        System.out.println(queue.Insert(45));
        System.out.println(queue.Insert(22));
        System.out.println(queue.Insert(34));
        System.out.println(queue.Insert(45));
        System.out.println(queue.Insert(67));
        System.out.println(queue.Insert(45));

        queue.display();

        System.out.println(queue.Remove());
        System.out.println(queue.Remove());
        System.out.println(queue.Remove());
        System.out.println(queue.Remove());
        System.out.println(queue.Remove());
        System.out.println();
        queue.display();

    }
}
