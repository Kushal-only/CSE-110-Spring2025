// Task8
import java.util.Scanner;
public class Task8 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    float num1 = sc.nextFloat();
    System.out.println("Enter second number: ");
    float num2 = sc.nextFloat();
    System.out.println("Enter third number: ");
    float num3 = sc.nextFloat();
    if (num1>num2 && num1>num3){
       System.out.println("Maximum number is " + num1);
    }
    else if (num2>num1 && num2>num3) {
      System.out.println("Maximum number is " + num2);
    }
    else {
      System.out.println("Maximum number is " + num3);
    }
    if (num1<num2 && num1<num3) {
      System.out.println("Minimum number is " + num1);
    }
    else if (num2<num1  && num2<num3) {
    System.out.println("Minimum number is " + num2);
    }
    else {
      System.out.println("Minimum number is " + num3);
    }
  }
}

  
      
       