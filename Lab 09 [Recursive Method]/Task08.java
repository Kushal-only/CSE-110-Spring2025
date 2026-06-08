// Task 8
import java.util.Scanner;
public class Task8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(fibonacci(n));
  }
  public static int fibonacci(int x) {
    if(x==0) {
      return 0;
    }
    if(x==1) {
      return 1;
    }
    else {
      int s = fibonacci(x-1) + fibonacci(x-2);
      return s;
    }
  }
}