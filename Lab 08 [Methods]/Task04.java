// Task 4
public class Task4 {
  public static void main(String [] args) {
    boolean check = isPrime(7);
    System.out.println(check);
    boolean check2 = isPerfect(6);
    System.out.println(check2);
    int result = special_sum(8);
    System.out.println(result);
  }
  // A
  public static boolean isPrime(int x) {
    int count = 0;
    for(int i=2;i<=x;i++) {
      if(x%i==0) {
        count++;
      }
    }
    if(count<2) {
      return true;
    }
    else {
      return false;
    }
  }
  // B
    public static boolean isPerfect(int x) {
      int sum = 0;
      for(int i=1;i<x;i++) {
        if(x%i==0) {
          sum = sum+i;
        }
      }
      if(sum==x) {
        return true;
      }
      else {
        return false;
      }
    }
    // C
    public static int special_sum(int x) {
      int sum = 0;
      for(int i=2;i<=x;i++) {
        if(isPrime(i)==true) {
          sum += i;
        }
          if(isPerfect(i)==true) {
            sum += i;
          }
      }
      return sum;
    }
}
     
