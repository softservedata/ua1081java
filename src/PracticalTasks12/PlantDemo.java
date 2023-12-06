package PracticalTasks12;

public class PlantDemo {
    public static void main(String[] args) throws ColorException, TypeException {
        try {
            Plant[] plants = {
                    new Plant(25, Plant.Color.PINK, Plant.Type.FLOWERS),
                    new Plant(95, Plant.Color.GREEN, Plant.Type.TREES),
                    new Plant(45, Plant.Color.YELLOW, Plant.Type.BUSHES),
                    new Plant(45, Plant.Color.RED, Plant.Type.FLOWERS),
                    new Plant(38, Plant.Color.GREEN, Plant.Type.BUSHES),
            };
            for (Plant plant : plants) {
                System.out.println(plant);
            }
            try {
                Plant invalidColor = new Plant(40, Plant.Color.valueOf("BLACK"), Plant.Type.BUSHES);
            } catch (ColorException e) {
                System.out.println(e.getMessage());
            }
            try {
                Plant invalidType = new Plant(96, Plant.Color.GREEN, Plant.Type.valueOf("STRAW"));
            } catch (TypeException e) {
                System.out.println(e.getMessage());
            }
            try {
                Plant invalidSize = new Plant(140, Plant.Color.YELLOW, Plant.Type.FLOWERS);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Caught else Exception " + e.getMessage());
        }
    }
}
