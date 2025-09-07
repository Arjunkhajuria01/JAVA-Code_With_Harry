// constructors in thread class

class newthread extends Thread{
    int i ;
    public newthread(String name){
        super(name);
    }
    public void run(){
        while (i <= 20){
            System.out.println("Im a thread named :" + getName());
        }

    }
}





public class arj_05_Constructors_from_Thread_class {
    public static void main(String[] args) {
        newthread nt = new newthread("arjun");
        Thread goli1 = new Thread(nt);

        goli1.start();
    }
}
