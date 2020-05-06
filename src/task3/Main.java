package task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
* Создать программу, которая будет:
* подсчитывать количество слов в предложении
* выводить их в отсортированном виде
* делать первую букву каждого слова заглавной.
* Предложение вводится вручную. (Разделитель пробел (“ ”)).
* */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] text = scanner.nextLine().split(" ");
            System.out.println("Количество слов в предложении : " + text.length);
            Arrays.stream(text)
                .sorted(Comparator.comparing(String::toLowerCase))
                .map((word) -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .forEach(System.out::println);
        } catch (InputMismatchException e) {
            System.out.println("Введено неправильное значение!");
        }
    }
}
