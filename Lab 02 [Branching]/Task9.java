// Task9
import java.util.Scanner;
public class Task9 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter side 1: ");
    int side1 = sc.nextInt();
    System.out.println("Enter side 2: ");
    int side2 = sc.nextInt();
    System.out.println("Enter side 3: ");
    int side3 = sc.nextInt();
    if (side1==side2 && side2==side3){
      System.out.println("This is a Equilateral triangle");
    }
    else if (side1==side2 || side2==side3 || side1==side3) {
       System.out.println("This is a Isoceles triangle");
    }
    else {
       System.out.println("This is a Scalene triangle");
    }       
  }
}

  