package Methods;

public class Cubeusinginput {
    public void cube(int a){
        int cubee= a*a*a;
        System.out.println("the value of cube is "+cubee);

    }

    public static void main(String[] args) {
        Cubeusinginput obj=new Cubeusinginput();
        obj.cube(9);
        obj.cube(10);
        obj.cube(15);
    }
}

