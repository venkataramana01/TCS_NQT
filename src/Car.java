public class Car extends Vehicle implements Serviceable{
    String fuelType;
    Car(String brand, int model, int price, String fuelType) {
        super(brand, model, price);
        this.fuelType = fuelType;
    }
    @Override
    public void service() {
        System.out.println("Car Service ");
    }
    @Override
    void start() {
        System.out.println("Car Start ");
    }
    @Override
    void stop() {
        System.out.println("Car Stop ");
    }

}
