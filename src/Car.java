public class Car {
    String brand="XYZ";
    String color="White";
    String type="Petrol";
    Car(String brand,String color,String type){
        this.brand=brand;
        this.color=color;
        this.type=type;
    }
    Car(){
        System.out.println("Car Constructor");
    }
    void start() {
        System.out.println("Starting Car");
    }
    void stop() {
        System.out.println("Stopping Car");
    }
    public static void main(String[] args) {
//    Car car=new Car();
    Car car1=new Car("Maruthi","Grey","Hybrid");
    car1.start();
    System.out.println(car1.type);
    System.out.println(car1.color);
    car1.stop();

    }
}

