/*
WORKING OF CONSTRUCTORS IN INHERITED CLASSES :
When a derived class is extended from the base class the constructor of the base class
 is executed first , then the constructor of derived class is executed

 so it works in hierarchy , parent the child then grandchild etc

 */
    class Parent{
    Parent(){
        System.out.println("THIS is the parent class constructor");
    }
    // OVERLOADING THE PARENT CLASS
    Parent(int x){
        System.out.println("THIS is the parent class overloaded constructor with int :" + x);
    }
}
    class Child extends Parent{
     Child(){
         System.out.println("This is the child class constructor");
     }
     //OVERLOADING THE CHILD CLASS
     Child(int y , int z){
         super(6);
         System.out.println("This is the child class overloaded constructor with int :" + y +"and int :" + z);
     }
}
    class Grandchild extends Child{
        Grandchild(){
            super(3,5);
            System.out.println("This is the Grandchild class constructor");
        }
        //OVERLOADING THE GRANDCHILD CONSTRUCTOR
        Grandchild(int a , int b , int c){
            super(3,5);
            System.out.println("This is the Grandchild class overloaded constructor with ints :"+  a + " " + b + " " + c);
        }
    }


public class arj_02_Constructors_in_Inheritance {
    public static void main(String[] args) {
    // CALLING THE GRAND CHILD FIRST
        Grandchild GC = new Grandchild();   // this calls the no arg constructors of each class


    }
}
