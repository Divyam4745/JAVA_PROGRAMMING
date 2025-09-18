package com.company;
class Cylinder{
    private int radius;
    private int high;

    public Cylinder(int radius, int high) {
        this.radius = radius;       /*Constructor banaya gya hai ise banane ke liye
                                      ALT+Insert ko click kro aur constructor ko salect krke crtl enter kro*/
        this.high = high;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHigh() {
        return high;
    }
    public void setHigh(int high) {
        this.high = high;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*high;
    }
    public double volume(){
        return Math.PI*radius*radius*high;
    }
}
public class CWH_43_Practice {
    public static void main(String[] args) {
/*
        //Problem 1
        Cylinder mycylinder =new Cylinder(9,12);   //Object banaya gya hai
         mycylinder.setHigh(12);
        System.out.println(mycylinder.getHigh());
         mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());

        //Problem 2
        System.out.println(mycylinder.surfacearea());
        //Problem 3
        System.out.println(mycylinder.volume());
*/
//        Problem 3


    }
}
