public class Question {

    private final String question;
    private final Answer[] answers;

    public Question(String question, Answer[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public Answer getAnswer(int index){
        return answers[index];
    }

    public Answer[] getAnswers(){
        return answers;
    }

    public String getQuestion(){
        return question;
    }

    public void print(){
        System.out.println(question);
    }
}
