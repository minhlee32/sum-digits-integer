import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println(sumDigits(a));
    }
    public static int sumDigits(int a) {
        int sum = 0;
        while (a > 10) {
            sum += a % 10;
            a = a / 10;
        }
        sum +=a;
        return sum;
        }
    }
