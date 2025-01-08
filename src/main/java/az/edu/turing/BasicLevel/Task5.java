package az.edu.turing.BasicLevel;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");

        int sum = 0;
        int count = inputNumbers.length;

        for (String num : inputNumbers) {
            sum += Integer.parseInt(num);
        }
        double mean = (double) sum / count;
        System.out.println("Average: " + mean + ", Count: " + count);
    }
}
