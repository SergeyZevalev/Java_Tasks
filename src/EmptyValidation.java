public class EmptyValidation extends Validation implements ValidationAPI{

    private final String password;

    public EmptyValidation(String password) {
        this.password = password;
    }

    @Override
    public boolean validate() {
        return !(password.isEmpty());
    }
}
