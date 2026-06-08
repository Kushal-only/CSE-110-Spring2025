// Task 10
import java.util.Scanner;
import java.util.Arrays;
public class Task10 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Length of Array: ");
    int N = sc.nextInt();
    int [] arr = new int [N];
    String[] names= new String[N];
    for(int i=0;i<arr.length;i++) {
      System.out.print("Enter a number: ");
      int num = sc.nextInt();
      arr[i] = num;
    }
    for(int i = 0; i<names.length; i++){
      System.out.print("Enter a String: ");
      names[i] = sc.next(); 
    }
    for(int i=0;i<arr.length-1;i++) {
      for(int j=0;j<arr.length-i-1;j++) {
          if(arr[j]>arr[j+1]){
          int temp = arr[j];
          String temp2 = names[j];
          arr[j] = arr[j+1];
          names[j] = names[j+1];
          arr[j+1] = temp;
          names[j+1]=temp2;
          }
      }
    }
     System.out.println();
     System.out.println("Sorted Array: ");
     for(int i=0;i<arr.length;i++) {
       System.out.print(arr[i] + " ");
       }
     System.out.println();
     for(int i=0;i<arr.length;i++) {
     System.out.print(names[i]+" ");
     }
     
  }
}

   
          
        
        
         