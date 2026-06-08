// Task 9 
import java.util.Scanner;
public class Task9 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int x = sc.nextInt();
    int notNeg = 0;
    int neg = 0;
    for(int i=1;i<=x;i++) {
      System.out.println("Enter number " + i + ": ");
      int num = sc.nextInt();
      if (num<0){
        neg++;
      }
        else{
          notNeg++;
        }
      }
      System.out.println(notNeg + "Not-negative numbers");
      System.out.println(neg + "Negative numbers");
  }
}
  
      
                   