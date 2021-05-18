public class Tringle {
    private int sideA;
    private int sideB;
    private int sideC;

    Tringle(int sideA,int sideB ,int sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    public int getSideA(){
        return sideA;
    }
    public void setSideA(int sideA){
        if (sideA>0&&sideA<20){
            this.sideA=sideA;
        }
    }

    public int getSideB(){
        return sideB;
    }
    public void setSideB(int sideB){
        if (sideB>0&&sideB<20){
            this.sideB=sideB;
        }
    }

    public int getSideC(){
        return sideC;
    }
    public void setSideC(int sideC){
        if (sideC>0&&sideC<20){
            this.sideC=sideC;
        }
    }
    public boolean tringle(int sideA,int sideB,int sideC){
        if (sideA+sideB<sideC){
            return false;
        } else if (sideA+sideC<sideB){
            return false;
        } else if (sideB+sideC<sideA){
            return false;
        } else return true;
    }

    public void display(){
        if ((sideA*sideA)+(sideB*sideB)==sideC*sideC){
            System.out.println((sideA*sideB)/2);
        } else if ((sideA*sideA)+(sideC*sideC)==sideB*sideB){
            System.out.println((sideA*sideC)/2);
        } else if ((sideC*sideC)+(sideB*sideB)==sideA*sideA){
            System.out.println((sideB*sideC)/2);
        } else {
            System.out.println(sideB+sideC+sideA);
        }
    }
}
