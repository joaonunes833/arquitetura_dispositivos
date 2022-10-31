package aula6.vehicles;

public abstract class Vehicle {
    private int year;
    private String brand;
    private String model;
    private double price;
    private String color;

    public Vehicle(){
        this.year = 0;
        this.brand = "";
        this.model = "";
        this.price = 0.0;
        this.color = "";
    }

    public Vehicle(int year, String brand, String model, double price, String color){
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "aula6.vehicles.Vehicle :to {" +
                "year=" + this.year +
                ", brand='" + this.brand + '\'' +
                ", model='" + this.model + '\'' +
                ", price=" + this.price +
                ", color='" + this.color + '\'' +
                '}';
    }

    public abstract void drive();
}

