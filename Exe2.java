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
        Exe2 car1 = new Exe2("Honda CR-V", "2024", "Honda", 300000);
        Exe2 car2 = new Exe2("Toyota Corolla", "2023", "Toyota", 250000);
        Exe2 car3 = new Exe2("Ford Mustang", "2022", "Ford", 500000);
        Double average = (car1.price + car2.price + car3.price) / 3;
        System.out.println("The average price of the cars is: " + average);
    }


    
}
