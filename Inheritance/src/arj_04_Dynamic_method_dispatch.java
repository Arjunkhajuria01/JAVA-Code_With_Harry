//Dynamic method dispatch
    class phone{
    public void calling(){
        System.out.println("it can call");
    }
    public void screen(){
        System.out.println("it has a display");
    }
}

    class smartphone extends phone{
        public void calling(){
            System.out.println("it can call");
        }
    }









public class arj_04_Dynamic_method_dispatch {
    public static void main(String[] args) {
//        smartphone sc = new smartphone();  // allowed
//        phone ph = new phone();    // allowed

       phone sc = new smartphone();   // also allowed as smartphone sc is the reference of the parent class
                                        // and new phone(); is the object of the child class .

       //  phone ph  = new smartphone();  // not allowed as the phone is child class .

    }
}
