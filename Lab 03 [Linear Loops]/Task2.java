// Task 2
import java.util.Scanner;
public class Task2 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    for(int i= 1; i<=N; i++) {
      int num= sc.nextInt();
      sum +=num ;
    }
    System.out.println("The sum of " + N + " numbers: "+sum);
    double avg= 1.0*sum/N;
      System.out.println("The average is: "+ avg);
  }
}

    
        