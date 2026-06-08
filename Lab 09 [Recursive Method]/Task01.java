// Task 1
import java.util.Scanner;
public class Task1 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    oneToN(1,N);
    System.out.println();
    nToOne(1,N);
    System.out.println();
    System.out.println(recursiveSum(1,N));
  }
  // A
  public static void oneToN(int x, int y) {
    if(x>y) {
      return;
    }
    else {
      System.out.print(x + " ");
      oneToN(x+1,y);
    }
  }
  // B
  public static void nToOne(int x, int y) {
    if(x>y) {
      return;
    }
    else {
      System.out.print(y + " ");
      nToOne(x,y-1);
    }
  }
  // C
  public static int recursiveSum(int x, int y) {
    int sum = 0;
    if(x>y) {
      return 0;
    }
    else {
      return x + recursiveSum(x+1,y);
    }
  }
}
    
