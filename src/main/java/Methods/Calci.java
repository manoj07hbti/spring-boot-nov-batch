package Methods;

public class Calci {
    public void add(){
    int a=5;
    int b=12;
    int c=a+b;

        System.out.println("the sum of a and b is "+c);

    }
        public void sub(){
        int a=25;
        int b=5;
        int difference=a-b;

        System.out.println("the difference of a and b is" +difference);
    }
    public void divide(){
        int a = 35;
        int b = 5;
        double div =(double)a/b;
        System.out.println("the divide of the given values are "+div);
    }
    public void mul(){
        int a =45;
        int b = 45;
        int mulres=a*b;

        System.out.println("the result of multiplication is "+mulres);
    }

    public static void main(String[] args) {
        Calci obj = new Calci();
        obj.add();
        obj.sub();
        obj.divide();
        obj.mul();
    }
}
