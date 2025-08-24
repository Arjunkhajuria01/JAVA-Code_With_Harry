//Create a class rect and do same as Q3.
import java.util.Scanner;
class Rectangle{
    int breadth ;
    int length;
    public void dimen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        length = sc.nextInt();
        System.out.println("Enter the breadth :");
        breadth = sc.nextInt();
    }

    public void area(){
        System.out.println(length*breadth);
    }

    public void perimeter(){
        System.out.println(2*(length+breadth));;
    }


}



public class Q4 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.dimen();
        rec1.area();
        rec1.perimeter();

    }
}
