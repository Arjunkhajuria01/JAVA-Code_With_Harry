// Create a class Sphere and use getters and setters to set its radius and height.
class Sphere{
    private int radius;
    private int height;

    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
}



public class Q5 {
    public static void main(String[] args) {
        Sphere sp1 = new Sphere();
        sp1.setHeight(220);
        System.out.println(sp1.getHeight());

        sp1.setRadius(32);
        System.out.println(sp1.getRadius());
    }
}
