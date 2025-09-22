package com.company;
abstract class Parent1{
    Parent1(){
        System.out.println("I am Parent class constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void Greet();
}
class child2 extends Parent1{

    public void Greet(){
        System.out.println("good morning");
    }
}
abstract class child3 extends Parent1{
    public void Greet(){
        System.out.println("I am good");
    }
}
public class CWH_53_abstract {
    public static void main(String[] args) {
        //    Parent1 p = new Parent1();
        child2 c = new child2();
//    child3 c3 = new child3();
    }
}
