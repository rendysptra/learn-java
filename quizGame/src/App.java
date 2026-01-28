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
        char[] answerKey = {
            'd',
            'd',
            'c',
            'c',
            'a'
        };
        char chooseAnswer;
        int score = 0;
        boolean isValid = false;

        System.out.println("=========");
        System.out.println("QUIZ GAME");
        System.out.println("=========");


        for(int i = 0; i < questions.length; i++){
            isValid = false;
            System.out.println(questions[i]);

            for(int j = 0; j < answers[i].length; j++){
                System.out.println(answers[i][j]);
            }
    
            do {
                System.out.print("Choose your answer: ");
                chooseAnswer = Character.toLowerCase(scanner.next().charAt(0));
                isValid = checkValidOption(chooseAnswer);
            } while (!isValid);

            if (checkAnswer(chooseAnswer, answerKey[i])) {
                score++;
            }

        }

        System.out.printf("Your score is: %d/%d\n", score, questions.length);
        
        scanner.close();
    }

    static boolean checkValidOption(char answer){
        if (answer >= 'a' && answer <= 'd') {
            return true;
        }
        System.out.println("Invalid option, try again!");
        return false;
    }

    static boolean checkAnswer(char answer, char answerKey){
        if (answer == answerKey) {
            System.out.println("=========");
            System.out.println("Correct!");
            System.out.println("=========");
            return true;
        } else{
            System.out.println("=========");
            System.out.println(" Wrong!");
            System.out.println("=========");
            return false;
        }
    }
}
