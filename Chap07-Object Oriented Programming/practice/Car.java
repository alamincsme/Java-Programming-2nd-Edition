package chap07;

public class Car {
    private final String brand;
    private final String model;
    private final int year;

    private String ower;

    public Car(String brand, String model, int year, String ower) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.ower = ower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getOwer() {
        return ower;
    }
}
