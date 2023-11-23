package Methods;

public class Evenodd {
    public void numbers(){
        for(int i=1;i<=2000;i++){
            if(i%2==0){
                System.out.println("the no. is even "+i);
            }
            else{
                System.out.println("the no. is odd "+i);
            }
        }
    }

    public static void main(String[] args) {
        Evenodd obj= new Evenodd();
        obj.numbers();
    }
}
