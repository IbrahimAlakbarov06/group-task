package az.edu.turing.BasicLevel;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nums = scan.nextLine();

        String[] inputNumbers = nums.split(" ");
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        Arrays.sort(numbers);
        int largest = numbers[numbers.length - 1];
        int smallest = numbers[0];

        int middle;
        if (numbers.length % 2 == 0) {
            middle = (numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]) / 2;
        }
        else {
            middle = numbers[numbers.length/2];
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Middle: " + middle);


    }
}
