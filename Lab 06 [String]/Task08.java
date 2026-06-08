// Task 8
import java.util.Scanner;
public class Task8 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    String x = "";
    int p = 1;
    for(int i=0;i<n.length();i++) {
      char a = n.charAt(i);
      if((a>='a' && a<='z') || (a>='A' && a<='Z')) {
        if(p%2!=0) {
          if(a>='A' && a<='Z') {
            int q = (int)(a+32);
            a = (char)q;
            x = x+a;
          }
          else {
            x = x+a;;
          }
          p = p+1;
        }
        else {
          if(a>='a' && a<='z') {
            int q = (int)(a-32);
            a = (char)q;
            x = x+a;
          }
          else {
            x = x+a;
          }
          p = p+1;
        }
      }
      else {
        x = x+a;
      }
    }
    System.out.print(x);
  }
}
          
     