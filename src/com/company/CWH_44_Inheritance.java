package com.company;
class base{
     public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and Setting x now");
        this.x = x;
    }
    public void printme(){
        System.out.println("I am a constructor");

    }
}
class derived extends base{  //Inheritance inn java
     public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class CWH_44_Inheritance {
    public static void main(String[] args) {
        //Creating an Object of base class
        base n = new base();
        n.setX(4);
        System.out.println(n.getX());
        //Creating an Object of Derived class
        derived b = new derived();
        b.setX(5);
        b.setY(89);
        System.out.println(b.getX());
        System.out.println(b.getY());

    }
}
