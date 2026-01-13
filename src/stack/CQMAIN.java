package stack;

public class CQMAIN  {
    static void main() throws Exception{
        CircularQueue queue = new CircularQueue(5);
//        queue.Insert(67);
//        queue.Insert(5);
//        queue.Insert(6);
//        queue.Insert(7);
//        queue.Insert(47);
//        queue.Insert(447);
//        queue.Insert(5);
//
//        queue.display();
//
//        queue.Insert(78);
//        System.out.println(queue.remove());
//        queue.Insert(89);
//        queue.Insert(89);
//        queue.Insert(89);
//        queue.Insert(67);
//
//
//        queue.display();
//        System.out.println(queue.remove());
//
//        queue.display();

        queue.Insert(10);
        queue.Insert(20);
        queue.Insert(30);
        queue.Insert(40);
        queue.Insert(50);

        queue.display();
        queue.remove();
        queue.remove();

        queue.display();

        queue.Insert(5);
        queue.Insert(4);

        queue.display();

        queue.Insert(45);
        queue.Insert(66);

        queue.display();
    }
}
