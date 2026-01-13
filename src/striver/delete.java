package striver;

public class delete {
    static class node{
        int data;
        node next;
        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static node createHead(int[] arr){
        node head = new node(arr[0]);
        node mover = head;
        for(int i=1;i<arr.length;i++){
            node temp = new node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    static node deleteNode(node head){
        if(head==null)
            return null;
        head=head.next;
        return head;

    }
    static node deleteTail(node head){
        if(head==null||head.next==null)
            return null;
     node temp = head;
     while (temp.next.next!=null){
         temp = temp.next;
     }
     temp.next = null;
     return head;
    }

    static void main() {
        int[] arr = {10,30,40,50,60,66};
        node head = createHead(arr);
        node temp = head;

        System.out.println("before deletion:");

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("after deletion:");
        head = deleteNode(head);
        temp = head;
        head = deleteTail(head);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
}