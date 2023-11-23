package Scanner1;

import java.util.Scanner;


public class Scannerdemo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter the sting name : ");
        String name= obj.nextLine();
        System.out.println("the name you typed is " +name);


        System.out.println("Please enter the value of the integer :");
         int integer= obj.nextInt();
         System.out.println("The  entered value of integer is :" +integer);
    }


}
