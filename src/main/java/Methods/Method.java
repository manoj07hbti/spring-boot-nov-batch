package Methods;

public class Method {
    public void Ram() {
        System.out.println("Ram is good boy");
    }
    public void  doctor(){
        System.out.println("this is doctor Ram");
    }
    public void fee(){
        System.out.println("The fees doctor take is 1000");
    }
    public void operation(){
        System.out.println("Dr ram is MS");
    }
    public void treatment(){
        System.out.println("dr ram provides best treatment");
    }
     public static void main(String[] args){

        Method obj = new Method();
        obj.Ram();
        obj.doctor();
        obj.fee();
        obj.operation();
        obj.treatment();
    }
}