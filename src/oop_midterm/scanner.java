package oop_midterm;

public class scanner {
    static scanner =new

    Scanner(System.in);

    public static void main(String[] args) {
        String id = getID();

    }

    private static String getID() {
        System.out.print("Enter employee id : ");
        return scanner.nextLine();


    }
}
