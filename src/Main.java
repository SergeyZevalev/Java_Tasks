public class Main {
    public static void main(String[] args) {
        QARep repository = new QARep();
        TextQuestChain chain = new TextQuestChain(repository.getStart());
        chain.init();
    }
}