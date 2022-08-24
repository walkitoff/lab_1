
public class Car extends MotorVehicle{
    public boolean convertible;
    public String name;

    Car(boolean running, String fuelType, boolean convertible, String name){
        this.running = running;
        this.fuelType = fuelType;
        this.convertible = convertible;
        this.name = name;
    }

    public void start(){
        this.running = true;
       printStatus();
    }

    public void stop(){
        this.running = false;
       printStatus();
    }

    @Override
    public void printStatus(){
        System.out.printf("%12s %s\n", "Car:", this.name);
        super.printStatus();
        System.out.printf("%12s %S\n", "Convertible:", this.convertible);
    }

}
