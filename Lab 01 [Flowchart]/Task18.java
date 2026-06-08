// Task18
public class Task18 {
  public static void main(String [] args) {
    int studentId = 1000054865;
        int lastTwoDigits= studentId%100;
        int lastDigit = lastTwoDigits%10;
        int secondLastDigit = (lastTwoDigits/10);
        System.out.print(lastDigit);
        System.out.println(secondLastDigit);
  }
}