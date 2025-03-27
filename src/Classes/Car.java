package Classes;

public class Car {
    // fields
    public String brand = null;
    public String model = null;
    public String color = null;

    // constructor
    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    // methods
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public String carToString() {
        return "brand: " + brand + ", model: " + model + ", color: " + color;
    }
}
