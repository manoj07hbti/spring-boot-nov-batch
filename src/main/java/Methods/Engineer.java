package Methods;

public class Engineer {
    public void Masters() {
        System.out.println("I am a computer engineer");
    }
    public void Work(){
        System.out.println("I upgrade pcs");
    }
    public void fee(){
        System.out.println("the fees is variable");
    }

    public static void main(String[] args) {
        Engineer obj = new Engineer();
        obj.Masters();
        obj.Work();
        obj.fee();
    }
    }

