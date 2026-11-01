package inheritance.example;

public class AirVehicle extends Vehicle {

    public void travel() {

        super.color = "red";
        System.out.println("Color is : " + super.color );
        System.out.println("Air vehicle travel on Air");
    }


    @Override
    public void start() {
        super.start();
        System.out.println("Air vehicle started");
    }
    @Override
    public void stop() {
        System.out.println("Air vehicle stopped");
    }
    @Override
    public void fuel() {
        System.out.println("Air vehicle fueled");
    }

}
