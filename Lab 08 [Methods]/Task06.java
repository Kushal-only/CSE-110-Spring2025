// Task 6
import java.util.Scanner;
public class Task6 {
  public static void main(String [] args) {
    double t = calcTax(20,18000);
    System.out.println(t);
    calcYearlyTax();
  }
  // A
  public static double calcTax(int age, int sal) {
    if(age<18 || sal<10000) {
      return 0.0;
    }
     else if(sal>10000 && sal<20000) {
       double tax = sal*7/100;
        return tax;
      }
      else {
        double tax = sal*14/100;
        return tax;
      }
  }
  // B
  public static void calcYearlyTax() {
    Scanner sc = new Scanner(System.in);
    double total = 0.0;
    int age = sc.nextInt();
    for(int i=1;i<13;i++) {
      int sal = sc.nextInt();
      double tax = calcTax(age,sal);
      System.out.println("Month" + i + " tax: " + tax);
      total = total+tax;
    }
    System.out.print("Total Yearly Tax: " + total);
  }
}
  
    
 
 
