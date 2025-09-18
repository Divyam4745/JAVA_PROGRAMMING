package com.company;
class EkClass{
    int a;
    public int getA() {
        return a;   // Getter ka use kiya gya hai
    }
    EkClass(int b){
       this.a=b;   //Constructor this keyword ka use
    }
    public int returnone(){
        return 1;    //method hai
    }
}
class doclass extends EkClass{
    doclass(int x){
        super(x);
        System.out.println("Mai ek constructor class hu");
    }
}
public class CWH_46super_this {
    public static void main(String[] args) {
        EkClass n = new EkClass(5);
        doclass m= new doclass(5);
        System.out.println(n.getA());

    }
}
