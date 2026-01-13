package striver;

public class pracll {
    static  class node{
        int data;
        node next;

        public node(int data, node next) {
            this.data = data;
            this.next = next;
        }

        public node(int data) {
            this.data = data;
        }
    }
    static class solution{
        public node insertatHead(int newData,node head){
            node newnode = new node(newData,head);
            return newnode;
        }
        public void printList(node head) {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    static void main() {
        int[] arr = {10,20,30,40};
        solution sol = new solution();
        node head = new node(2);
        head.next = new node(3);

        sol.printList(head);
        head = sol.insertatHead( 1,head);

        System.out.print("After Insertion at Head: ");
        sol.printList(head);

//        node c = new node(6, null);
//        node b = new node(5, c);
//        node a = new node(3, b);
//
//        System.out.println(c.data);
//        System.out.println(c.next);
//        System.out.println(a.data);
//        System.out.println(a.next.data);


    }
}
