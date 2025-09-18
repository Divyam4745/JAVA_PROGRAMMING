package com.company;

public class CWH_35_PRACTIC_SET {
//    static void Multiplication(int n) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.format("%d x%d =%d\n", n, i, n * i);
//        }
//    }
    static void pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }

//    static void pattern(int n){
//        for(int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        // Problrm 1:
//        Multiplication(5);

        //Problem 2
        pattern(6);

        //Problem 3:
//        pattern(4);

        //Problem 4:
//        fabonacci seeries-> 0,1,1,2,3,5,8,13
    }
}

