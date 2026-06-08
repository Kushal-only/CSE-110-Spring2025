// Task 6(a,b,c,d)
import java.util.Scanner;
import java.util.Arrays;
public class Task6 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int N = sc.nextInt();
    double [] arr = new double [N];
    for(int i=0;i<arr.length;i++) {
      System.out.println("Enter a number: ");
      double num = sc.nextDouble();
      arr[i] = num;
    }
    double sum = 0;
    double avg = 0;
    for(int i=0;i<arr.length;i++) {
      sum = sum+arr[i];
    }
    double max = arr[0];
    double min = arr[0];
    int max_index = 0;
    int min_index = 0;
    for(int i=1;i<arr.length;i++) {
      if(max<arr[i]) {
        max = arr[i];
        max_index = i;
      }
      if(min>arr[i]) {
        min = arr[i];
        min_index = i;
      }
    }
    avg = sum/arr.length;
    System.out.println("Maximum elemennt " + max + " found at index " + max_index); //a
    System.out.println("Minimum elemennt " + min + " found at index " + min_index); //b
    System.out.println("Summation: " + sum); //c
    System.out.println("Average: " + avg); //d
  }
}
    
   