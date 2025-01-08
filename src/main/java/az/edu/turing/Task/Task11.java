package az.edu.turing.Task;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String original = str.toLowerCase();
        String palindrome = "";

        while (original.length() > 0) {
            char lastChar = original.charAt(original.length() - 1);
            palindrome += lastChar;
            original = original.substring(0, original.length() - 1);
        }

        if (str.toLowerCase().equals(palindrome)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
