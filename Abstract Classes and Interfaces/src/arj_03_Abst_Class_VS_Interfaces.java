// ABSTRACT CLASS VS INTERFACES
/*
THE MAIN DIFFERENCE BETWEEN ABSTRACT CLASS AND INTERFACE IS THAT YOU CANNOT USE MULTIPLE
ABSTRACT CLASS TO CREATE A SINGLE CONCRETE CLASS
BUT
YOU CAN USE MULTIPLE INTERFACE TO CREATE A SINGLE CONCRETE CLASS.

ALL THE PROPERTIES OF INTERFACES ARE FINAL I.E CANNOT BE CHANGED LATER ON IN OBJECT
 */
interface table{
    void applybreak();
    void speedup();
}
interface chair{
    void brand();
    void colour();
    }

// using multiple interfaces to make one concrete class
// the methods of the inherited class from interfaces should be public always

class furniture implements table , chair{
    public void applybreak(){
        System.out.println("apply the breaks bro");
    }
    public void speedup(){
        System.out.println("speed upp bro");
    }
    public void brand(){
        System.out.println("Whats the brand bro");
    }
    public void colour(){
        System.out.println("Whats the colour bro");
    }
}








public class arj_03_Abst_Class_VS_Interfaces {
    public static void main(String[] args) {
// creating the object of the inherited class of the interfaces
        furniture fr = new furniture();
        fr.colour();
    }
}
