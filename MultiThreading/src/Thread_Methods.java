class ThreadMeathods1 extends Thread {
    public void run() {
        int i = 0;
        while (i<= 100) {
            System.out.println("Thank You:");
            i++;
        }
    }
}
    class ThreadMeathods2 extends Thread{
    public void run(){
        int i = 0;
        while(i<= 100){
            System.out.println("Thank You Once Again");
            i++;
        }
    }
}


public class Thread_Methods {
    public static void main(String[] args) {
    ThreadMeathods1 tm1 = new ThreadMeathods1();
    ThreadMeathods2 tm2 = new ThreadMeathods2();
    tm1.start();
    try{
        tm1.join(); //  JOIN METHOD uset to join different threads together after the
                    // termination of one thread
    }
    catch (Exception e){
        System.out.println(e);
    }
    tm2.start();
    }
}
