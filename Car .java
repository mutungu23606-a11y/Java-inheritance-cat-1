// Car.java
class Car extends Vehicle {
    String fuelType;

    // Constructor initializes all fields
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call parent constructor
        this.fuelType = fuelType;
    }

    // Override displayDetails to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails(); // Show brand, model, year
        System.out.println("Fuel Type: " + fuelType);
    }
}
