import java.util.Scanner;
public class Task13 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=i;j<n;j++){
        System.out.print(" ");
      }
      for(int k=1;k<i;k++){
        System.out.print(k);
      }
      for(int q=i;q>=1;q--){
        System.out.print(q);
      }
      System.out.println();
    }
  }
}