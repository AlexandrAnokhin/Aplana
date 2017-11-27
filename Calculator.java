import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        String character;
        double result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = sc.nextDouble();
        System.out.print("Enter the second number: ");
        secondNumber = sc.nextDouble();

        System.out.print("Enter the character of the operation you want to perform with numbers: ");
        character = sc.next();

        if (character.charAt(0) == '+') {
            result = MathematicalOperations.addition(firstNumber, secondNumber);

        } else if (character.charAt(0) == '-') {
            result = MathematicalOperations.subtraction(firstNumber, secondNumber);

        } else if (character.charAt(0) == '*') {
            result = MathematicalOperations.multiplication(firstNumber, secondNumber);

        } else if (character.charAt(0) == '/') {
            result = MathematicalOperations.division(firstNumber, secondNumber);
        }
        System.out.printf("%.4f", result);
    }
}

