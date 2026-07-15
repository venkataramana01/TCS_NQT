//public class V1 extends Vehical{
//    public static void main(String[] args){
//        start();
////        stop();
//        Vehical vehicle = new Vehical();
//        vehicle.stop();
//    }
//}
public class V1 extends Vehicle{
    @Override
    void start(){
        System.out.println("V1 start");
    }
    @Override
    void accelerate(){
        System.out.println("V1 accelerate");
    }
    @Override
    void stop(){
        System.out.println("V1 stop");
    }
    public static void main(String[] args){
        V1 obj = new V1();
        obj.start();
        obj.accelerate();
        obj.stop();
    }
}