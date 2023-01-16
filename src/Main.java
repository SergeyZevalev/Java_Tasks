public class Main {
    public static void main(String[] args) {
        String password = "lkjfilrkj23";
        EmptyValidation emptyValidation = new EmptyValidation(password);
        MinValidation minValidation = new MinValidation(password);
        MaxValidation maxValidation = new MaxValidation(password);
        Numberalidation numberalidation = new Numberalidation(password);

        ValidationChain validation1 = new ValidationChain(emptyValidation);
        ValidationChain validation2 = new ValidationChain(minValidation);
        ValidationChain validation3 = new ValidationChain(maxValidation);
        ValidationChain validation4 = new ValidationChain(numberalidation);

        validation1.setNextValidation(validation2);
        validation2.setNextValidation(validation3);
        validation3.setNextValidation(validation4);

        validation1.validate();
    }
}