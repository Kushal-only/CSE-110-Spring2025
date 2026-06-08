// Task 8
import java.util.Scanner;
import java.util.Arrays;
public class Task8 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the length of array 1: ");
    int N = sc.nextInt();
    int count = 0;
    int [] arr = new int [N];
    for(int i=0;i<arr.length;i++) {
      System.out.println("Please enter the elements of the arr1:");
      int num = sc.nextInt();
      arr[i] = num; 
    }
    System.out.println("Please enter the length of array 2: ");
    int M = sc.nextInt();
    int [] arr2 = new int [M];
    for(int i=0;i<arr2.length;i++) {
      System.out.println("Please enter the elements of the arr2: ");
      int num2 = sc.nextInt();
      arr2[i] = num2; 
    } 
    for(int i=0;i<arr.length;i++) {
      for(int j=0;j<arr2.length;j++) {
        if(arr[i]==arr2[j]) {
          count++;
        }
      }
    }
    if(count == M) {
      System.out.print("Array 2 is a subset of Array 1");
    }
    else {
      System.out.print("Array 2 is not a subset of Array 1");
    }
  }
}