public class Car {
    private String brand;
    private String model;

    // Конструктор класу Car
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Геттери і сеттери
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
