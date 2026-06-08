// Task 2
import java.util.Scanner;
public class Task2 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    reverseDigits(n);
  }
  public static void reverseDigits(int p) {
    if(p==0) {
      return;
    }
    else {
      int temp = p%10;
      System.out.println(temp);
      reverseDigits(p/10);
    }
  }
}
    