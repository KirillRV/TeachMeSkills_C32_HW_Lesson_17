package com.teachmeskills.lesson_17.task1.Runner;
import com.teachmeskills.lesson_17.task1.util.HelperInterface;
import java.util.Scanner;
public class AppRunner {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter 1 to reverse a string or 2 to calculate a factorial: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                HelperInterface<String> reverseString = (input) -> new StringBuilder(input).reverse().toString();
                System.out.print("Enter a string: ");
                String inputString = scanner.next();
                System.out.println("Reversed string: " + reverseString.apply(inputString));
            } else if (choice == 2) {
                HelperInterface<Integer> factorial = (input) -> {
                    int result = 1;
                    for (int i = 1; i <= input; i++) {
                        result *= i;
                    }
                    return result;
                };
                System.out.print("Enter a number: ");
                int inputNumber = scanner.nextInt();
                System.out.println("Factorial of the number: " + factorial.apply(inputNumber));
            } else {
                System.out.println("Invalid input.");
            }

            scanner.close();
    }
}
