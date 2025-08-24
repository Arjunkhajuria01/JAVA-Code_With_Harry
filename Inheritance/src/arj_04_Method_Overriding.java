/*
METHOD OVERRIDING
it is basically calling a method from the parent class in the derived class
 */
    class NewParent{
        public void name(){
            System.out.println("THIS IS A METHOD IN NEWPARENT CLASS");
        }
        public void age(){
            System.out.println("THIS IS ALSO A METHOD IN NEWPARENT CLASS");
        }
}
    class NewChild extends NewParent {
        public void name(){
            // SP BASICALLY NAME METHOD IS CALLED IN CHILD CLASS AGAIN , BUT WIHT SOME CHANGE
            System.out.println("THIS IS A METHOD IN NEWCHILD CLASS");

        }
    }



public class arj_04_Method_Overriding {
    public static void main(String[] args) {
    NewParent np = new NewParent();
    NewChild nc = new NewChild();
    np.name();  // gives : THIS IS A METHOD IN NEWPARENT CLASS
    nc.name();  // gives : THIS IS A METHOD IN NEWCHILD CLASS  coz of method overriding
        // otherwise it would have given the method geom the np class.

    }
}
