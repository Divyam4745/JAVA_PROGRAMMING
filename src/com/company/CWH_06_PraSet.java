package com.company;
import java.util.Scanner;
public class CWH_06_PraSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Question 1:

        System.out.println("Enter the Name of User:");
        String Name=sc.next();
        System.out.println( "Hello " + Name + " Have a Good Day");
        System.out.println();


//        Question 2:

        System.out.println("Enter your Number:");
        System.out.println(sc.hasNext());

    }
}
