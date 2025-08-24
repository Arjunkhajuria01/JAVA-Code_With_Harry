import java.util.Scanner;
class square{
    int side;
    Scanner sc = new Scanner(System.in);

    public int side(){
        System.out.println("enter the side");
        side = sc.nextInt();
        return side;
    }
    public void area(){
        System.out.println("the area is :" + side*side);
    }
    public void perimeer(){
        System.out.println("the perimeter is :" + 2*side*side);

    }

}



public class Q3 {

    public static void main(String[] args) {
//        System.out.println("Enter the ISde of SQuare:");
//        int side = sc.nextInt();
        square sqr1 = new square();

        sqr1.side();
        sqr1.area();
        sqr1.perimeer();


    }
}