//package com.company;

//public class area {
//    int r = 0;
//    static void area(float  r){
//        System.out.println(Math. PI *r*r);
//    }
//
//    public static void main(String[] args) {
//        area(2.5f);
//    }
//}
package com.company;
class Main {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of " + num + " is "
                           + factorial(5));
    }
}
