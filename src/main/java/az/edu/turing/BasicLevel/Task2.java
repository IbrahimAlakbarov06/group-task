package az.edu.turing.BasicLevel;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (str.indexOf(currentChar) == i) {
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == currentChar) {
                        count++;
                    }
                }
                System.out.println(currentChar + ": " + count);
            }
        }
    }
}
