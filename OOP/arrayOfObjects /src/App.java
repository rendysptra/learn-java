public class App {
    public static void main(String[] args) throws Exception {

        // Car car1 = new Car("Mustang",  "Red");
        // Car car2 =  new Car("Corvette", "Blue");
        // Car car3 = new Car("Charger", "Black");

        Car[] cars = {
            new Car("Mustang", "Red"),
            new Car("Corvette", "Blue"),
            new Car("Charger", "Black")
        };

        for(Car car : cars){
            car.color = "Black";
        }

        for(Car car : cars){
            System.out.println(car.color + " " + car.model);
        }
        
    }
}
