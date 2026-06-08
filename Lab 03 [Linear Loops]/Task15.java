import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int digits = 0;

       
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        
        int divisor = 1;
        for (int i = 1; i < digits; i++) {
            divisor *= 10;
        }


        while (divisor > 0) {
            int digit = n / divisor;
            System.out.print(digit);

            n = n % divisor;
            divisor /= 10;

            if (divisor > 0) {
                System.out.print(",");
            }
        }

       
    }
}