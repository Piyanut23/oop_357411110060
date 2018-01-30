package oop_lad8;

public class Employee extends Person {
    private String employee;
    private String position;
    private String salary;

    @Override
    public String toString() {
        return "Employee{" +
                "employee='" + employee + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "} " + super.toString();
    }

    public Employee(String personID, String name, String gender, int age, String employeeID, String position, String salary) {
        super(personID, name, gender, age);
        this.employee = employeeID;
        this.position = position;
        this.salary = salary;
    }


}//class
