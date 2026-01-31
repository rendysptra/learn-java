public class App {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student("John Marston", 30, 3.8);
        Student student2 = new Student("Jack Marston", 20, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        student1.study();
        student2.study();
        
    }
}
