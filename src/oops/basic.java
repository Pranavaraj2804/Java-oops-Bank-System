package oops;

public class basic {
    static void main() {
        Student kunal = new Student(15,"KUNAL", 97.5F);
        Student pranav = new Student(15,"PRANAV", 98.5F);
        Student samson = new Student(33,"Samson", 99F);
        System.out.println(pranav.name);
        System.out.println(kunal.marks);
       kunal.greeting();
       pranav.billionare();
       Student random = new Student(pranav);
        System.out.println(random.name);
        Student rahul = new Student(kunal);
        System.out.println(rahul.marks);
        Student nandha = new Student(samson);
        System.out.println(nandha.name);
    }
    //create a class for student
    static class Student{
        int rno;
        String name;
        float marks;

       Student(int rno, String name,float marks) {
            this.rno = rno;
            this.name = name;
            this.marks=marks;


        }
        Student(Student other){
           this.name = other.name;
           this.rno = other.rno;
           this.marks = other.marks;
        }


        public void greeting() {
            System.out.println("my name is:"+this.name);
        }

        public void billionare() {
            System.out.println("hey you know my friend "+ this.name+" is a billionare");
        }
    }
}
