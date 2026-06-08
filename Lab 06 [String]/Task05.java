// Task 5
import java.util.Scanner;
public class Task5 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    n = n+" ";
    String reverse = "";
    String word = "";
    for(int i=0;i<n.length();i++) {
      char ch = n.charAt(i);
      if(ch!=' ') {
        word = word+ch;
      }
      else {
        reverse = word + " " + reverse;
        word = "";
      }
    }
    System.out.print(reverse);
  }
}
    
  