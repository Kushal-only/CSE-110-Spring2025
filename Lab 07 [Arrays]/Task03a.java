// Task 3(a)
import java.util.Scanner;
import java.util.Arrays;
public class Task3a {
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
    int [] arr2 = new int [N];
    System.out.println("Reversed using a new array: ");
    for(int i=arr.length-1;i>=0;i--) {
      arr2[i] = arr[i];
      System.out.print(arr2[i] + " ");
    }
  }
}
      
   