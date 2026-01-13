package stack;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public CustomQueue(){
        data = new int[DEFAULT_SIZE];
    }
    public boolean Insert(int item){
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }
        data[end++] = item;
        return true;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i = 0; i < end; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int Remove() throws Exception{
        if(isEmpty()) {
           throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        for(int i=1;i<end;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
}
