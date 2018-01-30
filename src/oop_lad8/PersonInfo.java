package oop_lad8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student("PersonID:35741110060",
                "nook",
                "Male",
                22,
                "35555555",
                "Is");
        System.out.println(student.toString());
        System.out.println(student.getName());
        Employee employee =new Employee("001",
                "new",
                "Mal",
                2,
                "2222",
                "IB",
                "20000");
        System.out.println(employee.toString());
        System.out.println(employee.getName());

    }//main

}//class
