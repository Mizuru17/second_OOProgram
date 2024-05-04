public class Car {
    private String brand; // Зазначено модифікатор private тому, що ці дані також вважаються конфіденційними для класу
    private String model; //Зазначено модифікатор private тому, що ці дані також вважаються конфіденційними для класу

    public Car(String brand, String model) { //Зазначено модифікатор public тому, що вони призначені для отримання та встановлення значень полів brand та model і можуть бути використані з будь-якого місця програми.
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() { //Зазначено модифікатор public тому, що вони призначені для отримання та встановлення значень полів brand та можуть бути використані з будь-якого місця програми.
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() { //Зазначено модифікатор public тому, що вони призначені для отримання та встановлення значень полів model та можуть бути використані з будь-якого місця програми.
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
