import java.util.Scanner;

public class Exe2 {
    private String carName;
    private String model;
    private String make;
    private double price;

    public Exe2(String carName, String model, String make, double price) {
        this.carName = carName;
        this.model = model;
        this.make = make;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of cars: ");
        int n = scan.nextInt();
        double total = 0;
        double average = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the car name: ");
            String carName = scan.next();
            System.out.print("Enter the model: ");
            String model = scan.next();
            System.out.print("Enter the make: ");
            String make = scan.next();
            System.out.print("Enter the price: ");
            double price = scan.nextDouble();
            Exe2 car = new Exe2(carName, model, make, price);
            total += price;
        }
        average = total / n;
        System.out.println("The average price of the cars is: RM " + average);
    }


    
}
