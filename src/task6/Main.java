package task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static final int MAX_WEIGHT = 8;
    static Item[] things = {
        new Item("Презервативы", 1, 16060),
        new Item("Спички", 2, 50),
        new Item("Носки", 4, 1500),
        new Item("Пиво", 4, 16000),
        new Item("Power Bank", 1, 10500),
        new Item("Шашлычки", 1, 16500),
        };

    public static void main(String[] args) {
        Backpack backpack = new Backpack(MAX_WEIGHT);
        List<Item> items = new ArrayList<>(Arrays.asList(things));

        backpack.createAllCombinations(items);
        List<Item> bestItems = backpack.getBestItems();
        if (bestItems == null) {
            System.out.println("Нет решения!");
        } else {
            System.out.println("Список вещей:");
            bestItems.forEach(System.out::println);
        }
    }
}
