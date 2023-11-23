package Methods;

public class Evenoddinput {
    public void even(int a){
        if (a%2==0)
        {
            System.out.println("the no. is even" +a);
        }

        else{
            System.out.println("the no. is odd " +a);
        }
    }

    public static void main(String[] args) {
        Evenoddinput obj = new Evenoddinput();
        obj.even(6);
        obj.even(8);
        obj.even(11);
        obj.even(78);
    }

}
