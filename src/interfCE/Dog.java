package interfCE;

public class Dog implements Animal{
    @Override
    public void Sound(){
        System.out.println("Dog barks");
    }
    @Override
    public void eat(){
        System.out.println("Dog eats bones");
    }

}
