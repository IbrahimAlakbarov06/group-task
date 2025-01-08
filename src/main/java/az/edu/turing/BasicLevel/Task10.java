package az.edu.turing.BasicLevel;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int reversed = 0;
        int sum = 0;

        while (num > 0) {
            int temp = num % 10;
            reversed = reversed * 10 + temp;
            num /= 10;
            sum += temp;
        }

        System.out.println("Reveresed: " + reversed + " Sum: " + sum);

    }
}
