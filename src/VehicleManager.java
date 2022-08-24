import java.util.Scanner;


public class VehicleManager {
    Car[] carArr = new Car[3];
    Motorcycle[] motorcycleArr = new Motorcycle[3];


    public void run() {
        Scanner sc = new Scanner(System.in);
        int choice;
        Car hondaCivic = new Car(false, "gas", false, "Honda Civic");
        Car teslaRoadster = new Car(false, "electric", true, "Testla Roadster");
        Car toyotaPrius = new Car(false, "hybrid", false, "Toyota Prius");

        Motorcycle yamahaR1 = new Motorcycle(false, "gas", "sport", "Yamaha R1");
        Motorcycle zeroFX = new Motorcycle(false, "electric", "enduro", "Zero FX");
        Motorcycle hondaRebel = new Motorcycle(false, "gas", "cruiser", "Honda Rebel");

        carArr[0] = hondaCivic;
        carArr[1] = teslaRoadster;
        carArr[2] = toyotaPrius;

        motorcycleArr[0] = yamahaR1;
        motorcycleArr[1] = zeroFX;
        motorcycleArr[2] = hondaRebel;

        //start vehicles
        System.out.println("\nChoose a Car to START:");
        promptCar();
        choice = sc.nextInt();
        carArr[choice - 1].start();

        System.out.println("\nChoose a Motorcycle to START:");
        promptMotorcycle();
        choice = sc.nextInt();
        motorcycleArr[choice - 1].start();

        //stop vehicles
        System.out.println("\nChoose a Car to STOP:");
        promptCar();
        choice = sc.nextInt();
        carArr[choice - 1].stop();

        System.out.println("\nChoose a Motorcycle to STOP:");
        promptMotorcycle();
        choice = sc.nextInt();
        motorcycleArr[choice - 1].stop();

        //display running or not
        System.out.println();
        printRunning();

    }

    public void printRunning(){
        System.out.println("\n-------------------------------");
        System.out.println("       Vehicle Status");
        System.out.println("-------------------------------");
        for(int i = 0; i < carArr.length; i ++){
            System.out.printf("%-15s Running: %B\n", carArr[i].name, carArr[i].running );
        }
        System.out.println();
        for(int i = 0; i < motorcycleArr.length; i ++){
            System.out.printf("%-15s Running: %B\n", motorcycleArr[i].name, motorcycleArr[i].running );
        }
        System.out.println("-------------------------------");
    }

    private void promptCar(){
        System.out.println("----------------------");
        for(int i = 0; i < carArr.length; i++){
            System.out.printf("%d.  %s\n", i + 1, carArr[i].name);
        }
        System.out.println("----------------------");
    }

    private void promptMotorcycle(){
        System.out.println("-----------------------------");
        for(int i = 0; i < motorcycleArr.length; i++){
            System.out.printf("%d.  %s\n", i + 1, motorcycleArr[i].name);
        }
        System.out.println("-----------------------------");
    }


}
