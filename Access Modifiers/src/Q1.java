//Create a class Cylinder and use getters and
//setters to set its radius and height.


// Use 1 to calculate surface area and Volume
//of the Cylinder.

class cylinder {
    // for radius
    private int radius;

    public void setRadius(int input) {
        radius = input;
    }

    public int getRadius() {
        return radius;
    }
   // for height
        int height;

    public void setHeight(int input2){
        height = input2;
    }
    public int getHeight(){
        return height;
    }
    public double area(){
        return 2*3.142*radius * (radius + height);
    }
}


public class Q1 {
    public static void main(String[] args) {
cylinder c1 = new cylinder();
 c1.setRadius(223);
        System.out.println(c1.getRadius());
        c1.setHeight(10);


        System.out.println(c1.area());

    }
}
