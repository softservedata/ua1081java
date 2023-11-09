package PracticalTasks4;

public class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public static void main(String[] args) {
        Product product1 = new Product("Milc", 46, 20);
        Product product2 = new Product("Chips", 112, 14);
        Product product3 = new Product("Tea", 13, 35);
        Product product4 = new Product("Rice", 26, 13);

        Product mostExpensive = product1;
        if (product2.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product2;
        }
        if (product3.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product3;
        }

        if (product4.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = product4;
        }
        System.out.println("The most expensive item is " + mostExpensive.getName());
        System.out.println("Price of " + mostExpensive.getName() + " is " + mostExpensive.getPrice());
        System.out.println("Quantity of " + mostExpensive.getName() + " is " + mostExpensive.getQuantity());

        Product biggestQuantity = product1;
        if (product2.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product2;
        }
        if (product3.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product3;
        }
        if (product4.getQuantity() > biggestQuantity.getQuantity()) {
            biggestQuantity = product4;
        }
        System.out.println("The biggest quantity of products is " + biggestQuantity.getName());
        System.out.println("Quantity of " + biggestQuantity.getName() + " is " + biggestQuantity.getQuantity());
    }

}
