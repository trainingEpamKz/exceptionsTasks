package kz.e16training.propert;

/**
 * Exception for situation:
 * property key not found.
 *
 */
public class PropertyKeyNotFoundException extends Exception {
    public PropertyKeyNotFoundException(String message) {
        super(message);
    }
}
