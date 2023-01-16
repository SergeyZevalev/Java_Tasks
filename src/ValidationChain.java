public class ValidationChain {

    private final Validation validation;

    private ValidationChain nextValidation;

    public ValidationChain(Validation validation) {
        this.validation = validation;
    }

    public void setNextValidation(ValidationChain nextValidation) {
        this.nextValidation = nextValidation;
    }

    public void validate() {
        if (validation.validate()){
            if(nextValidation != null){
                nextValidation.validate();
            }
        } else{
            System.out.println(validation.getClass().getSimpleName() + " не прошла");
        }
    }
}
