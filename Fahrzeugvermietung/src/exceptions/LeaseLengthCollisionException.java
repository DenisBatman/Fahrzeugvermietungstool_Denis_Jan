package exceptions;

public class LeaseLengthCollisionException extends RuntimeException {
    public LeaseLengthCollisionException(String message) {
      super(message);
    }
}
