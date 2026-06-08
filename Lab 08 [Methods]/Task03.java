// Task 3
public class Task3 {
  public static void main(String [] args) {
    boolean res = isTriangle(7,5,10);
    System.out.println(res);
    triArea(7,5,10);
  }
  // A
  public static boolean isTriangle(int x,int y, int z) {
    if(x+y>z && y+z>x && z+x>y) {
      return true;
    }
    else {
      return false;
    }
  }
  // B
  public static void triArea(int x, int y, int z) {
    if(isTriangle(x,y,z)==true) {
      double s = (x+y+z)/2;
      double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
      System.out.println(area);
    }
    else {
      System.out.println("Can’t form triangle");
    }
  }
}
      

      