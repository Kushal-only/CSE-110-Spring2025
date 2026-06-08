public class Task15 {
  public static void main(String [] args) {
    int a = 12;
    int b = 8;
// approach a
    int c = 0;
    c=a;
    a=b;
    b=c;
    System.out.println(a);
    System.out.println(b);
//approach b
    a = 12;
    b = 8;
    a = a+b;
    b = a-b;
    a = a-b;
    System.out.println(a);
    System.out.println(b);
  }
}