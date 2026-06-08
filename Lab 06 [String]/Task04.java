// Task 4
import java.util.Scanner;
public class Task4 {
  public static void main(String [] args) {
    Scanner sc =  new Scanner(System.in);
    String n = sc.nextLine();
    String m = sc.next();
    String x = "";
    for(int i=0;i<n.length();i++) {
      char ch = n.charAt(i);
      if(ch==m.charAt(0)) {
        System.out.println(x);
        x = "";
      }
      else {
        x = x+ch;
      }
    }
    System.out.print(x);
  }
}
      