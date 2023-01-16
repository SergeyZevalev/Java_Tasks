public class Numberalidation extends Validation implements ValidationAPI{

    private final String password;

    public Numberalidation(String password) {
        this.password = password;
    }

    @Override
    public boolean validate() {
        boolean result = false;
        char[] sequence = password.toCharArray();
        for (char s: sequence){
            if (Character.isDigit(s)){
                result = true;
                break;
            }
        }
        return result;
    }
}
