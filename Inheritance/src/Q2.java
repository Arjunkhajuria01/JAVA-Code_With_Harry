// Q2) Create a class Rectangle And use inheritance to create
//another class Cuboid. Try to Rep it as close to
//real word scenario as possible.
class Rectangle{
    int l = 10;
    int b = 5;
    public int length(){
        return l;
    }
    public int breadth(){
        return b;
    }
    public int area(){
        return l*b;
    }

}
    class Cuboid extends Rectangle{
    int h = 10;
        public int height(){
    return h;
        }
        public int volume(){
            return l*b*h;
        }
}





public class Q2 {
    public static void main(String[] args) {
Rectangle R = new Rectangle();
Cuboid CU = new Cuboid();

        System.out.println(R.area());
        System.out.println(CU.volume());
    }
}
