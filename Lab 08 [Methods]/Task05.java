// Task 5
public class Task5 {
  public static void main(String [] args) {
    showDots(5);
    System.out.println();
    show_palindrome(5);
    System.out.println();
    showDiamond(5);
  }
  // A
  public static void showDots(int p) {
    for(int i=1;i<=p;i++) {
      System.out.print(".");
    }
  }
  // B
   public static void show_palindrome(int p) {
     for(int i=1;i<=p;i++) {
     System.out.print(i);
     }     
     for(int j=p-1;j>=1;j--) {
       System.out.print(j);
     }
   }
   // C
   public static void showDiamond(int p) {
    for(int i=1;i<=p;i++){
      showDots(p-i);
      show_palindrome(i);
      showDots(p-i);
      System.out.println();
    }
    int q = p-1;
    int r=1;
    for(int i=1;i<p;i++) {
      showDots(r);
      show_palindrome(q);
      showDots(r);
      q--;
      r++;
      System.out.println();      
    }
  }
}
 