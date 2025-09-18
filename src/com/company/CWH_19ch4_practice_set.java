package com.company;
import java.util.Scanner;
public class CWH_19ch4_practice_set {
    public static void main(String[] args) {
        //Question 1
        /*int a = 10;
        if (a == 11){
            System.out.println("I am 11");
        }else {
            System.out.println("I am not 11");
        }*/
//        Question 2
//        byte m1,m2,m3;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Mathematics marks");
//        m1 = sc.nextByte();
//        System.out.println("Enter Physics marks");
//        m2 = sc.nextByte();
//        System.out.println("Enter Chemistry marks");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Overall perecentage is" +avg);
//         if (avg>=40&&m1>33&&m2>33&&m3>33){
//             System.out.println("Congralution you passed out in Exam");
//         }else {
//             System.out.println("you failed");
//         }

//        Question 3
        int day=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
         day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                 break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You are enter wrong number");

        }

    }
}
