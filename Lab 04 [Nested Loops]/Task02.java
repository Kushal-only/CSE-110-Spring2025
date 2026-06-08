// Task2
import java.util.Scanner;
public class Task2 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("The value of N: ");
    int n = sc.nextInt();
    int y = 0;
    for(int i=1;i<=n;i++){
      int sum = 0;
      int j = 1;
      while(j<=i){
      sum=sum+j;
      j++;
      }
      y=y-sum;
    }
    System.out.print("The valure of y: " + y);
  }
}
      
    