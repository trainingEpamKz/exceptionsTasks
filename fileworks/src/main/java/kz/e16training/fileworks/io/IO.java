package kz.e16training.fileworks.io;

import kz.e16training.fileworks.exceptions.CloseInputStreamException;
import kz.e16training.fileworks.exceptions.GetTextFromUserInputException;

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
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void print(String outputString) {
        System.out.println(outputString);
    }

    public static String getCommand() throws IOException, GetTextFromUserInputException {
        return getLine();
    }

    public static String askAndGetText() throws IOException, GetTextFromUserInputException {
        print(ASK_FOR_TEXT);
        return getLine();
    }

    public static void askForCommand() {
        print(ASK_FOR_COMMAND);
    }

    private static String getLine() throws GetTextFromUserInputException {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new GetTextFromUserInputException("Read text from user input error");
        }
    }

    public static void close() throws CloseInputStreamException {
        try {
            reader.close();
        } catch (IOException e) {
            throw new CloseInputStreamException("Error closing input stream");
        }
    }
}

