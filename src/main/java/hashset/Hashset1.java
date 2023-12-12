package hashset;

import java.util.HashSet;

public class Hashset1 {
    public HashSet<String> firsthash(){
        HashSet <String>obj=new HashSet<>();
        obj.add(("karan"));
        obj.add(("ram"));
        obj.add(("karan"));
        obj.add(("raja"));
        obj.add(("karan"));
        obj.add(("raja"));
        obj.add(("karan"));
        obj.add(("ram"));

        return obj;



    }

    public HashSet<Integer> secondhash(){
        HashSet<Integer>obj1 = new HashSet<>();
        obj1.add(23);
        obj1.add(33);
        obj1.add(23);
        obj1.add(55);
        obj1.add(23);
        obj1.add(55);
        obj1.add(23);

        return obj1;
    }

    public HashSet<Double> thirdhash() {
        HashSet<Double> obj2 = new HashSet<>();
        obj2.add(23.66);
        obj2.add(33.77);
        obj2.add(23.66);
        obj2.add(55.44);
        obj2.add(23.66);
        obj2.add(55.44);
        obj2.add(2.663);

        return obj2;
    }

    public static void main(String[] args) {
        Hashset1 hash = new Hashset1();
        HashSet<String> obj = hash.firsthash();
        for (String var : obj) {
            System.out.println("all the real values are : " + var);
            HashSet<Integer> obj1 = hash.secondhash();
            for (Integer var1 : obj1) {
                System.out.println("all the real integer value : " + var1);
                HashSet<Double> obj2 = hash.thirdhash();
                for (Double var2 : obj2) {
                    System.out.println("all the real integer value : " + var2);
                }
            }

        }
    }
}
