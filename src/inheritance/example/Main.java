package inheritance.example;

public class Main {

    public static void main(String[] args) {


        System.out.println("**** Parent Vehicle class ****");
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();
        vehicle.fuel();

        System.out.println("**** Child AirVehicle class ****");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.start();
        airVehicle.stop();
        airVehicle.fuel();
        airVehicle.travel();

        System.out.println("**** Chile RoadVehicle class ****");
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.start();
        roadVehicle.stop();
        roadVehicle.fuel();
        roadVehicle.travel();

        System.out.println("**** Child WaterVehicle class ****");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.start();
        waterVehicle.stop();
        waterVehicle.fuel();
        waterVehicle.travel();



    }
}
