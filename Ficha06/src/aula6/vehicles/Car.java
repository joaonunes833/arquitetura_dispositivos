package aula6.vehicles;

public class Car extends Vehicle{

    private int doors;

    public Car() {
        super();
    }

    public Car(int year, String brand, String model, double price, String color, int doors) {
        super(year, brand, model, price, color);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "aula6.vehicles.Car: " + super.toString() + " Doors: " + this.getDoors();
    }

    @Override
    public void drive() {
        System.out.println("Driving the car.");
    }
}
