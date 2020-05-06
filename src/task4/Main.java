package task4;

import java.util.Arrays;
import java.util.Scanner;

/*
* Создать программу, которая подсчитывает сколько раз употребляется
* слово в тексте (без учета регистра).
* Текст и слово вводится вручную.
* */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine().toLowerCase();
        String[] text = scanner.nextLine().split(" ");
        long count = Arrays.stream(text)
            .filter((word) -> word.toLowerCase().equals(keyword.toLowerCase()))
            .count();
        System.out.println("Слово '" + keyword + "' употребляется в тексте " + count + " раз.");
    }

}
