// Task 14
import java.util.Scanner;
public class Task14 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    for(int i = sc.nextInt();i>0;i=i/10){
      System.out.print(i%10);
      if(i/10>0) {
        System.out.print(", ");
      }
    }
  }
}
    