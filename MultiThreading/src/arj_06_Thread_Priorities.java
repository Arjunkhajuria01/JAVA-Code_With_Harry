// Threds in java can be provided with priority
/*
java.lang.Thread.MIN PRIORITY = 1
java.lang.Thread.NORM PRIORITY = 5
java. lang. Thread. MAX PRIORITY = 10

 */
class Mythreadsnew extends Thread{
    // 2) Overriding the run method  :-
    public void run(){
        while(true) {
            System.out.println("Im cooking ");
        }
    }
}
class Mythreads2new extends Thread{
    public void run(){
        while(true) {
            System.out.println("Im chatting");
        }
    }
}


public class arj_06_Thread_Priorities {
    public static void main(String[] args) {
        class newThread_class {
            public static void main(String[] args) {
                Mythreadsnew mt = new Mythreadsnew();
                Mythreads2new mt2 = new Mythreads2new();
                mt.start();
                mt2.start();
            }
        }
    }
}
