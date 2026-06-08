// Task2
import java.util.Scanner ;
public class Task2 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Score");
    int num = sc.nextInt();
      if (num>=90 && num<=100) {
     System.out.println("Your Grade is A");
    }
     else if (num>=85 && num<=89) {
     System.out.println("Your Grade is A-");
     }
      else if (num>=70 && num<=84) {
     System.out.println("Your Grade is B");
     }
       else if (num>=57 && num<=69) {
     System.out.println("Your Grade is C");
     }
        else if (num>=50 && num<=57) {
     System.out.println("Your Grade is D");
     }
         else if (num<50 ) {
     System.out.println("Your Grade is F");
     } 
         else {
      System.out.println("Invalid Input");
     }           
  }
}