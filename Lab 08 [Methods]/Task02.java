// Task 2
public class Task2 {
  public static void main(String [] args ) {
    double area = circleArea(5);
    System.out.println(area);
    double volume = sphereVolume(5);
    System.out.println(volume);
    findSpace(10,"circle");
  }
  // A
  public static double circleArea(int r) {
    double area = Math.PI*r*r;
    return area;
  }
  public static double sphereVolume(int r) {
    double volume = 4.0/3*Math.PI*r*r*r;
    return volume;
  }
  // C
  public static void findSpace(int d, String y) {
    if(y.equals("circle")) {
      System.out.println(circleArea(d/2));
    }
    else if(y.equals("sphere")) {
      System.out.println(sphereVolume(d/2));
    }
    else {
      System.out.println("Wrong Parameter");
    }
  }
}
    
    