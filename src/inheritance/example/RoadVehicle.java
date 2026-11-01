package inheritance.example;

public class RoadVehicle extends Vehicle {

    public void travel() {
        System.out.println("RoadVehicle travel on Road");
    }

    @Override
    public void start() {
        System.out.println("Road vehicle started");
    }
    @Override
    public void stop() {
        System.out.println("Road vehicle stopped");
    }
    @Override
    public void fuel() {
        System.out.println("Road vehicle fueled");
    }
}
