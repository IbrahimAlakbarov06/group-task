package az.edu.turing.BasicLevel;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int factorial = 1;
        int sum = 0;

        while (num > 0) {
            factorial *= num;
            sum += num;
            num--;
        }
        System.out.println("Factorial: " + factorial + " Sum: " + sum);
    }
}
