// Task 7 
public class Task7 {
  public static void main(String [] args) {
    int arr [] = {5,6,2,1,8,7} ;
    int index = 2;
    print_element(arr,index);
  }
  public static void print_element(int b [], int indx) {
    if(indx==b.length) {
      return;
    }
    else {
      System.out.println(b[indx]);
      print_element(b,indx+1);
    }
  }
}