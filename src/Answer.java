public class Answer {

    private final String answer;
    private final Question nextQuestion;

    public Answer(String answer, Question question) {
        this.answer = answer;
        nextQuestion = question;
    }

    public Question getNextQuestion(){
        return nextQuestion;
    }

    public String getAnswer(){
        return answer;
    }

    public void print(){
        System.out.println(answer);
    }
}
