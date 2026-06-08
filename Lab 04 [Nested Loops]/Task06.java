// Task6
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxNumber = 0;
        int minNumber = 999999;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
          int num = scanner.nextInt();
          if (num > 0 && num % 2 == 0) {
            sum = sum+num;
            if (num > maxNumber) {
              maxNumber = num;
            }
            if(num<minNumber){
              minNumber = num;
            }
            count++;
            }
        }
        double averageNumber = sum / count;
        System.out.println("Max: " + maxNumber);
        System.out.println("Min: " + minNumber);
        System.out.println("Average: " + averageNumber);
    }
}

