// Task 5
import java.util.Scanner;
public class Task5 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = factorial(n);
    System.out.println(x);
  }
  public static int factorial(int p) {
    if(p==1) {
      return p;
    }
    else {
      return p*factorial(p-1);
    }
  }
}
    