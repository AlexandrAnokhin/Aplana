/**
 * @see #addition(double, double)
 * @see #division(double, double)
 * @see #subtraction(double, double)
 * @see #multiplication(double, double)
 */

public class MathematicalOperations {
    //Сложение
    public static double addition(double firstNumber, double secondNumber) {
        System.out.print("The result of addition is ");
        return firstNumber + secondNumber;
    }

    //Вычитание
    public static double subtraction(double firstNumber, double secondNumber) {
        System.out.print("The result of subtraction is ");
        return firstNumber - secondNumber;
    }

    //Умножение
    public static double multiplication(double firstNumber, double secondNumber) {
        System.out.print("The result of multiplication is ");
        return firstNumber * secondNumber;
    }

    //Деление
    public static double division(double firstNumber, double secondNumber) {
        System.out.print("The result of division is ");
        return firstNumber / secondNumber;
    }
}
