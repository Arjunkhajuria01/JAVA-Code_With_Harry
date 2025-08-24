// Create a class employee with following attributes and methods
import java.util.Scanner;

 class employee{
    int salary;
    public void getSalary(){
        System.out.println("The salary is : " + salary);
    }
    String Name;
    public void get_name(){
        System.out.println(Name);
    }
    public void setname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new name : ");
      String new_name = sc.nextLine();
      Name = new_name;
        System.out.println(Name);
    }

}

public class Q1 {
    public static void main(String[] args) {
        employee details1 = new employee();
        details1.salary = 10000;
        details1.getSalary();
        details1.Name = "Arjun";
        details1.get_name();
        details1.setname();

    }
}
