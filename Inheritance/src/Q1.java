// Create a class Cirle and use inheritance to create
//another class Cylinder from it.

    class Circle{
    public void name(){
        System.out.println("Enter the name");
    }
    public void colour(){
        System.out.println("Enter the colour");
    }
}
    class Cylinder extends Circle{

        }




public class Q1 {
    public static void main(String[] args) {
 Circle c = new Circle();
 Cylinder cy = new Cylinder();
 cy.name();
 cy.colour();

    }
}
