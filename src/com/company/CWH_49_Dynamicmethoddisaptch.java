package com.company;
class One{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("My name is java");
    }
}
class Two extends One{
    public void name(){
        System.out.println("My name is java");
    }
    public void swagat(){
        System.out.println("Apka Swagat hai");
    }
}
public class CWH_49_Dynamicmethoddisaptch {
    public static void main(String[] args) {
//        One a = new One();
        One obj= new Two(); // Allowed in java
        obj.greet();
//        a.greet();
//        a.name();
    }
}
