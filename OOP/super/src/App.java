public class App {
    public static void main(String[] args) throws Exception {

        Student student = new Student("Spongebob", "Squarepants", 3.88);
        Employee employee = new Employee("Sandy", "Cheeks", 10000);

        student.showName();
        employee.showName();

        student.showGPA();
        employee.showSalary();
        
    }
}
