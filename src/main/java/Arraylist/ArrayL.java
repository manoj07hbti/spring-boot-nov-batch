package Arraylist;

import java.util.ArrayList;

public class ArrayL {
    public void data() {
        ArrayList<String> namesofemp = new ArrayList<>();
        namesofemp.add("Ram");
        namesofemp.add("rani");
        namesofemp.add("Khan");
        namesofemp.add("kkumar");
        namesofemp.add("sidd");
        namesofemp.add("shyam");
        for (int i = 0; i < namesofemp.size(); i++) {
            System.out.println("name of the employees :" + namesofemp.get(i) + " :   is at  index :" + i);
        }

    }

    public void value() {

        {
            ArrayList<Integer> nos = new ArrayList<>();
            nos.add(1);
            nos.add(3);
            nos.add(6);
            nos.add(8);
            nos.add(9);
            for (int i = 0; i < nos.size(); i++) {
                System.out.println("the size of integer is :" + nos.get(i) + "the index value is :" + i);
            }
        }


            }
    public void fraction(){
        ArrayList<Double> dec = new ArrayList<>();
        dec.add(78.3);
        dec.add(758.3);
        dec.add(785.3);
        dec.add(78.356);
        dec.add(7.3);
        for (int i = 0; i < dec.size(); i++) {
            System.out.println("the size of the integer is :" + dec.get(i) + "the index value is :" + i);
        }

    }
        public static void main (String[]args){
            ArrayL obj = new ArrayL();
            obj.data();
            obj.value();
            obj.fraction();
        }
    }
