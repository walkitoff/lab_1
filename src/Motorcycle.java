

public class Motorcycle extends MotorVehicle{
    /** Sport, Dirt, Cruiser, Enduro */
    public String bodyType;
    public String name;

    Motorcycle(boolean running, String fuelType, String bodyType, String name){
        this.running = running;
        this.fuelType = fuelType;
        this.bodyType = bodyType;
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
        System.out.printf("%12s %s\n", "Motorcycle:", this.name);
        super.printStatus();
        System.out.printf("%12s %S\n", "Body-type:", this.bodyType);
    }
}
