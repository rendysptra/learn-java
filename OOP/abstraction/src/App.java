public class App {
    public static void main(String[] args) throws Exception {

        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(5, 6);
        Rectangle rectangle = new Rectangle(10, 15);

        System.out.printf("%.2f\n", circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
        
    }
}
