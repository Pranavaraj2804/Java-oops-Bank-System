package striver;

public class linkedlist {
    static class node {
        int data;
        node next;

        public node(int data, node next) {
            this.data = data;
            this.next = next;
        }
    }

    static void main() {
        int[] arr = {2,5,7,8};
        node second = new node(arr[1],null);
        node y = new node(arr[0],second);

        System.out.println(y.data);
        System.out.println(second.data);
        System.out.println(second.next);

        System.out.println(y);
    }


}

