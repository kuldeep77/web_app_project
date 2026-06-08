package in.kuldeep.exception;


public class ConsultantNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ConsultantNotFoundException(String message) {
        super(message);
    }
}
