// Q1 Create an abstract class Pen with methods
//   write () and refill() as abstract methods.
    abstract class Pen{
        // Method Write
        abstract void write();
        abstract void refill();

    }

        class write extends Pen{
            public void write(){
                System.out.println("It can write");
            }
            public void refill(){
                System.out.println("We can refill it");
            }
        }






    public class Q1p {
        public static void main(String[] args) {
    // creating an object of the class
            write w = new write();
            w.write();
            w.refill();


        }
    }
