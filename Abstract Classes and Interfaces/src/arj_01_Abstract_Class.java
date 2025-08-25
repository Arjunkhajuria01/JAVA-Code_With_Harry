// Abstract Classes
/*
 When Abstract methods are created inside a class , the class itself becomes Abstract class.

    In english abstract means in imagination ,
    so basically abstract methods mean methods that are only imagination
    or we can say that , methods that are later on made solid methods , earlier they were just ideas
    to be implemented

 creating abstract class is basically creating an idea of what should be there in the class
 when it would be in solid form

   An object cannot be created of an abstract class .

   note : Abstract class can have a minimum of 1 abst method , it can contain
   normal concrete methods also .


*/
// Creating an abstract class :

   abstract class abst{
       abstract public void some_method1(int x , int y);
       abstract public void some_method2(int a , String b);
   }
   // creating a inherent class from abstract class
    class abst_inherent extends abst{
       public void some_method1(int x , int y){
           System.out.println(x + "" + y);
       }
       public void some_method2(int a , String b){
           System.out.println(a + "" + b);
       }

   }



public class arj_01_Abstract_Class {
    public static void main(String[] args) {
        //abst ab = new abst() {    // it throws error as object of abstract class acannot be created
        //}

        abst_inherent ab = new abst_inherent();  // its inherited class of abstract class so no error



    }
}
