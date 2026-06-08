// Task 6
import java.util.Scanner;
public class Task6 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int y = 0;
    for(int i= 1; i<=N; i++) {
      if(i%2==0){
       y=y-(i*i);
      }
      else{
      y=y+i*i;
      }
    }
    System.out.println(y);
  }
}
