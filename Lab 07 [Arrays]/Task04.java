// Task 4
import java.util.Scanner;
import java.util.Arrays;
public class Task4 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] arr = new int [N];
    for(int i=0;i<arr.length;i++) {
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      arr[i] = num;
    }
    System.out.println("Original array: " );
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " " );
    }
    System.out.println();
    System.out.println("After modifying: ");
    for(int i=0;i<arr.length;i++) {
      if(arr[i]>0) {
        arr[i] = 1;
      }
      else {
        arr[i] = 0;
      }
    }
     for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
  }
}

    
    