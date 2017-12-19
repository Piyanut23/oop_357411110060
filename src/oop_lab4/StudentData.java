package oop_lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentData {
    public static BufferedReader reader=new BufferedReader(
            new InputStreamReader(System.in));
    public static String getName()throws IOException{
        System.out.println("Enter your name:");
        return reader.readLine();
    }//getName
    public static String getaddress()throws IOException {
        System.out.println("Enter your address:");
        return reader.readLine();
    }
    public static String getID()throws IOException {
        System.out.println("Enter your ID:");
        return reader.readLine();
    }
    public static String getmajor()throws IOException {
        System.out.println("Enter your major:");
        return reader.readLine();
    }
    public static String getEmail()throws IOException {
        System.out.println("Enter your Email:");
        return reader.readLine();
    }

    public static void main(String[] args) throws IOException{
        String name = getName();
        String address = getaddress();
        String ID = getID();
        String major = getmajor();
        String Email= getEmail();
        System.out.println(getName()+"\n"+getaddress()+"\n"+getID()+"\n"+getmajor()+"\n"+getEmail());



    }//main

}//class
