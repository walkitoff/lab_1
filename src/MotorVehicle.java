
public class MotorVehicle {
    public boolean running;
    public String fuelType;

    public void printStatus(){
        System.out.printf("%12s %B\n", "Running:", this.running);
        System.out.printf("%12s %S\n", "Fuel-type:", this.fuelType);
    }

}
