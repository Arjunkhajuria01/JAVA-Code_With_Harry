// inheritance in interfaces
// we can use inheritance in interface also
// but you cannot inherit a class from interface you can only extend/ inherit an interface from interface

interface sample_interface{
    void video();
    void video2();
}
interface sample_interface2 extends sample_interface{
    void video3();
    void video4();
}

class MySampleClass implements sample_interface2{
//due to inheritance in the 
    public void video(){
        System.out.println("its video3");
    }
    public void video2(){
        System.out.println("its video3");
    }
    public void video3(){
        System.out.println("its video3");
    }
    public void video4(){
        System.out.println("its video4");
    }
}










public class arj_05_Inheritance_in_interfaces {
    public static void main(String[] args) {

    }
}
