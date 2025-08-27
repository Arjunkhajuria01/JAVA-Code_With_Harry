// Q1 Create an abstract class Animal with an abstract method sound().
//Implement two subclasses: Dog and Cat.
//Print their sounds.

    abstract class Animal{
    abstract  void sound();

    }

    class dog extends Animal {
        public void sound() {
            System.out.println("Bhau Bhau");
        }
    }
        class cat extends Animal{
            public void sound(){
                System.out.println("meow meow");
            }
    }






public class basic_Q1 {
    public static void main(String[] args) {

       dog dg = new dog();
       cat ca = new cat();

       dg.sound();
       ca.sound();

        }

    }


