package com.company;

public class CWH_31_Method_in_java {
    static int sum(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }else {
            z=2*(x-y);
        }
        return z;
    }

    public static void main(String[] args) {
        int a =10;
        int b=5;
        int c;
        c= sum(a,b);
//        if (a>b){
//            c=a+b;
//        }else {
//            c=a-b;
//        }
        int a1=13;
        int b1=20;
        int c1;
        c1=sum(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
