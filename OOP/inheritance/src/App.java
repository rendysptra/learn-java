public class App {
    public static void main(String[] args) throws Exception {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(plant.isAlive);
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        plant.photosynthesize();
        dog.eat();
        cat.eat();
        
        dog.speak();
        cat.speak();
        
    }
}
