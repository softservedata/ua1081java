package practical4.p4;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}