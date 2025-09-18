package com.company;
import java.util.Scanner;
public class CWH_06_Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Marks of Math:");
        int Math=sc.nextInt();
        System.out.println("Enter the Marks of English:");
        int English = sc.nextInt();
        System.out.println("Enter the Marks of Hindi:");
        int Hindi = sc.nextInt();
        System.out.println("Enter the Marks of Science:");
        int Science=sc.nextInt();
        System.out.println("Enter the Marks of Computer:");
        int Computer=sc.nextInt();

        long totalMarks= English+Hindi+Math+Computer+Science;
        double Percentage = totalMarks/5;
        System.out.println(totalMarks);
        System.out.println("The total percentage of CBSE Student in exam:");
        System.out.println(Percentage);

    }

}
