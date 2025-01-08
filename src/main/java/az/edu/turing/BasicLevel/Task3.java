package az.edu.turing.BasicLevel;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of list: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element of list: ");
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            } else if (arr[i] % 2 == 1) {
                sumOdd += arr[i];
            }
        }
        System.out.println("Sum of odd numbers: " + sumOdd + " Sum of odd numbers: " + sumEven);
    }
}
