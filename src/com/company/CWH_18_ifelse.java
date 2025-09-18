package com.company;
import java.util.Scanner;
public class CWH_18_ifelse {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        age =sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are become to young");
                break;
            case 23:
                System.out.println("You get his dreqam job");
                break;
            case 60:
                System.out.println("You have been reteired");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("You are  using java code");


        /*
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        age =sc.nextInt();

        if (age>30){
            System.out.println("You are Experience");
        } else if (age>18) {
            System.out.println("YOu are semi semi Experience");
        }else{
            System.out.println("You are not Experience");
        }*/

    }
}
