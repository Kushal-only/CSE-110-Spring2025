// Task7
import java.util.Scanner;
public class Task7 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    while(true){
    System.out.print("Enter Number: ");
    int n = sc.nextInt();
    i++;
    if(n<0){
      break;
    }
    System.out.println(n + "^2 = " + n*n);
    }
  }
}