import java.util.Scanner;
import java.util.ArrayList;

public class App {
    
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        
        // declare variable
        int option;
        
        do {
            // Welcome message | user choose option
            menu();
            System.out.print("Choose option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option) {
                case 1 -> addStudent();
                case 2 -> showAllStudent();
                case 3 -> findStudent();
                case 4 -> showAverageGrade();
                case 5 -> {
                    System.out.println("Exiting Program!");
                    break;
                }
                default -> System.out.println("Invalid option");
            }
        } while (option != 5);

        // goodbye message
        System.out.println("Thank you for using Student Management System");

        scanner.close();
    }

    static void menu(){
        System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Student");
        System.out.println("2. Show all student");
        System.out.println("3. Find student (by ID)");
        System.out.println("4. Calculate grade average");
        System.out.println("5. Exit");
    }
    
    static void addStudent(){
        String name;
        String major;

        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter student major: ");
        major = scanner.nextLine();
        
        students.add(new Student(name, major, grade()));
        System.out.println("Student successfully added!");
    }

    static void showAllStudent(){
        if (students.isEmpty()) {
            System.out.println("There is no student yet!");
        }
        else{
            for(Student student : students){
                System.out.println(student);
            }
        }
    }
    
    static void findStudent(){

        int findStudentID;
        boolean isFound = false;
        
        System.out.print("Enter Student ID: ");
        findStudentID = scanner.nextInt();
        
        for(Student student : students){
            if (student.getID() == findStudentID) {
                isFound = true;
                System.out.println("Student found: ");
                System.out.printf("Name: %s\n", student.getName());
                System.out.printf("Major: %s\n", student.getMajor());
                System.out.printf("Grade: %.1f\n", student.getGrade());
                break;
            }
        }

        if (!isFound) {
            System.out.println("Student ID not found!");
        }
    }

    static void showAverageGrade(){
        
        double averageGrade = Student.averageGrade();
        
        if (averageGrade == 0) {
            System.out.println("There is no student yet!");
        }
        else{
            System.out.printf("Student average grade: %.1f\n", averageGrade);
        }
    }
    
    static boolean checkGradeInput(double grade){
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade, try again!");
            return false;
        }
        return true;
    }

    static double grade(){
        
        double grade;
        boolean isGradeValid;
        
        do {
            System.out.print("Enter student grade: ");
            grade = scanner.nextDouble();
            scanner.nextLine();
        
            isGradeValid = checkGradeInput(grade);
            
        } while (!isGradeValid);

        return grade;
        
    }
}
