package oop_lab9;

public class myperson {
    public static void main(String[] args) {
        Address address = new Address("12","trag","80110");
        //Job
        Job job = new Job("sales",23000);
        //person
        Person person= new Person("001","Nook",address,job);
        System.out.println(person.toString());
        person.getJob().setSalary(30000);
        System.out.println(person.getJob().getSalary());
        System.out.println(person.getAddress().getPostCode());



    }

}
