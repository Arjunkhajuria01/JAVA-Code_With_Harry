// Q3) Create a cass Monkey with Jump ( ) and Bite()
//methods. Create a class Human Which inherits
//this Monkey class and implements BasicAnimal
//interface with eat() and sleep methods.

    interface BasicAnimal{
        void eat();
        void sleep();
    }

        class monkey implements BasicAnimal {
                public void Jump(){
                    System.out.println("It can jump");
                }
                    public void Bite(){
                        System.out.println(("It can Bite"));
                    }
                    public void eat(){
                        System.out.println("it can eat");
                    }
                public void sleep(){
                    System.out.println("It can sleep");
                }
        }








    public class Q3p {
        public static void main(String[] args) {
     monkey mk = new monkey();
     mk.Jump();
     mk.Bite();
     mk.eat();
     mk.sleep();
        }
    }
