public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Person
        Person person1 = new Person("Іван", 25);
        Person person2 = new Person("Марія", 30);

        // Створення об'єктів класу Car
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Honda", "Civic");

        // Виведення інформації про створені об'єкти
        System.out.println("Персона 1: " + person1.getName() + ", " + person1.getAge() + " років");
        System.out.println("Персона 2: " + person2.getName() + ", " + person2.getAge() + " років");
        System.out.println("Машина 1: " + car1.getBrand() + " " + car1.getModel());
        System.out.println("Машина 2: " + car2.getBrand() + " " + car2.getModel());
    }
}