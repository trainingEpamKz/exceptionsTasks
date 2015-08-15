package kz.e16training.propert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for Config Class.
 *
 */
public class ConfigTest {

    @Test
    public void testGetInstance() throws Exception, PropertiesFileNotFoundException {
        Config expectedObject = Config.getInstance("text");
        Config actualObject = Config.getInstance("text");
        assertSame(expectedObject, actualObject);
    }

    @Test
    public void testGetProperty() throws Exception, PropertiesFileNotFoundException {
        Config config = Config.getInstance("text");
        String[] expectedValues = {"value1", "value2", "value3"};
        for (int i = 0; i < expectedValues.length; i++){
            assertEquals(expectedValues[i], config.getProperty("key" + (i + 1)));
        }
    }

    @Test
    public void testPropertiesFileNotFoundException() {
        String wrongFileName = "wrong";
        try {
            Config.getInstance(wrongFileName);
            fail("Test file not found " + wrongFileName + " should have thrown a PropertiesFileNotFoundException");
        } catch (PropertiesFileNotFoundException e) {
            assertEquals("File: " + wrongFileName + ", not found", e.getMessage());
        }
    }

    @Test
    public void testPropertyKeyNotFoundException() throws PropertiesFileNotFoundException {
        String validFileName = "text";
        Config config = Config.getInstance(validFileName);
        String wrongKey = "key23";
        try {
            config.getProperty(wrongKey);
            fail("Test key not found " + wrongKey + " should have thrown a PropertiesKeyNotFoundException");
        } catch (PropertyKeyNotFoundException e) {
            assertEquals("Property with key: " + wrongKey + ", not found", e.getMessage());
        }
    }

}