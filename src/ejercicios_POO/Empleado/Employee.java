package Empleado;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
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
    public int getAnnualSalary(){
        return salary*12;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int percent){
        return salary*percent;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ']';
    }
}
class main{
    public static void main(String[] args) {
        Employee employee = new Employee(2, "Juan", "Rodriguez",500);
        System.out.println(employee);
        System.out.println("Raise salary= "+ employee.raiseSalary(3));
        System.out.println("Annual salary= "+ employee.getAnnualSalary());
    }
}
