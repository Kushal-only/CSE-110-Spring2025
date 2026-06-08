// Task 9
import java.util.Scanner;
import java.util.Arrays;
public class Task9 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] arr = new int [N];
    for(int i=0;i<arr.length;i++) {
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      arr[i] = num;
    }
    System.out.println("Original Array: ");
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
    for(int i=0;i<arr.length-1;i++) {
      int index = i;
      for(int j=i+1;j<arr.length;j++) {
        if(arr[j]>arr[index]) {
        index = j;
      }
    }
    int temp = arr[index];
    arr[index] = arr[i];
    arr[i] = temp;
    }
    System.out.println();
    System.out.println("Sorted Array: ");
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
  

    