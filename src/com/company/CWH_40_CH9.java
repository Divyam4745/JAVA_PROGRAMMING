package com.company;

class myemployess{
    int id;
    String name;
    public void setName(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
}
public class CWH_40_CH9 {
    public static void main(String[] args) {
        myemployess divyam = new myemployess();

//        divyam.id= 34;          //privet ka mtlb Directly access nahi kr skte hai
//        divyam.name="hiiii";    //throws as an Error when use privet modifiers

        divyam.setName("ffdiojvoid");
        System.out.println(divyam.getname());
        divyam.setid(456);
        System.out.println(divyam.getid());



    }
}
