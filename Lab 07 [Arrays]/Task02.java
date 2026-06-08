// Task 2
import java.util.Scanner;
import java.util.Arrays;
public class Task2 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] arr = new int [N];
    for(int i=0;i<arr.length;i++) {
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      arr[i] = num;
    }
    System.out.println("Before removing duplicates:");
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]);
      if(i<arr.length-1) {
        System.out.print(" ");
      }
    }
    for(int i=0;i<arr.length;i++) {
      for(int j=i+1;j<arr.length;j++) {
        if(arr[i] == arr[j]) {
          arr[j] = 0;
          break;
        }
      }
    }
      System.out.println();
      for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i] + " ");
      }
  }
}

    