// Task 7
import java.util.Scanner;
import java.util.Arrays;
public class Task7 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int [] arr = new int [N];
    int [] arr2 = new int [N];
    int count = 0;
    for(int i=0;i<arr.length;i++) {
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      arr[i] = num;
    }
    System.out.println("Input Array: ");
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
    for(int i=0;i<arr.length;i++) {
      boolean flag = false;
      for(int j=0;j<i;j++) {
        if(arr[i]==arr[j]) {
          flag = true;
          break;
        }
      }
      if(flag==false) {
       arr2[count] = arr[i];
       count++;
      }
    }
    System.out.println();
    System.out.println("Sorted Array: ");
    for(int i=0;i<count;i++) {
      System.out.print(arr2[i] + " ");
    }
  }
}

    
 