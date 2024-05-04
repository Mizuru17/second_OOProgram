public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");

        int count = Car.getCountOfCars();
        System.out.println("Кількість створених автомобілів: " + count);
    }
}
