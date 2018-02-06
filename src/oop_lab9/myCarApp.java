package oop_lab9;

public class myCarApp {
    public static void main(String[] args) {
        Engine engine = new Engine("15000cc", "V-tec V4");


        //car

        Car car = new Car("Honda", "Black", engine);
        System.out.print(car.toString());


    }//main
}//class