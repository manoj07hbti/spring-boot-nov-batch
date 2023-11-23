package Methods;

public class Vote {
    public void eligible(int age,String city){
        if(age>18&&city=="Delhi"){
            System.out.println("the person is eligible for voting in Delhi");
        }
        else{
            System.out.println("the person is not eligible for voting in Delhi");

    }
}

    public static void main(String[] args) {
        Vote obj=new Vote();
        obj.eligible(17,"Agra");
        obj.eligible(19,"Delhi");
    }
}
