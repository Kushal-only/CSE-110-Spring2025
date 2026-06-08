import java.util.Scanner;
public class Task12 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      System.out.print(i);
    }
    for(int j=n-1;j>=1;j--){
      System.out.print(j);
    }
  }
}
        