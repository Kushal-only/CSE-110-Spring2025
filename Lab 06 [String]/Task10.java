// Task 10
import java.util.Scanner;
public class Task10 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    String m = sc.nextLine();
    String x = "";
    int y = 0;
    for(int i=0;i<m.length();i++) {
     char a = m.charAt(i);
     for(int j=y;j<n.length();j++) {
       char b = n.charAt(j);
       if(a==b) {
         x = x+a;
         y++;
       }
       else {
         break;
       }
     }
    }
    if(x.equals(n)) {
      System.out.println("Invalid");
    }
    else {
      System.out.println("Valid");
    }
  }
}