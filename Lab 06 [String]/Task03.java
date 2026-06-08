// Task 3
import java.util.Scanner;
public class Task3 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    boolean flag = true ;
    for(int i=0;i<n.length();i++) {
      if(n.charAt(i)==n.charAt(n.length()-1-i)) {
      }
      else{
        flag = false;
      }
    }
    System.out.print(flag);
  }
}
        
    
    