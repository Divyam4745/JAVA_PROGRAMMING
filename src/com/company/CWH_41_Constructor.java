package com.company;

class myemployesss{
    private int id;
   private String name;

   public myemployesss(){
       id = 34;
       name = "Divyam";
   }
   public myemployesss(String myName,int myId){
       id = myId;
       name = myName;
   }

    public void setName(String n) {
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
public class CWH_41_Constructor {
    public static void main(String[] args) {
        myemployesss divyam = new myemployesss("Programming with harry",78);
//        divyam.setName("iuhiuhi");
//        divyam.setid(65);

        System.out.println(divyam.getid());
        System.out.println(divyam.getname());


    }
}
