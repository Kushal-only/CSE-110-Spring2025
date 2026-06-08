// Task3
import java.util.Scanner;
public class Task3 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.print("Enter Number: ");
    int n = sc.nextInt();
    int divisor = 0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        divisor++;        
      }
    }
    if(n%2!=0){
      break;
    }
    System.out.println(n + " has " + divisor + " divisors");
  }
}
}
       