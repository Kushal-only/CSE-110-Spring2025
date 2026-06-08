// Task 1
public class task1 {
  public static void main(String [] args) {
    evenChecker(10);
    boolean result = isEven(10);
    System.out.println(result);
    boolean result2 = isPos(-10);
    System.out.println(result2);
    sequence(10);
  }
  // A
  public static void evenChecker(int num) {
    if(num%2==0) {
      System.out.println("Even!!");
    }
    else { 
      System.out.println("Odd!!");
    }
  }
  // B
  public static boolean isEven(int num) {
     if(num%2==0) {
      return true;
    }
    else { 
      return false;
    }
  }
  // C
  public static boolean isPos(int num) {
     if(num>0) {
      return true;
    }
    else { 
      return false;
    }
  }
  // D
  public static void sequence(int n) {
    if(isPos(n)) {
      for(int i=0;i<=n;i++) {
        if(isEven(i)==true) {
          System.out.print(" " + i);
        }
      }
    }
    else {
      for(int i=n;i<=-1;i++) {
        if(isEven(i)==false) {
          System.out.print(" " + i);
        }
      }
    }
  }
}

      
       