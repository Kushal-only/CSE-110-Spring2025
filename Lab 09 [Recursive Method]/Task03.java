// Task 3
import java.util.Scanner;
public class Task3 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sumDigits(n);
    System.out.println(x);
  }
  public static int sumDigits(int p) {
    if(p==0) {
      return 0;
    }
    else {
      int temp = p%10;
      return temp + sumDigits(p/10);
    }
  }
}

