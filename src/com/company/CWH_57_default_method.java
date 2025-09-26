package com.company;
interface Camera{
    void takesnap();
    void recordvedio();
}
interface WiFi{
    String[] getnetwork();
    void connecttonetwork(String Network);
}
class Mycelllphone{
    void callnumber(int phonenumber){
        System.out.println("calling "+phonenumber);
    }
    void pickingcall(){
        System.out.println("Calling...");
    }
}
class mysmartphone extends Mycelllphone implements WiFi,Camera{
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordvedio(){
        System.out.println("Recording vedio..");
    }
    public String[] getnetwork(){
        System.out.println("Getting network..");
        String[] networklist={"Divyam","Rahul","Divya"};
        return networklist;
    }
    public void connecttonetwork(String Network){
        System.out.println("connectingtonetwork "+Network);

    }
}
public class CWH_57_default_method {
    mysmartphone m=new mysmartphone();
    

}
