package interfCE;

public class Cat implements Animal {
    @Override
     public void Sound(){
        System.out.println("cat sound is MEOW");
    }
    @Override
    public void eat(){
        System.out.println("cat eats milk");
    }
}
