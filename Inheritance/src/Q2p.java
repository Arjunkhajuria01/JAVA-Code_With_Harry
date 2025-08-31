// Q2) use the pen class from Q1 to create a concrete class fountain pen , with additional method changepin().

     class fountain_pen extends write{
        public void Change_pin(){
            System.out.println("Fountain can change pin");
        }
     }




     public class Q2p {
        public static void main(String[] args) {
    fountain_pen fp = new fountain_pen();
    fp.Change_pin();

        }
    }
