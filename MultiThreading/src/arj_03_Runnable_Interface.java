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

class Runnable_Interface {
    public static void main(String[] args) {
// ccreating objects
        // first we have to creat a bullet for this class
        // then we have to create a thread object of each class
        Myrunnable bullet1= new Myrunnable();
        Thread gun1 = new Thread(bullet1);


        Myrunnable2 bullet2 = new Myrunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
