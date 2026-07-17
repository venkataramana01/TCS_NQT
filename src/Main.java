public class Main {
    public static void main(String[] args) {
        Car car=new Car("Maruthi",2026,2500000,"Diesel");
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        car.display();
        car.start();
        car.stop();
        car.service();
    }
}
