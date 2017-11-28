import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        String character;
        double result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the expression: ");
        firstNumber = sc.nextDouble();
        character = sc.next();
        secondNumber = sc.nextDouble();

        if (character.charAt(0) == '+') {
            result = MathematicalOperations.addition(firstNumber, secondNumber);

        } else if (character.charAt(0) == '-') {
            result = MathematicalOperations.subtraction(firstNumber, secondNumber);

        } else if (character.charAt(0) == '*') {
            result = MathematicalOperations.multiplication(firstNumber, secondNumber);

        } else if (character.charAt(0) == '/') {
            result = MathematicalOperations.division(firstNumber, secondNumber);
        }
        if (result == 42) {
            System.out.print("'Life, the Universe and Everything'");
        } else {
            System.out.printf("%.4f", result);
        }
    }
}

