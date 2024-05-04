public class Car {

    private String brand;
    private String model;

    private static int countOfCars = 0;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        countOfCars++;
    }


    public static int getCountOfCars() {
        return countOfCars;
    }
}
