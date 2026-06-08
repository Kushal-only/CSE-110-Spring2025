// Task8
import java.util.Scanner;
public class Task8 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Start: ");
    int start = sc.nextInt();
    System.out.print("End: ");
    int end = sc.nextInt();  
    int r;
    System.out.println("Armstrong numbers: ");
    for(int i = start; i<=end; i++)
    {
       int sum = 0;
       int temp = i;
        while(temp!=0){
        r=temp%10;
        sum=sum+(r*r*r);
        temp=temp/10;
      }
      if(i==sum){
        System.out.println(i);        
      }
    }
  }
}



      
      
      
    
    