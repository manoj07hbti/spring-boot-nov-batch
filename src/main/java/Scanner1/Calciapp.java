package Scanner1;

import java.util.Scanner;

public class Calciapp {

        public int addition(int a, int b){
            int result = a+b;
            return result;
        }

    public static void main(String[] args) {
            Scanner res=new Scanner(System.in);
        System.out.println("Please enter the value of a :");
        int a=res.nextInt();
        System.out.println("Please enter the value  of b :");
        int b=res.nextInt();

            Calciapp obj= new Calciapp();
            int result=obj.addition(a,b);
        System.out.println("the sum of  the two values is :" +result);
    }
}
