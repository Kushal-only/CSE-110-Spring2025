// Task 6 
import java.util.Scanner;
public class Task6 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    int cons_count = 0;
    int vow_count = 0;
    for(int i=0;i<n.length();i++) {
      if(n.charAt(i)=='a' || n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u' || n.charAt(i)=='A' || n.charAt(i)=='E' || n.charAt(i)=='I' || n.charAt(i)=='O' || n.charAt(i)=='U') {
        vow_count++;
      }
      else {
        cons_count++;
      }
    }
    if(vow_count%3==0 && cons_count%5==0) {
      System.out.println("Aaarr! Me Plunder!!");
    }
    else {
      System.out.println("Blimey! No Plunder!!");
    }
  }
}
        