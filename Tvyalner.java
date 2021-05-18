public class Tvyalner {
   private String firstname;
    private  String lastname;
    private   int age;
    private  String ser;
    private  String passportId;

Tvyalner (String firstname,String lastname,int age,String ser , String passportId){
    this.firstname=firstname;
    this.lastname=lastname;
    this.age=age;
    this.ser=ser;
    this.passportId=passportId;
}

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        if (firstname.length()>3&&firstname.length()<15){
            this.firstname=firstname;
        }
    }
    public String getLastname(){
        return  lastname;
    }
    public void setLastname(String lastname){
        if (lastname.length()>6&&lastname.length()<20){
            this.lastname=lastname;
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>18&&age<99){
            this.age=age;
        }
    }
    public String getSer(){
        return ser;
    }
    public void setSer(String ser){
        this.ser=ser;
    }
    public String getPassportId(){
        return passportId;
    }
    public void setPassportId(String passportId){
        if (passportId.substring(0,2).equals("AN")){
            return;
        }
    }
    public void display(){
        System.out.println("Firstname : "+ firstname + " lastname : "+ lastname + " age : "+ age + " ser : "+ ser + " PassportId : "+ passportId);
    }
}
