package LInkedList;

import Practise1.Parent;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    private class Node{
    private int data;
    private Node next;
    private Node prev;

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    public Node(int data){
        this.data = data;
    }
}
    public void InsertFirst(int data){
        Node node  = new Node(data);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
}
public void InsertLast(int data){
    Node node = new Node(data);
    node.prev = tail;
    node.next = null;
    if(tail!=null){
        tail.next = node;
    }
    tail = node;
  if(head==null){
      head = tail;
  }
  size++;
}
public void insertParticular(int after,int data){
        Node node  = new Node(data);
        if(after==0){
            InsertFirst(data);
            return;
        }
        if(after==size-1){
            InsertLast(data);
            return;
        }
        Node temp = head;
        for(int i =0;i<after;i++){
            temp = temp.next;
        }
        temp.next.prev = node;
       node.next = temp.next;
        node.prev = temp;
        temp.next = node;
    size++;

}
    public void insertAfterVal(int key, int data){

        if(head == null){
            System.out.println("List empty");
            return;
        }

        Node temp = head;

        // search for key
        while(temp != null && temp.data != key){
            temp = temp.next;
        }

        // key not found
        if(temp == null){
            System.out.println("Key not found");
            return;
        }

        // key is at tail
        if(temp == tail){
            InsertLast(data);
            return;
        }

        Node node = new Node(data);

        node.next = temp.next;
        node.prev = temp;

        temp.next.prev = node;
        temp.next = node;

        size++;
    }

    public void display(){
    Node temp = head;
    while (temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("End");
}
}
