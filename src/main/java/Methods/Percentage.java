package Methods;

public class Percentage {
    public void perCalci(){
        int a =125;
        int b = 5;
        double d= (double)(a*b)/100;
        System.out.println("the percentage of the given no. is "+d);
    }

    public static void main(String[] args) {
        Percentage obj=new Percentage();
        obj.perCalci();
    }
}
