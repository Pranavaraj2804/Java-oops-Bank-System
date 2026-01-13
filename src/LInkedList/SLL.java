package LInkedList;
public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }private class Node{
       private int data;
      private  Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size+=1;
    }
    public void insertLast(int data){
        Node node = new Node(data);
        if(tail==null){
            insertFirst(data);
            return;
        }
        tail.next = node;
        node.next = null;
        size++;
    }
    public void InsertIndex(int data,int Index){
        if(Index==0){
            insertFirst(data);
            return;
        }
        if(Index==size){
            insertLast(data);
            return;
        }
        Node temp = head;
        Node node = new Node(data);
        for(int i =1;i<Index;i++){
            temp =temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }
    public void deleteFirst(){

        if(head == null){
            return;
        }

        head = head.next;
        size--;

        if(head == null){
            tail = null;
        }
    }
    public void DeleteLast(){
        if(size<=1){
            deleteFirst();
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next =null;
        tail = temp;
        size--;
    }
    public void DeleteParticular(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            DeleteLast();
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;

    }

    public  void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
