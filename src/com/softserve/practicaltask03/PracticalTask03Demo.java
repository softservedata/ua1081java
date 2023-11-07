package com.softserve.practicaltask03;

import com.softserve.practicaltask03.practask01.PracticalTask01;
import com.softserve.practicaltask03.practask02.PracticalTask02;
import com.softserve.practicaltask03.practask03.PracticalTask03;
import com.softserve.practicaltask03.practask04.Product;

public class PracticalTask03Demo {
    public static void main(String[] args) {
//        Task 01 Enter three numbers from the console. Determine and output the result of how many of them are odd. Output the
//        result to the console.

        PracticalTask01.findNumberOfOddNumbers();

//        Task 02 Enter the number of the day of the week from the console. Output the name of the day of the week in two languages.
//        Output the result to the console.

        PracticalTask02.displayNameOfDayOfWeek();

//        Task 03 . Declare an enum with the names of continents (e.g., Europe, Asia, Africa, etc.). Ask the user to enter the name of the
//        country from the console. Using a switch statement, determine the continent to which the entered country belongs and
//        output the name of the continent. Output the result to the console.

        PracticalTask03.findContinentByCountry();

//        Task 04 * Create class called Product that has the following fields:
//          • String name, double price and int quantity.
//              In main() method create four instances of type Product:
//          • Output the name and quantity of the most expensive item;
//          • Output the name of the items, which has the biggest quantity.

        Product product1 = new Product("Tomato", 55.6, 6);
        Product product2 = new Product("Banana", 66.5, 10);
        Product product3 = new Product("Apple", 22.2, 5);
        Product product4 = new Product("Kiwi", 11.5, 15);
        Product.displayMostExpensiveItem(product1, product2, product3, product4);
        Product.displayNamesItemsByBiggestQuantity(product1, product2, product3, product4);
    }
}
