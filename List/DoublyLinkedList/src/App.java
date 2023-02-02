import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Employee mahidul = new Employee("Md. Maksudul Haque", "Sijan", 1);
        Employee maksudul = new Employee("Md. Mahidul Haque", "Siam", 2);
        Employee samiul = new Employee("Md. Samiul Haque", "Sohan",3);

        System.out.println();

        EmployeeLinkedList employeelinkedlist =  new EmployeeLinkedList();
        employeelinkedlist.addToFront(mahidul);
        employeelinkedlist.addToFront(maksudul);
        employeelinkedlist.addToFront(samiul);

        employeelinkedlist.printList();

        System.out.println();

        System.out.println(employeelinkedlist.getSize());

        System.out.println();

        Employee mahjabeen = new Employee("Md. Mahjabeen Haque", "Shoilee",4);
        employeelinkedlist.addToFront(mahjabeen);
        employeelinkedlist.printList();
        System.out.println(employeelinkedlist.getSize());

        System.out.println();

        System.out.println(employeelinkedlist.isEmpty());

        System.out.println();

        System.out.println();

        System.out.println(employeelinkedlist.removeFromFront());
        employeelinkedlist.printList();
        System.out.println(employeelinkedlist.getSize());

        System.out.println();

        Employee shoilee = new Employee("Md. Mahjabeen Haque", "Shoilee",0);
        employeelinkedlist.addToEnd(shoilee);
        employeelinkedlist.printList();
        System.out.println(employeelinkedlist.getSize());

        System.out.println();
    }
}
