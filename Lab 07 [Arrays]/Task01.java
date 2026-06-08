// Task 1(a,b);
import java.util.Scanner;
import java.util.Arrays;
public class Task1 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] arr = new int [N];
    for(int i=0;i<arr.length;i++) {
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      arr[i] = num; 
    } 
    System.out.println("The elements of the array are: ");
    for(int i=0;i<arr.length;i++) {
      System.out.println(i + ": " + arr[i]);
    }
    int x = sc.nextInt();
    System.out.println("After resizing the array: ");
    int [] arr2 = new int [N+1];
    for(int i=0;i<arr.length;i++) {
      arr2[i] = arr[i];
    }
    arr2[N] = x;
    for(int i=0;i<arr2.length;i++) {
      System.out.print(arr2[i] + " ");
    }
  }
}
