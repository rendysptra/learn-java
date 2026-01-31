public class App {
    public static void main(String[] args) throws Exception {

        Car car = new Car();

        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        System.out.println("========");
        car.start();
        System.out.println(car.isRunning);
                        
    }
}
