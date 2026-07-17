abstract class Vehicle {
    private String brand;
    private int model;
    private int price;
    Vehicle(String brand, int model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand() {
        return this.brand;
    }
    public int getModel() {
        return this.model;
    }
    public int getPrice() {
        return this.price;
    }
    void display(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }
    abstract void start();
    abstract void stop();
}
