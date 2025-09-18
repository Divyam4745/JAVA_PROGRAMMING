package com.company;

public class claculator {
    public static void main(String[] args) {
        int a = 23;
        int b = 34;
        char Operator = '+';
        switch (Operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invaild Operator");
    }}}