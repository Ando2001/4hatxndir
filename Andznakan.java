public class Andznakan {
    private String frstname;
    private  String lastneme;
    private int age;
    private String ser;
    private String natianality;


    Andznakan(){

    }
public  Andznakan (String frstname,String lastneme,int age,String ser,String natianality){
        this.frstname=frstname;
        this.lastneme=lastneme;
        this.age=age;
        this.ser=ser;
        this.natianality=natianality;

}
public Andznakan(String frstname,String lastneme,int age){
        this.frstname=frstname;
        this.lastneme=lastneme;
        this.age=age;
}
public void display(){
    System.out.println("frstname : "+ this.frstname + " lastname : "+ this.lastneme + " age : "+ this.age + " ser : "+ this.ser + " nationality : " + this.natianality);

}
public int getage(){
        return age;
}
public void setage(int age){
        this.age=age;
}
public String getFrstname(){
        return frstname;
}
public void setFrstname(){
        this.frstname=frstname;
}
public String getLastneme(){
        return lastneme;
}
public void setLastneme(){
        this.lastneme=lastneme;
}
public String getSer(){
        return ser;
}
public void setSer(){
        this.ser=ser;
}
public String getNatianality(){
        return natianality;
}
public void setNatianality(){
        this.natianality=natianality;
}
}
