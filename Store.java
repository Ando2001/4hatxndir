public class Store {
    private int countOfWorkers;
    private String name;
    private String phonenumbers;
    private int productnumbers;



    public int getCountOfWorkers(){
        return countOfWorkers;
    }
    public void setCountOfWorkers(int countOfWorkers){
        if (countOfWorkers>2&&countOfWorkers<50){
            this.countOfWorkers=countOfWorkers;
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.length()>=3){
            this.name=name;
        }
    }
    public String getPhonenumbers(){
        return phonenumbers;
    }
    public void setPhonenumbers(String phonenumbers){
        if (phonenumbers.length()<=8&&phonenumbers.replaceAll("[^-]"," ").equals("")){
            this.phonenumbers=phonenumbers;
        } else {
            System.out.println("bacasakan tiv petq chi grel");
        }
    }
    public int getProductnumbers(){
        return productnumbers;
    }
    public void setProductnumbers(int productnumbers){

    }
}
