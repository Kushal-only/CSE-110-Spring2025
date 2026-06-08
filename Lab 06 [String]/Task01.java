// Task 1
import java.util.Scanner;
public class Task1 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    String x = "";
    char m = ' ';
    for(int i=0;i<n.length();i++) {
      if(n.charAt(i)>='a' && n.charAt(i)<='z'){
         m = (char)(n.charAt(i)-32);
      }
      else {
        m = (char)(n.charAt(i));
      }
      x = x+m;
    }
    System.out.print(x);
  }
}
