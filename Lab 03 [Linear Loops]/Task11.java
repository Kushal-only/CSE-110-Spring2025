// Task 11
import java.util.Scanner;
public class Task11 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    for(int i=1;i<=10;i++){
      System.out.println("Enter Number: ");
      int n = sc.nextInt();
      sum=sum+n;
      System.out.println("sum= " + sum);
    }
  }
}