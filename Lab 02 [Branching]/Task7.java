// Task7
import java.util.Scanner;
public class Task7 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Salary: ");
    int salary = sc.nextInt();
    System.out.println("Enter age: ");
    int age = sc.nextInt();
    if (age<18 && salary<10000) {
      System.out.println("No TAX");
    }
    else if (salary>=10000 && salary<=20000) {
      System.out.println("Your tax amount is " + salary*5/100 + "Tk");
    }
    else if (salary>20000) {
       System.out.println("Your tax amount is " + salary*10/100 + "Tk");
    }      
  }
}

    