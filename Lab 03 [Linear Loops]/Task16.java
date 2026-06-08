// Task 16 
import java.util.Scanner;
public class Task16 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int divisor = 0;
    for(int i = 1;i<=n;i++) {
      if(n%i==0) {        
        divisor++;
      }
    }
    if(divisor==2){
      System.out.println(n + " is a prime numeber");
    }
    else {
      System.out.println(n + " is a perfect numeber");
    }
  }
}
      
    
    
  