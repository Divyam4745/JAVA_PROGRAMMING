package com.company;

public class CWH_Variable_Argument {
//    static int sum(int x,int y){
//        return x+y;
//    }static int sum(int x,int y,int z){
//        return x+y+z;
//    }static int sum(int x,int y,int z,int k){
//        return x+y+z+k;
//    }
    static int sum(int ...arr){
//        Avaliable as int[] arr;
        int result=0;
        for (int a: arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varags Tutorials");
        System.out.println("The sum of a and b is" + sum (34,45));
        System.out.println("The sum of a and b is" + sum (34,65,11));
        System.out.println("The sum of a and b is" + sum (34,65,11,23));
    }

}
