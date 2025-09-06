// MULTI THREADING USING RUNNABLE INTERFACE

class Myrunnable implements Runnable{
    public void run(){
        System.out.println("im a thread 1 not a threat");
    }
}
class Myrunnable2 implements Runnable{
    public void run(){
        System.out.println("im a thread 2 not a threat");
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
// ccreating objects
        Myrunnable mr = new Myrunnable();
        Myrunnable2 mr2 = new Myrunnable2();

    }
}
