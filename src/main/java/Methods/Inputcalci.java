package Methods;

public class Inputcalci {
    public void calci(int a,int b){
        int i = a+b;
        System.out.println("the sum of a and b is "+i);


    }
    public void sub(int a, int b){
        int j= a-b;
        System.out.println("the value of a - b is "+j);


    }
    public void multi(int a, int b){
        int k= a*b;
        System.out.println("the value of a multiplication b is "+k);
    }
    public void div(float a, float b){
        double l=a/b;
        System.out.println("the value of divide of a by b is "+l);
    }

    public static void main(String[] args) {
        Inputcalci obj=new Inputcalci();
        obj.calci(10,17);
        obj.calci(12,77);
        obj.calci(33,66);
        obj.sub(65,54);
        obj.sub(76,43);
        obj.multi(78,67);
        obj.multi(87,56);
        obj.div(76,34);
        obj.div(1990,34);
    }
}
