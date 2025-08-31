// Q4) Create a class telephone with ring()  lift() nd disconnect() methods as
// abstract methods , Create another class smart_telephone , and demonstrate polymorphism

    abstract class telephone {
        abstract void ring();

        abstract void lift();

        abstract void disconnected();
    }

        class smart_telephone extends telephone{
            public void video(){
                System.out.println("WATCHING VIDEO!!!");
            }
            public void whatsapp(){
                System.out.println("USING WHATSAPP!!!");
            }
        // here ring , lift and disconnected are overridden methods , that indicate runtime polymorphism.

            public void ring(){
                System.out.println("RINGING!!!");
            }
            public void lift(){
                System.out.println("LIFTED!!!");
            }
            public void disconnected(){
                System.out.println("DISCONNECTED!!!");
            }
        }




        public class Q4p {
        public static void main(String[] args) {
        //smart_telephone smt = new smart_telephone();  // Here, the reference type and the object type are
                                                    // the same (smart_telephone). That means you’re
                                                    // just directly calling methods, not using polymorphism.
            // to use polymorphism we can create reference of parent and object of child class
            telephone t = new smart_telephone();
            t.disconnected();
            t.lift();
            t.ring();
            // it can only use the methods fo the reference class .

            //  IN SHORT
            /*
              So summary:
                Reference decides what you can call.
                Object decides whose version runs.
             */
            smart_telephone smt = new smart_telephone();
            smt.video();
            smt.whatsapp(); // now smartphone is the reference also so it can run its own methods as well as the
                            // methods of the telephone , because it implements telephone class also.




        }
    }
