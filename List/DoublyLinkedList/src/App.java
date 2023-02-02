import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Employee mahidul = new Employee("Md. Maksudul Haque", "Siam", 1);
        Employee maksudul = new Employee("Md. Mahidul Haque", "Sijan", 2);
        Employee samiul = new Employee("Md. Samiul Haque", "Sohan",3);

        System.out.println();

        System.out.println("Add to Front:");
        EmployeeLinkedList employeelinkedlist =  new EmployeeLinkedList();
        employeelinkedlist.addToFront(mahidul);
        employeelinkedlist.addToFront(maksudul);
        employeelinkedlist.addToFront(samiul);

        employeelinkedlist.printList();

        System.out.println();

        System.out.println("Getting the size: ");
        System.out.println(employeelinkedlist.getSize());

        System.out.println();

        System.out.println("Add to Front: ");
        Employee mahjabeen = new Employee("Md. Mahjabeen Haque", "Shoilee",4);
        employeelinkedlist.addToFront(mahjabeen);
        employeelinkedlist.printList();
        System.out.println(employeelinkedlist.getSize());

        System.out.println();

        System.out.println("Check If Empty: ");
        System.out.println(employeelinkedlist.isEmpty());

        System.out.println();

        System.out.println();

        System.out.println("Remove From The Front: ");
        System.out.println("Removed Item = "+employeelinkedlist.removeFromFront());
        employeelinkedlist.printList();
        System.out.println(employeelinkedlist.getSize());

        System.out.println();

        System.out.println("Adding to the End: ");
        Employee shoilee = new Employee("Md. Mahjabeen Haque", "Shoilee",0);
        employeelinkedlist.addToEnd(shoilee);
        employeelinkedlist.printList();
        System.out.println(employeelinkedlist.getSize());

        System.out.println();

        System.out.println("Remove From The Front: ");
        System.out.println("Removed Item = "+employeelinkedlist.removeFromFront());
        employeelinkedlist.printList();
        System.out.println(employeelinkedlist.getSize());

        System.out.println();

        System.out.println("Remove From The End: ");
        System.out.println("Removed Item = "+employeelinkedlist.removeFromEnd());
        employeelinkedlist.printList();
        System.out.println(employeelinkedlist.getSize());

        System.out.println();

        // System.out.println("Add before an item: ");
        // Employee ovro = new Employee("Md. Ovro Haque", "Ovro",5);
        // employeelinkedlist.addToBefore(ovro, maksudul);
        // employeelinkedlist.printList();
        // System.out.println(employeelinkedlist.getSize());
    }
}
