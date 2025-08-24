/*
Overload a constructor used to initialize a rectangle
of length 4 and breadth 5 for using custom
parameters:
 */
/*
🔹 Why do we overload constructors?
Because sometimes we don’t always have all the info when creating an object.
If no info → use default values.
If partial info → fill in what we know, keep the rest default.
If full info → set everything.
This makes your class more flexible.
✅ In short:
Constructor overloading = multiple ways to build an object.
It’s like different flavors of the same constructor.
 */


class Rectangel{
    private int length;
    private int breadth;

    public Rectangel(){
        length = 4;
        breadth = 5;

    }
    public Rectangel(int l ){
        length = l;
        breadth = 0;
    }
    public Rectangel(int len , int b){
        length = len;
        breadth = b;
    }

    public void rect(){
        System.out.println("This is a rectangle of height : " + length + " & " + "height :" + breadth);
    }

}






public class Q4 {
    public static void main(String[] args) {
        Rectangel rec1 = new Rectangel(30 , 40);
        rec1.rect();

    }
}
