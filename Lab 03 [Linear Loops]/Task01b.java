// Task 1 (b)
public class Task1b {
  public static void main(String [] args) {
    for(int i=18;i<=63;i=i+9) {
      if(i==63){
        System.out.print(i*-1);
      }
      else if (i%2!=0) {
        System.out.print(i*-1 + ", ");
      }
      else {
        System.out.print(i + ", ");
      }
    }
  }
}
