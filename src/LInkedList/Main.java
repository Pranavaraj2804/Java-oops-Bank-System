package LInkedList;

public class Main {
    static void main() {
       SLL list = new SLL();
       list.insertFirst(45);
        list.insertFirst(5);
        list.insertFirst(345);
        list.insertFirst(67);
        list.insertFirst(56);
        list.insertFirst(68);

        System.out.println("Insert at HEAD");
     list.display();
        System.out.println();
        System.out.println("Insert at LAST");
        list.insertLast(9);
        list.display();
        System.out.println();
        System.out.println("Insert AT particular Element");
        list.InsertIndex(15,1);
        list.display();
        System.out.println();
        System.out.println("After delete head");
        list.deleteFirst();
        list.display();
        System.out.println();
        System.out.println("After delete tail");
        list.DeleteLast();
        list.display();
        System.out.println();
        System.out.println("After delete Particular");
        list.DeleteParticular(3);
        list.display();

        DLL list1 = new DLL();
        System.out.println();
        System.out.println("Insert at Head");
        list1.InsertFirst(56);
        list1.InsertFirst(34);
        list1.InsertFirst(45);
        list1.InsertFirst(23);
        list1.InsertFirst(3);
        list1.display();
        System.out.println("Insert before head");
        list1.InsertFirst(15);
        list1.display();
        System.out.println();
        System.out.println("After Insert last");
        list1.InsertLast(455);
        list1.display();
        System.out.println();
        System.out.println("After Insert Particular");
        list1.insertParticular(2,500);
        list1.display();
        System.out.println();
        System.out.println("After Insert Particular");
        list1.insertAfterVal(23,400);
        list1.display();




    }
}
