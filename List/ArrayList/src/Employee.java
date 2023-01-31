public class Employee {
    private String FirstName;
    private String LastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ArrayList [FirstName=" + FirstName + ", LastName=" + LastName + ", id=" + id + "]";
    }
}