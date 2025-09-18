package com.company;
class A{
    public int Divyam(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class CWH_47Method_Overriding {
    public static void main(String[] args) {
        A x=new A();
        x.meth2();

        B y=new B();
        y.meth2();
    }
}
