//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create list of questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
                "Which language is used for Android app development?",
                Arrays.asList("Java", "Python", "C++", "Ruby"),
                1
        ));
        questions.add(new Question(
                "Which company developed Java?",
                Arrays.asList("Microsoft", "Oracle", "Google", "Apple"),
                2
        ));
        questions.add(new Question(
                "What is the size of int in Java?",
                Arrays.asList("2 bytes", "4 bytes", "8 bytes", "Depends on OS"),
                2
        ));

        int score = 0;

        // Step 2: Ask questions
        for (Question q : questions) {
            System.out.println("\n" + q.questionText);
            for (int i = 0; i < q.options.size(); i++) {
                System.out.println((i + 1) + ". " + q.options.get(i));
            }

            System.out.print("Enter your answer (1-" + q.options.size() + "): ");
            int answer = sc.nextInt();

            // Step 3: Check answer
            if (answer == q.correctOption) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer is: " + q.correctOption + ". " + q.options.get(q.correctOption - 1));
            }
        }

        // Step 4: Show final score
        System.out.println("\n Your final score: " + score + " / " + questions.size());
        sc.close();
    }
}
