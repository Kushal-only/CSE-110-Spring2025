// Task 13
import java.util.Scanner;
public class Task13 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int m = 0;
    while(n>0) {
      n=n/10;
      m++;
    }
    System.out.println("total digits: " + m);
  }
}
  

    
    