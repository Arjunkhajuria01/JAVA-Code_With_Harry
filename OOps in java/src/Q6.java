// same for circle
import java.util.Scanner;
class circle{
    int r ;
    public void rad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        r = sc.nextInt();
    }
    public void area(){
        double area = 3.17*r*r;
        System.out.println("The Area is :"+ area);

    }
    public void perimeter(){
        double perimeter = 2*3.17*r;
        System.out.println("The Perimetre is :"+ perimeter);

    }
}

public class Q6 {
    public static void main(String[] args) {
        circle cir = new circle();
       cir.rad();
       cir.area();
        cir.perimeter();


    }
}
