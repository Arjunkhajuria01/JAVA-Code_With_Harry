// Create an interface Vehicle with a method drive().
//Implement this in classes Car and Bike.
//Test them in main.

    interface Vehicle{
         public void drive();
    }
    class Car implements Vehicle {
        public void drive() {
            System.out.println("im driving the car");
        }
    }
        class Bike implements Vehicle{
           public void drive(){
                System.out.println("im driving a bike");
            }
        }






    public class basic_Q2 {
        public static void main(String[] args) {
            Car cr = new Car();
            Bike bk = new Bike();

            cr.drive();
            bk.drive();

        }
    }
