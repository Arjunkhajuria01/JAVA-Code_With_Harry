// INHERITANCE IN JAVA
// " Extends " keyword is used to create inheritance of a class

/*
 Q create a class animal and derive another class dog from it
 */
class animal{
    private String name ;
    private String colour;
   public void setName(String a){
       name = a;
   }
   public void getName(){
       System.out.println("This is a : " + name);
   }

   public void setColour(String b){
       colour = b;
   }

   public void getColour(){
       System.out.println("Its " + colour + " in colour.");
   }
   /*
   💡 General Rule to Remember
        If a parent class has only parameterized constructors,
        child classes must call them explicitly using super(args).
        If you want child classes to work without explicitly calling, always provide a
        no-arg constructor in the parent.
    */
    public animal(){
        System.out.println("This is an animal :");
    }

    public animal(String c){
       System.out.println("This is an animal :" + c );
   }


}
// CREATING AN INHERENT CLASS:
     class dog extends animal{

        }





public class arj_01_Inheritance {
    public static void main(String[] args) {
        animal ani = new animal("jaanvar");
        ani.setName("cow");
        ani.getName();

        ani.setColour("black");
        ani.getColour();

        // now calling getter setter from the child / inherited class

        dog dg = new dog(); // when i made object of the class , it automatically called constructor.

        dg.setName("Kutta");
        dg.getName();

        dg.setColour("Kaala");
        dg.getColour();

// but why are we suing inheritance , what's the point of doing it .

    }
}
