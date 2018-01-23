package oop7;
// Talking about Student?
//1.student id
//2.Major
//3.Faculty
//4.Name

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }//toString

    private String id;
    private String major;
    private String Faculty;
    private String Name;
    //constructor
    //Default constructor
    public Student(){}
    //create constructor by owner
    private Student (String id,String m,String f,String n){
        //asigne data to class properties
        this.id = id;
        this.Faculty = f;
        this.major = m;
        this.Name = n;
    }
    //getter and setter methods

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getFaculty() {
        return Faculty;
    }
    public void setFaculty(String faculty) {
        Faculty = faculty;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
}//class
