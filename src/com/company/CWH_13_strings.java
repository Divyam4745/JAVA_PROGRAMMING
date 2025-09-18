package com.company;
import java.util.Scanner;
public class CWH_13_strings {
    public static void main(String[] args) {

        String name = new String("Divyam");
        String name1 = "Divyam";
        System.out.print("The name is: ");
        System.out.println(name);

        int a = 6;
        float b = 6.5455f;
        System.out.printf("The value of a is %d and value of b is %f", a,b);
        System.out.format("The value of a is %d and value of b is %f", a,b);

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(st);

    }
}
