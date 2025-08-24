// Use a constructor and repeat 1
// NOTE :_
/*
🔹 Rule of Thumb
If values should never change → use constructor only.
If values might change later → use constructor + setters.
If values are optional → use constructor overloading (
so you can create objects in different ways).
 */
class dimensions{
    int Radius ;
    int Height;

    public dimensions(int radius, int height){
        Radius = radius;
       Height = height;
    }
    public int get_radius(){
        return Radius;
    }
    public int get_height(){
        return Height;

    }



}


public class Q3 {
    public static void main(String[] args) {
        dimensions d1 = new dimensions(10 , 20);

        System.out.println(d1.get_height());
        System.out.println(d1.get_radius());


    }
}
