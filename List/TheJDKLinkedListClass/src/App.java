import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Employee mahidul = new Employee("Md. Maksudul Haque", "Siam", 1);
        Employee maksudul = new Employee("Md. Mahidul Haque", "Sijan", 2);
        Employee samiul = new Employee("Md. Samiul Haque", "Sohan", 3);

        System.out.println();

        System.out.println("Add to Front:");
        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(mahidul);
        list.addFirst(maksudul);
        list.addFirst(samiul);
        System.out.println("Size of the list = " + list.size());
        printList(list);

        System.out.println();

        System.out.println("Add to End: ");
        Employee mahjabeen = new Employee("Md. Mahjabeen Haque", "Shoilee", 4);
        // list.add(mahjabeen);
        list.addLast(mahjabeen);
        System.out.println("Size of the list = " + list.size());
        printList(list);

        System.out.println();

        System.out.println("Remove from First: ");
        // list.add(mahjabeen);
        list.removeFirst();
        System.out.println("Size of the list = " + list.size());
        printList(list);

        System.out.println();

        System.out.println("Remove from Last: ");
        // list.add(mahjabeen);
        list.removeLast();
        System.out.println("Size of the list = " + list.size());
        printList(list);

        System.out.println();
    }

    private static void printList(LinkedList<Employee> list) {
        Iterator iter = list.iterator();
        System.out.print("Head -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");
    }
}
