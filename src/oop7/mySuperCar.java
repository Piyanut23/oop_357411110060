package oop7;
import java.util.Scanner;

public abstract class mySuperCar {
    public  static void main(String[] args) {
        //create Ojbects as Student
        SuperCar superCar1 = new SuperCar();
        superCar1.setBrand("Honda");
        superCar1.setColor("Rad");
        superCar1.setSize("2500cc");
        superCar1.setSpeed("200/ชม.");
        superCar1.setCountry("Japan");
        System.out.println(superCar1.toString());

        SuperCar superCar2 = new SuperCar();
        superCar2 = inputData(superCar2);
        System.out.println(superCar2.toString());

    }//main

    private static SuperCar inputData(SuperCar  s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your SuperCar data: ");
        System.out.print("brand: ");
        s.setBrand(scanner.nextLine());
        System.out.print("color: ");
        s.setColor(scanner.nextLine());
        System.out.print("size: ");
        s.setSize(scanner.nextLine());
        System.out.print("speed: ");
        s.setSpeed(scanner.nextLine());
        System.out.print("country: ");
        s.setCountry(scanner.nextLine());
        return s;


    }



}//class