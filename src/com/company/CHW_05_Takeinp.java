package com.company;
import java.util.Scanner;
public class CHW_05_Takeinp {
    public static void main(String[]args){
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Num1");
//        int a = sc.nextInt();
        float a=sc.nextFloat();
        System.out.println("Enter the New Num2");
//        int b= sc.nextInt();
        float b=sc.nextFloat();
        System.out.println();
//        int sum=a+b;
        float sum=a+b;
        System.out.println(sum);
    }
}