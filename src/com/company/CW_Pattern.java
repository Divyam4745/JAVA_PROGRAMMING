package com.company;
import java.util.Scanner;
//public class CW_Pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class pattern{
//    public static void main(String[] args) {
//        int n=4;
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }
//
//}
//class pattern1{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print((char)(i+64)+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class pattern3{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//class Triangle{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//        for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class Triangle2{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//
//    }
//}

//class Triangle3{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print((char)(i+64)+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//class Triangle4{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//class Triangle5{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//class Triangle6{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n+1-i;j++){
//                System.out.print((char)(i+64)+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class CW_Pattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m= sc.nextInt();
//        int n = sc.nextInt();
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == m || j == 1 || j == n)
//                    System.out.print("* ");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class Pattern5{
//    public static void main(String[] args) {
//        int n =5;
//        int mid;
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                mid=(n/2)+1;
//                if(i==mid||j==mid)
//                    System.out.println("* ");
//                else System.out.println(" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class Pattern6{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int a =1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(a++ +" ");
//            }
//            System.out.println();
//        }
//    }
//}
//class Pattern7{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int a =1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                if((i+j)%2==0) System.out.print(1+" ");
//                else System.out.print(0+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//class Pattern8{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j =1;j<=n;j++){
//                if(i%2==1) System.out.print((char)(i+96)+" ");
//                else System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//class FlipTriangle{
//    public static void main(String[] args) {
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if((i+j)>n) System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}

class FlipTriangle1{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {  //Space
                System.out.print(" "+" ");
            }
                for (int j= 1; j <= i; j++) {
                   System.out.print("*"+" ");  //Star
               }
                System.out.println();
            }
        }
    }

//class FlipTriangle2{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" "+" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//class FlipTriangle3{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" "+" ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print((char)(i+64) +" ");
//            }
//            System.out.println();
//        }
//    }
//}
class Rhombus{
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class Pyramid{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("* ");   //PYRAMID
            }
            System.out.println();
        }
    }
}
class Pyramidanothermethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {     //PYRAMID
                System.out.print("* ");
            }
                nsp--;
                nst += 2;
            System.out.println();
        }
    }

    class Diamond {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" " + " ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}