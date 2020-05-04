package task6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private double maxWeight;
    private double maxCost;
    private List<Item> bestItems = null;

    public Backpack(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void createAllCombinations(List<Item> items) {
        if (items.size() > 0) {
            setBestSet(items);
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> list = new ArrayList<>(items);
            list.remove(i);
            createAllCombinations(list);
        }
    }

    private void setBestSet(List<Item> items) {
        if (bestItems == null) {
            if (calcWeight(items) <= maxWeight) {
                bestItems = items;
                maxCost = calcTotal(items);
            }
        } else {
            if (calcWeight(items) <= maxWeight && calcTotal(items) > maxCost) {
                bestItems = items;
                maxCost = calcTotal(items);
            }
        }
    }

    private double calcTotal(List<Item> items) {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    private double calcWeight(List<Item> items) {
        return items.stream().mapToDouble(Item::getWeight).sum();
    }

    public List<Item> getBestItems() {
        return bestItems;
    }
}
