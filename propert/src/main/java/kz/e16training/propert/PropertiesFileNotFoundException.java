package kz.e16training.propert;

/**
 * Exception for situation:
 * properties file not found.
 *
 */
public class PropertiesFileNotFoundException extends Throwable {
    public PropertiesFileNotFoundException(String message) {
        super(message);
    }
}
