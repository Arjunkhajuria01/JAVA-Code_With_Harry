//Multithreading
// By creating a Thread by extending Thread class.

// 1) creating a class that extends Thread:-
    class Mythreads extends Thread{
// 2) Overriding the run method  :-
    public void run(){
        while(true) {
            System.out.println("Im cooking ");
        }
    }
}
    class Mythreads2 extends Thread{
    public void run(){
        while(true) {
            System.out.println("Im chatting");
        }
    }
    }
    class Thread_class {
        public static void main(String[] args) {
    Mythreads mt = new Mythreads();
    Mythreads2 mt2 = new Mythreads2();
    mt.start();
    mt2.start();
    }
}
