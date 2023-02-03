public class App {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(new Employee("Jane", "Jones", 123));
        queue.add(new Employee("John", "Doe", 4567));
        queue.add(new Employee("Mary", "Smith", 2632));
        queue.add(new Employee("Mike", "Wilson", 3245));
        queue.add(new Employee("Garry", "Wiliamson", 3855));

        System.out.println();
        System.out.println("Peeked Item = " + queue.peek());
        System.out.println();

        System.out.println();
        System.out.println("Popped: " + queue.reomove());
        System.out.println();

        System.out.println();
        System.out.println("Peeked Item = " + queue.peek());
        System.out.println();

        System.out.println();
        queue.printQueue();
        System.out.println();

    }
}
