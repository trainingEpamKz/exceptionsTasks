package kz.e16training.fileworks.io;

import kz.e16training.fileworks.exceptions.GetTextFromUserException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input - output.
 *
 */
public class IO {
    private static final String ASK_FOR_COMMAND = "Input command:";
    private static final String ASK_FOR_TEXT = "Input text:";

    public static void print(String outputString) {
        System.out.println(outputString);
    }

    public static String getCommand() throws IOException, GetTextFromUserException {
        return getLine();
    }

    public static String askAndGetText() throws IOException, GetTextFromUserException {
        print(ASK_FOR_TEXT);
        return getLine();
    }

    public static void askForCommand() {
        print(ASK_FOR_COMMAND);
    }

    private static String getLine() throws GetTextFromUserException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine();
        } catch (IOException e) {
            throw new GetTextFromUserException("Read text from user input error");
        }
    }
}

