// Task 5
import java.util.Scanner;
import java.util.Arrays;
public class Task5 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int index = 0;
    boolean flag = false;
    int [] arr = new int [N];
    for(int i=0;i<arr.length;i++) {
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      arr[i] = num;
    }
    int x =sc.nextInt();
    for(int i=0;i<arr.length;i++) {
      if(arr[i]==x) {
        index = i;
        flag = true;
        break;
      }
      else {
       flag = false;
      }
    }
    if(flag==true) {
      System.out.print(x + " is at " + index);
    }
    else {
      System.out.print("Element not found");
    }
  }
}

    
    
  