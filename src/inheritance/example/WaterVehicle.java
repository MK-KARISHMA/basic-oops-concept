package inheritance.example;

public class WaterVehicle extends Vehicle {

    public void travel() {
        System.out.println("WaterVehicle travel on Water");
    }

    @Override
    public void start() {
        System.out.println("Water vehicle started");
    }
    @Override
    public void stop() {
        System.out.println("Water vehicle stopped");
    }
    @Override
    public void fuel() {
        System.out.println("Water vehicle fueled");
    }

}
