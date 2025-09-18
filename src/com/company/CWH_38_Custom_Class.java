package com.company;

class Employees{
    public boolean getsalary;
    int id;
    String name;
    public void newdetails(){
        System.out.println("This is new id"+ id);
        System.out.println("This is name"+name);
    }

    public void setname(String hihi) {
    }
}
public class CWH_38_Custom_Class {
    public static void main(String[] args) {
        Employees  Divyam = new Employees();    //Instantinating a new Employees Object
        Employees  John = new Employees();    //Instantinating a new Employees Object

        //Setting Attributes
        Divyam.id= 12;
        John.id=23;
        Divyam.name= "A Person Name";
        John.name="A boy name";

        //Printing the Attributes
        Divyam.newdetails();
        John.newdetails();
//        System.out.println(Divyam.id);
//        System.out.println(Divyam.name);

    }
}
