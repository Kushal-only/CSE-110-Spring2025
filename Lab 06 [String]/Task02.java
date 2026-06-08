// Task 2
import java.util.Scanner;
public class Task2 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String m = "";
    for(int i=n.length()-1;i>=0;i--) {
      m = m+n.charAt(i);
    }
    System.out.print(m);
  }
}
    
