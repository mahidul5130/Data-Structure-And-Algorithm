import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        List <Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Md. Mahidul Haque", "Sijan", 19101387));
        employeeList.add(new Employee("Md. Sahidul Haque", "Mijan", 17101389));

        System.out.println();

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();
        
        System.out.println(employeeList.get(1));

        System.out.println();

        System.out.println(employeeList.isEmpty());

        System.out.println();

        employeeList.set(1, new Employee("Md. Sahidul Islam", "Mijan", 17101389));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();

        System.out.println(employeeList.size());

        System.out.println();

        employeeList.add(2, new Employee("Md. Shoriful Islam", "Shorif", 18101379));
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }

        System.out.println();


        System.out.println(employeeList.contains(new Employee("Md. Mahidul Haque", "Sijan", 19101387)));

        System.out.println();

        System.out.println(employeeList.indexOf(new Employee("Md. Shoriful Islam", "Shorif", 18101379)));

        System.out.println();

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println();
    }
}
