package com.company;

import javax.management.modelmbean.ModelMBean;

interface Bicycle{
    int a= 45;
    void Breakup(int Decrement);
    void  speedup(int Increment);
}
interface motorcycle{
    void Blowhorn();
    void Blowhorn2();
}
class Avoncycle implements Bicycle, motorcycle {
    void blowhorn(){
        System.out.println("poo,piii,poopoo");
    }
    public void Breakup(int Decrement){
        System.out.println("Speed Down");
    }
    public void speedup(int Increment){
        System.out.println("Speed up");
    }

    public  void Blowhorn() {
        System.out.println("beee,peee,pooo");

    }
    public void Blowhorn2() {
        System.out.println("peee,pooo,jiii,jooo");
    }
}
public class CWH_54_Interfaces {
    public static void main(String[] args) {
        Avoncycle c1 = new Avoncycle();
//        c1.Breakup(4);
        //you can use properties of interface
//        System.out.println(Avoncycle.a);
        //you can not modify in interface
//        Avoncycle.a=60;
        c1.Blowhorn();
        c1.Blowhorn2();
    }
}
