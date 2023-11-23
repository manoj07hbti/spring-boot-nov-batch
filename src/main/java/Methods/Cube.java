package Methods;

public class Cube {
    public void Threenum(){
        int c=5;
        int answer =c*c*c;
        System.out.println("the ccube of no. is "+answer);
    }

    public static void main(String[] args) {
        Cube obj=new Cube();
        obj.Threenum();
    }
}
