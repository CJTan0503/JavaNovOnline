public class Car {
    private int carManufactures;
    private int carPrice;
    private String carName;

    public Car (int carManufactures, int carPrice, String carName) {
        this.carManufactures = carManufactures;
        this.carPrice = carPrice;
        this.carName = carName;
    }

    public void mulPriceYears() {
        int answer = carPrice * carManufactures;
        System.out.println("The multiplication of price and manufactured year of " + carName + " is: " + answer);
    }

    public static void main(String[] args) {
        Car car = new Car(2024, 300000, "Honda CR-V");
        car.mulPriceYears();
    }

    
}
