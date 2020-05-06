package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Создать программу, которая будет сообщать, является ли целое
* число, введенное пользователем, чётным или нечётным, простым
* или составным.  Если пользователь введёт не целое число,
* то сообщать ему об ошибке.
* */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            StringBuilder result = new StringBuilder();
            long number = scanner.nextLong();
            result.append("Число").append(" ").append(number).append(" - ");
            if (number % 2 == 0) {
                result.append("четное");
            } else {
                result.append("нечетное");
            }
            result.append(" ");
            if (isSimple(number)) {
                result.append("простое");
            } else {
                result.append("составное");
            }
            System.out.println(result.toString());
        } catch (InputMismatchException e) {
            System.out.println("Введено неправильное значение!");
        }
    }

    public static boolean isSimple(long number) {
        int counter = 0;

        if (number % 2 != 0 || number % 5 != 0) {
            for (int j = 1; j <= number; j++) {
                if (number % j == 0) {
                    counter++;
                } else if (counter > 2) {
                    break;
                }
            }
        }
        return counter == 2;
    }
}
