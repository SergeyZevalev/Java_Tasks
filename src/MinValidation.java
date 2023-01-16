public class MinValidation extends Validation implements ValidationAPI{

    private final String password;
    private final int min = 10;

    public MinValidation(String password) {
        this.password = password;
    }

    @Override
    public boolean validate() {
        return password.length() >= 10;
    }
}
