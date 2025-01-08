package az.edu.turing.Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i =2; i< num;i++){
            if (num%i==0){
                System.out.println(num+" is not prime number");
                return;
            }
            else {
                System.out.println(num+" is prime number");
                return;
            }
        }
    }
}