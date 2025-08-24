//Create a class cellphone with methods to print "ringing" , "vibrating" etc
 class cellphone{
   public void ringing(){
        System.out.println("Ringing");
    }

   public void  vibrating(){
        System.out.println("Vibrating!!!");
    }

}

public class Q2 {
    public static void main(String[] args) {
        cellphone call = new cellphone();
        call.ringing();;
        call.vibrating();

    }
}
