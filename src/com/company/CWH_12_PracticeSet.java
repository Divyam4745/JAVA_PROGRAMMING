package com.company;
import java.util.Scanner;
public class CWH_12_PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question 1

       /*
       float a= 7/4f * 9/2f;
        System.out.println(a);
        */
//         Question 2

        /*
        char grade ='B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypting the Grade
        grade = (char)(grade - 8);
        System.out.println(grade);
        */

//            Question 3
        /*
        int a = sc.nextInt();
        System.out.println(a>8);
        */
//             Question 4
        System.out.println("Enter the value of v: ");
        int v = sc.nextInt();
        System.out.println("Enter the value of u: ");
        int u=sc.nextInt();
        System.out.println("Enter the value of a: ");
        int a= sc.nextInt();
        System.out.println("Enter the value of s: ");
        int s= sc.nextInt();

        double f=((v^2-u^2))/(2*a*s);

        System.out.println(f);

    }
}
