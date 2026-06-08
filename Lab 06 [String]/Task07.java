// Task 7
import java.util.Scanner;
public class Task7 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String m = sc.next();
    String x = "";
    for(int i=0;i<n.length();i++) {
      char p = n.charAt(i);
      boolean flag = false;
      for(int j=0;j<m.length();j++) {
        if(p==m.charAt(j)) {
          flag = true;
          break;
        }
      }
      if(flag==false) {
        x = x+p;
      }
    }
    for(int k=0;k<m.length();k++) {
      char p = m.charAt(k);
      boolean flag = false;
      for(int l=0;l<n.length();l++) {
        if(p==n.charAt(l)) {
          flag = true;
          break;
        }
      }
      if(flag==false) {
        x = x+p;
      }
    }
    System.out.print(x.toUpperCase());
  }
}
        
           
        
           
          
          
     