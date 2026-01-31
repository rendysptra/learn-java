public class Car {

    String brand = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 150000;
    boolean isRunning;
    
    void start(){
        isRunning = true;
        System.out.printf("You start the engine of your %s\n", model);
    }
    
    void stop(){
        isRunning = false;
        System.out.printf("You stop the engine of your %s\n", model);
    }

    void drive(){
        System.out.printf("You drive the %s\n", model);
    }

    void brake(){
        System.out.printf("You brake the %s\n", model);
    }
    
}
