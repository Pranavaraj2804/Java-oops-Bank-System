public static class Student{
    static String schoolname = "PSNA";

}

public static void main(String[] args) {
    Student name1 = new Student();
    System.out.println(Student.schoolname);
   Student.schoolname = "RPSR";
    System.out.println(Student.schoolname);
}
