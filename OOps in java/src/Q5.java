// The gta game
class GTA{
    public void hit(){
        System.out.println("IM Hitting......");
    }
    public void run(){
        System.out.println("IM Running......");
    }
    public void shoot(){
        System.out.println("IM Shooting......");
    }

}

public class Q5 {
    public static void main(String[] args) {
    GTA gta = new GTA();
    gta.hit();
    gta.run();
    gta.shoot();

    }
}
