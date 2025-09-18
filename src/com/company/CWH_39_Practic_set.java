package com.company;

//class Employee{
//    int Salary;
//    String name;
//
//    public int getsalary(){
//        return Salary;
//    }
//    public String getname(){
//        return name;
//    }
//    public void setname(String n){
//        name = n;
//    }
    class Square{
        int side;
        public int area(){
           return side*side;
        }
        public int permiter(int a){
            return 4*a;
        }
    }


//}
public class CWH_39_Practic_set {
    public static void main(String[] args) {
        //Problem 1
//        Employees Divyam = new Employees();
//        Divyam.setname("hihi");
//        System.out.println(Divyam.getsalary);
        Square sq=new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.permiter(6));


    }
}