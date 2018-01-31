package oop7;

import java.util.Scanner;

public class midterm1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String id = getID ();

    }
    private static String getID (){
        System.out.print("Enter employee id : ");
        return scanner.nextLine();

    }
}

