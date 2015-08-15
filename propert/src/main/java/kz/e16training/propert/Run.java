package kz.e16training.propert;


/**
 * @author DK
 * @version 1.0.0
 *
 */
public class Run {
    public static void main(String[] args) {
        Config config = null;
        try {
            Config.getInstance("text1");
            System.out.println(config.getProperty("key3"));
        } catch (PropertyKeyNotFoundException | PropertiesFileNotFoundException e) {
            //do something
            System.out.println(e.getMessage());
        }
        try {
            config = Config.getInstance("text");
            System.out.println(config.getProperty("key2"));
        } catch (PropertyKeyNotFoundException | PropertiesFileNotFoundException e) {
            //do something
            System.out.println(e.getMessage());
        }
    }
}
