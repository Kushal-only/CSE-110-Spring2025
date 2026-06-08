// Task 6
import java.util.Scanner;
public class Task6 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = power(n,m);
    System.out.println(x);
  }
  public static int power(int p,int q) {
    if(q==0) {
      return 1;
    }
    else {
      return p*power(p,q-1);
    }
  }
}

