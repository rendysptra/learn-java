import java.util.Scanner;

public class App {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        // JAVA QUIZ GAME

        // declare variables
        String[] questions = {
            "1. What does CPU stands for? ",
            "2. Which data structure operates on a Last-in, First-out principle? ",
            "3. What is the binary representation of the decimal number 5? ",
            "4. An operating system primarily manage which of the following? ",
            "5. Which of the following is a high-level programming language? "
        };
        String[][] answers = {
            {"a. Central Program Unit", "b. Control Processing Unit", "c. Computer Process Utility", "d. Central Processing Unit"},
            {"a. Queue", "b. Hash Table", "c. Binary Tree", "d. Stack"},
            {"a. 100", "b. 110", "c. 101", "d. 111"},
            {"a. Only the User Interface", "b. Only Application Installation", "c. Hardware and Software resources", "d. Only Network Connection"},
            {"a. Python", "b. Machine Code", "c. Microcode", "d. Assembly is the Only Correct answer"}
        };
        int chooseAnswer;
        int grade;

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(int j = 0; j < answers[i].length; j++){
                System.out.println(answers[i][j]);
            }
            System.out.println();
            
        }

        // show question

        // input answer

        // process answer (right / wrong)

        // show grade
        
    }
}
