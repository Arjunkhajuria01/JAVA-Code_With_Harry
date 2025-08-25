/*
INTERFACES :- In jave interface is a group of related methods , ' with empty bodies '

in other words:-

INTERFACES , are classes that only and only have abstract methods .
Multiple interfaces can be use to create a single inherent class , but
  multiple abstract classes cant be used to create a single inherent class .
 */

interface car{
    void applybreak();
    void speedup();
}
// creating inherent interface using implements keyword:-

class BMW implements car{
    public void applybreak(){     // NOTE :- INTERFACE METHODS SHOULD ALWAYS BE DECLARED PUBLIC
        System.out.println("break applied");
    }
    public void speedup(){      // // NOTE :- INTERFACE METHODS SHOULD ALWAYS BE DECLARED PUBLIC
        System.out.println("Speed upped");
    }
}





public class arj_02_Interfaces {
    public static void main(String[] args) {

    }
}
