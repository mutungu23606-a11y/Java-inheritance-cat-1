// Showroom.java
import java.util.Scanner;

public class Showroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for car details
        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Fuel Type: ");
        String fuelType = sc.nextLine();

        // Create Car object
        Car car1 = new Car(brand, model, year, fuelType);

        // Display car details
        System.out.println("\nCar Details:");
        car1.displayDetails();

        sc.close();
    }
}
