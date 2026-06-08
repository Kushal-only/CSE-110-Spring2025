// Task 8
import java.util.Scanner;
public class Task8 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.println("Enter Number: ");
      int num = sc.nextInt();
      if(num<0) {
        break;
      }
      System.out.println(num + "^2 = " + (num*num));
    }
  }
}

