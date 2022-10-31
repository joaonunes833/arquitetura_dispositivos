package aula6.vehicles;

public class Motorcycle extends Vehicle{

    public Motorcycle() {
        super();
    }

    public Motorcycle(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
    }


    @Override
    public String toString() {
        return "aula6.vehicles.Motorcycle: " + super.toString();
    }

    @Override
    public void drive() {
        System.out.println("Driving the motorcycle.");
    }
}

