package com.company;
class Circle{
    public int Radius;
    Circle(){
        System.out.println("I am not inn Sub class");
    }
    Circle(int r){
        System.out.println("I am Parent class Constructor");
        this.Radius=r;
    }
    public double area(){
        return Math.PI* this.Radius*this.Radius;

    }
}
class Cylinder1 extends Circle{
    public int hight;
    Cylinder1(int r,int h){
        super(r);   /* super ka use super class ke parameter wale constructor ko define krne me kiya jata hai*/
        this.hight=h;
        System.out.println("I am cylinder1 parameterized  Constructor");
    }
    public double area() {
        return Math.PI * this.Radius*this.Radius*hight;
    }
}
public class CWH_Chapterset10 {
    public static void main(String[] args) {
//        Circle c = new Circle(6);
        Cylinder1 cy = new Cylinder1(7,8);



    }
}
