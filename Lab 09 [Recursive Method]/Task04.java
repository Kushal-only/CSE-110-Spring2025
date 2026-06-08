// Task 4
import java.util.Scanner;
public class Task4 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    System.out.println(reverse_string(n, 0));
  }
  public static String reverse_string(String x, int y) {
    if(x.length()==y) {
      return "";
    }
    else {
      char ch = x.charAt(y);
      return reverse_string(x,y+1) + ch;
    }
  }
}
      