package oop_lad8;

public class PetApp {
    private static void main (String[]args){
        Dog dog = new Dog("moo",3,"pik");
        System.out.println(dog.toString());
        dog.makeNoise();
        cat cat = new cat("Giant",1,"parsaer");
        System.out.println(cat.toString());
        cat.makeNoise();
    }
}
