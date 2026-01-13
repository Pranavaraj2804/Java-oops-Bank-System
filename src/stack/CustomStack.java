package stack;

public class CustomStack {
    protected int[] data;
   private static final int DEFAULT_SIZE = 10;
   int ptr = -1;
   public CustomStack(){
       this(DEFAULT_SIZE);
   }
   public CustomStack(int size){
       this.data = new int[size];
   }
   public boolean push(int item){
       if(isFull()){
           System.out.println("Stack is full in Size");
       }
       ptr++;
       data[ptr] = item;
       return true;
   }
   public int pop() throws StackException{
       if(isEmpty()){
           System.out.println("Cannot pop from an Empty Stack");
       }
       return data[ptr--];
   }
   public int peak() throws StackException{
       if(isEmpty()){
           System.out.println("cannot get peak element from the empty stack");
       }
       return data[ptr];
   }

   public boolean isFull(){
       return ptr == data.length-1;
   }
   public boolean isEmpty(){
       return ptr == -1;
   }
}
