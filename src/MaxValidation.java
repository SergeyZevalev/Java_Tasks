public class MaxValidation extends Validation implements ValidationAPI{

    private final String password;
    private final int max = 20;

    public MaxValidation(String password) {
        this.password = password;
    }

    @Override
    public boolean validate() {
        return password.length() <= 20;
    }
}
