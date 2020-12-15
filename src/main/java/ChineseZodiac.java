import Menus.MainMenu;
import Utilities.Console;
import Utilities.PrintDelays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChineseZodiac {
    MainMenu mainMenu = new MainMenu();
    PrintDelays printDelays = new PrintDelays();
    Engine engine = new Engine();
    public void run() {
        boolean power = true;
        while (power) {
            try {
            mainMenu.run();
            int input = Console.getIntegerInput("Enter your choice here: ");
                switch (input) {
                    case 1:
                        engine.run();
                        break;
                    case 2:
                        printDelays.delay0();
                        power = false;
                        System.out.println("\nTurning off. Please come back again!\n");
                        printDelays.delay0();
                        break;
                    default:
                        Console.print("\nPlease make an appropriate selection" + "\n");
                        printDelays.delay0();
                        break;
                }
            } catch (InputMismatchException e) {
                Console.println("\n" + "Please choose option that's on the menu");
            }
        }
    }
}