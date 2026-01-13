package stack;

public class CircularQueue {
    protected int[] data;
    private static final int Default_Size = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;
     public CircularQueue(){
         this(Default_Size);
     }
     public CircularQueue(int size){
         this.data = new int[size];
    }
    public boolean isFull(){
         return size == data.length;
    }
    public boolean isEmpty(){
         return size == 0;
    }
    public boolean Insert(int item){
         if(isFull()){
             System.out.println("queue is full");
             return false;
         }
         data[end++] = item;
         end = end% data.length;
         size++;
         return true;
    }
    public int remove() throws Exception{
         if(isEmpty()){
             throw new Exception("Queue is empty");
         }
         int removed = data[front++];
         front = front % data.length;
         size--;
         return removed;
    }
    public int front() throws Exception{
         if(isEmpty()){
             throw new Exception("Queue is empty");
         }
         return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + "->");
            i++;
            i %= data.length;
        }while (i!=end);
        System.out.println("end");
    }
}
