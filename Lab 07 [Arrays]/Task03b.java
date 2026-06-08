// Task 3(b)
import java.util.Scanner;
import java.util.Arrays;
public class Task3b {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int N = sc.nextInt();
    int [] arr = new int [N];
    for(int i=0;i<arr.length;i++) {
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      arr[i] = num;
    }
    System.out.println("Reversed the original array: ");
    for(int i=arr.length-1;i>=0;i--) {
      System.out.print(arr[i] + " ");
    }
  }
}
                       
                       
                       