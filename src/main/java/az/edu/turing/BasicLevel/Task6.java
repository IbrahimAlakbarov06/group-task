package az.edu.turing.BasicLevel;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double power = Math.pow(a, b);

        double division = (double) a / b;
        System.out.printf("Power: %.2f, Division: %.2f%n", power, division);

    }
}
