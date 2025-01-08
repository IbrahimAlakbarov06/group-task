package az.edu.turing.Task;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        String[] inputNum = num.split(" ");
        int[] numbers = new int[inputNum.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(inputNum[i]);
        }

        int search = scan.nextInt();

        for (int i =0 ;i< numbers.length; i++){
            if (numbers[i]== search){
                System.out.println(search+" is in the array");
                return;
            }
            else {
                System.out.println(search+ " is not in the array");
                return;
            }
        }
    }
}
