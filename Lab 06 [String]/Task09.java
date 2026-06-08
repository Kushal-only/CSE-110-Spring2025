// Task 9
import java.util.Scanner;
public class Task9 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;
    if(n.length()>=8){
    for(int i=0;i<n.length();i++) {
      if(n.charAt(i)>='A' && n.charAt(i)<='Z') {
        count1++;
      }
      if(n.charAt(i)>='a' && n.charAt(i)<='z') {
        count2++;
      }
      if(n.charAt(i)>='0' && n.charAt(i)<='9') {
        count3++;
      }
      if(n.charAt(i)=='!' || n.charAt(i)=='@' || n.charAt(i)=='#' || n.charAt(i)=='$' || n.charAt(i)=='%' || n.charAt(i)=='^' || n.charAt(i)=='*' || n.charAt(i)=='_'){
        count4++;
      }
    }
    if(count1>0 && count2>0 && count3>0 && count4>0) {
      System.out.print("True");
    }
    }
    else {
      System.out.print("False");
    }
  }
}
  