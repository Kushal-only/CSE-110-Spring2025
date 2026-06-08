// Task1
import java.util.Scanner;
public class Task1 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int limit = sc.nextInt();
    int primecount = 0;
    int count = 0;
    for(int i=2; primecount<limit; i++) {
      count = 0;
      for(int j = 1; j<=i; j++) {
        if(i%j == 0) {
          count++;
        }
      }
      if(count == 2) {
        System.out.println(i);
        primecount++;
      }
      else {
        continue;
      }
    }
  }
}