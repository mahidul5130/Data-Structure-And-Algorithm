import org.w3c.dom.Node;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode employeenode = new EmployeeNode(employee);
        employeenode.setNext(head);
        if (head == null) {
            tail = employeenode;
        } else {
            head.setPrevious(employeenode);
        }
        head = employeenode;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode employeenode = new EmployeeNode(employee);
        if (tail == null) {
            head = employeenode;
        } else {
            tail.setNext(employeenode);
            employeenode.setPrevious(employeenode);
        }
        tail = employeenode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public EmployeeNode removeFromFront() {

        if (head == null) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {

        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrevious() == null){
            head = null;
        }
        else{
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();

        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head <=> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
