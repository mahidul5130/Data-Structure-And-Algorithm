public class EmployeeLinkedList {
    
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode employeenode = new EmployeeNode(employee);
        employeenode.setNext(head);
        head = employeenode;
        size++;
    }
    
    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFromFront(){
        
        if(head == null){
            return null;
        }

        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();            
        }
        System.out.println("null");
    }
}
