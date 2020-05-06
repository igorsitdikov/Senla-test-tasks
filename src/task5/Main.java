package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
* Создать программу, которая в последовательности от 0 до N, находит
* все числа-палиндромы (зеркальное значение равно оригинальному).
* Длина последовательности N вводится вручную и не должна превышать 100.
* */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> numbers = new ArrayList<>();
        boolean valid = true;
        while (valid && numbers.size() <= 10) {
            try {
                Long number = Long.parseLong(scanner.nextLine());
                numbers.add(number);
            } catch (Exception e) {
                valid = false;
                System.out.println("Введено неправильное значение!");
            }
        }
        System.out.println("Числа-палиндромы:");
        List<Long> results = numbers.stream()
            .filter(Main::isPalindrome)
            .collect(Collectors.toList());
        results.forEach(System.out::println);
    }

    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    public static boolean isPalindrome(Long number) {
        String s = String.valueOf(number);
        return s.equals(reverse(s));
    }
}
