import java.util.Scanner;

public class TextQuestChain{

    private final Question currentQuestion;
    private Scanner scanner = new Scanner(System.in);

    private TextQuestChain nextChain;

    public TextQuestChain(Question currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    private void setNextChain(TextQuestChain nextChain){
        this.nextChain = nextChain;
    }

    public void init(){
        currentQuestion.print();
        Answer[] answers = currentQuestion.getAnswers();
        for (Answer curAnswer: answers){
            System.out.println(curAnswer.getAnswer());
        }
        String answer = scanner.nextLine().toLowerCase();
        for (Answer curAnswer: answers){
            if (curAnswer.getAnswer().toLowerCase().equals(answer)){
                if (curAnswer.getAnswer() == null){
                    System.out.println("End of the game!");
                    break;
                }
                Question nextQuestion = curAnswer.getNextQuestion();
                setNextChain(new TextQuestChain(nextQuestion));
                nextChain.init();
            }
        }
    }
}
