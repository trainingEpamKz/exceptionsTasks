package kz.e16training.fileworks;


import kz.e16training.fileworks.controller.Controller;

/**
 * @author DK
 * @version 1.0.0
 *
 */
public class Run {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.commandLine();
    }
}
