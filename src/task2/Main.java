package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            StringBuilder result = new StringBuilder();
            long number1 = scanner.nextInt();
            long number2 = scanner.nextInt();
            result.append("НОК чисел ").append(number1).append(" и ").append(number2).append(" = ");
            result.append(nok(number1, number2));
            result.append('\n');
            result.append("НОД чисел ").append(number1).append(" и ").append(number2).append(" = ");
            result.append(nod(number1, number2));

            System.out.println(result.toString());
        } catch (InputMismatchException e) {
            System.out.println("Введено неправильное значение!");
        }
    }

    static long nod(long num1, long num2) {
        return num2 == 0 ? num1 : nod(num2, num1 % num2);
    }

    static long nok(long num1, long num2) {
        return num1 / nod(num1, num2) * num2;
    }
}
