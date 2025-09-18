package com.company;
class Parents{
    public int x;

    public Parents(){
        System.out.println("Mai ek constructor hu");
    }
    public Parents(int x){
        System.out.println("Mai ek overloaded constructor hu " + x);
    }
//    public int getX() {
//        return x;
//    }
//    public void setX(int x) {
//        this.x = x;
//    }
}
class subclass extends Parents{
    public int y;
    public subclass(){
//        super(0);        //super keyword ka use argument wala constructor ko call krne ke liye kiya jata hai
        System.out.println("Mai ek subclass ka constructor hu");
    }
    public subclass(int x,int y){
        super(x);
        System.out.println("Mai ek subclass ka  overloaded constructor hu y ki value " + y);
    }
//    public int getY() {
//        return y;
//    }
//    public void setY(int y) {
//        this.y = y;
//    }
}
public class CWH_45_Constructor_in_Java {
    public static void main(String[] args) {
//        Parents d= new Parents();
//        Parents n= new Parents(4);
//        d.setX(8);
//        System.out.println(d.getX());
        subclass m= new subclass(45,13);

    }
}
