// Task5
import java.util.Scanner;
public class Task5 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int x = sc.nextInt();
     if (x%2==0 && x>0){
      System.out.println("Number is positive and even");
    }
     else if (x%2!=0 && x>0){
       System.out.println("Number is positive and odd");
     }
     else if (x<0){
       System.out.println("Number is negative");
     }
     else {
       System.out.println("Number is zero");
     }
  }
}
