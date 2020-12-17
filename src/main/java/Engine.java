import Menus.FindZodiacMenu;
import Utilities.Console;
import Utilities.ZodiacSign;
import Utilities.PrintDelays;

import java.util.Scanner;

public class Engine {
    PrintDelays printDelays = new PrintDelays();
    FindZodiacMenu findZodiacMenu = new FindZodiacMenu();
    ZodiacSign zodiacSign = new ZodiacSign();

    public void run() {
        printDelays.delay1();
        findZodiacMenu.run();
        Double birthYear;
        String mode = Console.getStringInput("\nEnter your selection here: ");
        printDelays.delay1();
        boolean powerOn = true;
        while (powerOn) {
            if(mode.equals("1")) {
                birthYear = getBirthYear();
                Double num = (1997 - birthYear) % 12;
                zodiacSign.answer(num, birthYear);
                Console.print("\n");
                printDelays.delay2();
                break;
            } else if (mode.equals("2")) {
                powerOn = false;
                printDelays.delay0();
                break;
            } else {
                Console.println("Not a valid selection. Please select again!");
                break;
            }
        }
    }

    private Double getBirthYear() {
        Double birthYear;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            Console.print("\nPlease provide your four-digit year of birth:\n");
            try {
                birthYear = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException ignore) {
                Console.print("Invalid input. Please try again\n");
            }
        }
        return birthYear;
    }
}
