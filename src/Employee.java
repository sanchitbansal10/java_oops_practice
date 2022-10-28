public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return 12 * this.salary;
    }

    public int raiseSalary(int percent) {
        this.salary = this.salary + (this.salary * percent/100);
        return this.salary;
    }

    public String toString() {
        String output = "Employee[id=" + this.id;
        System.out.println(output);
        return output;
    }
}
