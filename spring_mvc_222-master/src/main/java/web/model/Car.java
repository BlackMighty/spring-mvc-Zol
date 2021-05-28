package web.model;

public class Car {
    int wheel;
    String model;
    String color;

    public Car(int wheel, String model, String color) {
        this.wheel = wheel;
        this.model = model;
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
