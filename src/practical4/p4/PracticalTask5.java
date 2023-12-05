package practical4.p4;

public class PracticalTask5 {

    public static void main(String[] args) {
        Product product1 = new Product("Milk", 1.5, 10);
        Product product2 = new Product("Bread", 1.0, 17);
        Product product3 = new Product("Coca cola", 1.4, 18);
        Product product4 = new Product("Butter", 1.6, 20);
        Product product5 = new Product("Eggs", 1.7, 20);
        Product mostExpensiveProduct = product1;
        if (product2.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = product2;
        }
        if (product3.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = product3;
        }
        if (product4.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = product4;
        }
        if (product5.getPrice() > mostExpensiveProduct.getPrice()) {
            mostExpensiveProduct = product5;
        }
        System.out.println("The most expensive product is:\n " + mostExpensiveProduct.getName()
        + " with price: " + mostExpensiveProduct.getPrice());
        Product maxQuantityProduct = product1;
        if (maxQuantityProduct.getQuantity() < product2.getQuantity()) {
            maxQuantityProduct = product2;
        }
        if (maxQuantityProduct.getQuantity() < product3.getQuantity()) {
            maxQuantityProduct = product3;
        }
        if (maxQuantityProduct.getQuantity() < product4.getQuantity()) {
            maxQuantityProduct = product4;
        }
        if (maxQuantityProduct.getQuantity() < product5.getQuantity()) {
            maxQuantityProduct = product5;
        }
        System.out.println("The products with max quantity of: "
                + maxQuantityProduct.getQuantity() + " are the following: ");
        if (product1.getQuantity() == maxQuantityProduct.getQuantity()) {
            System.out.println(product1.getName());
        }
        if (product2.getQuantity() == maxQuantityProduct.getQuantity()) {
            System.out.println(product2.getName());
        }
        if (product3.getQuantity() == maxQuantityProduct.getQuantity()) {
            System.out.println(product3.getName());
        }
        if (product4.getQuantity() == maxQuantityProduct.getQuantity()) {
            System.out.println(product4.getName());
        }
        if (product5.getQuantity() == maxQuantityProduct.getQuantity()) {
            System.out.println(product5.getName());
        }
    }
}
