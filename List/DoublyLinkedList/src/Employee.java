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
        return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", id=" + id + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
        result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (FirstName == null) {
            if (other.FirstName != null)
                return false;
        } else if (!FirstName.equals(other.FirstName))
            return false;
        if (LastName == null) {
            if (other.LastName != null)
                return false;
        } else if (!LastName.equals(other.LastName))
            return false;
        if (id != other.id)
            return false;
        return true;
    }

    
}