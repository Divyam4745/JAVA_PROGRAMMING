package com.company;
interface Bicycle{
    void Breakup(int Decrement);
    void  speedup(int Increment);
}
class Avoncycle implements Bicycle{
    void blowhorn(){
        System.out.println("poo,piii,poopoo");
    }
    public void Breakup(int Decrement){
        System.out.println("Speed Down");
    }
    public void speedup(int Increment){
        System.out.println("Speed up");
    }
}
public class CWH_54_Interfaces {
    public static void main(String[] args) {

    }

}
