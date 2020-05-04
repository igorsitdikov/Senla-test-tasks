package task6;

public class Item {
    private String name;
    private double weight;
    private double price;

    public Item(final String name, final double weight, final double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{ " +
               "name: '" + name + '\'' +
               ", weight: " + weight +
               ", price: " + price +
               " }";
    }
}
