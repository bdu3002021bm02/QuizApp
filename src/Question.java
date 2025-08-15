import java.util.List;

class Question {
    String questionText;
    List<String> options;
    int correctOption; // index (1-based)

    public Question(String questionText, List<String> options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
}
