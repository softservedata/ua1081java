package PracticalTasks6.Practical2;

public class CarsInfo {
    public static void main(String[] args) {
        Car[] cars = new Car[6];
        cars[0] = new Truck("Renault", 92, 2015, 20500);
        cars[1] = new Truck("Volvo", 96, 2019, 21500);
        cars[2] = new Truck("Iveco", 90, 2020, 22000);
        cars[3] = new Sedan("BMW", 240, 2021, 5);
        cars[4] = new Sedan("Audi", 255, 2022, 7);
        cars[5] = new Sedan("Tesla", 190, 2023, 5);

        System.out.println("Information about cars:");
        for (Car car : cars) {
            System.out.println("\n\tModel: " + car.getModel());
            System.out.println("\tMax Speed: " + car.getMaxSpeed());
            System.out.println("\tYear of production: " + car.getYearOfProduction());
            if (car instanceof Truck) {
                System.out.println("\tCargo capacity: " + ((Truck) car).getCargoCapacity());
            } else if (car instanceof Sedan) {
                System.out.println("\tNumber of seats: " + ((Sedan) car).getNumberOfSeats());
            }
            car.run();
            car.stop();
            System.out.println();
        }
    }
}
