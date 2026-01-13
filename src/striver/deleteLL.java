package striver;

public class deleteLL {
   static class node{
        int data;
        node next;
       public node(int data,node next) {
           this.data = data;
           this.next = next;
       }


        public node(int data) {
            this.data = data;
        }
    }

    static node createHead(int[] arr){
        node head = new node(arr[0]);
        node mover = head;
        int k;
        for(int i =1;i<arr.length;i++){
            node temp = new node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
   }
   static  node deleteHead(node head){
       if(head==null){
           return null;
       }
       head = head.next;
       return head;
   }
    static  node deleteTail(node head){
        if(head==null||head.next==null){
            return null;
        }
        node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
        static node deleteParticular(node head,int k){
           if(head==null)return null;
           if(k==1){
               return head.next;
           }
           node temp = head;
            node prev = null;
            int cnt = 1;

            while(cnt < k){
                prev = temp;
                temp = temp.next;
                cnt++;
            }

            prev.next = temp.next;

            return head;
    }
    static node deleteElement(node head,int el,node prev){
       if(head==null)return null;
       node temp = head;
       while(temp!=null){
           if(temp.data==el){
               prev.next = prev.next.next;
           }
       }
       prev = temp;
       temp = temp.next;
       return head;
    }



    static void main() {
     int[] arr = {10,20,30,40,50,60};
//     node second = new node(arr[1],null);
//     node first = new node(arr[0],second);
//
//        System.out.println(first.data);
//        System.out.println(first.next.data);
//        System.out.println(second.data);
//        System.out.println(second.next);
        node head = createHead(arr);
        node temp = head;
//        System.out.println("before deletion");
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//        head=deleteHead(head);
//        temp = head;
//        System.out.println("after deletion of head");
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//
//        System.out.println("after deletion of tail");
//        head = deleteTail(head);
//        temp = head;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
        head = deleteParticular(head,1);
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
//        System.out.println("after deleting paeticular element");
//        head = deleteElement(head,40,null);
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp =temp.next;
//        }
//

    }
}
