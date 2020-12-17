import Menus.FindZodiacMenu;
import Utilities.Console;
import Utilities.GetBirthYear;
import Utilities.ZodiacSign;
import Utilities.PrintDelays;

public class Engine {
    PrintDelays printDelays = new PrintDelays();
    FindZodiacMenu findZodiacMenu = new FindZodiacMenu();
    ZodiacSign zodiacSign = new ZodiacSign();
    GetBirthYear getBirthYear = new GetBirthYear();

    public void run() {
        printDelays.delay1();
        Double birthYear;
        findZodiacMenu.run();
        Integer mode = Console.getIntegerInput("\nEnter your selection here: ");
        printDelays.delay1();
        boolean powerOn = true;
        while (powerOn) {
            if (mode == 1) {
                birthYear = getBirthYear.returnBirthYear();
                Double num = (1997 - birthYear) % 12;
                zodiacSign.answer(num, birthYear);
                printDelays.delay2();
                break;
            } else if (mode == 2) {
                powerOn = false;
                printDelays.delay0();
                break;
            } else {
                Console.println("Not a valid selection. Please select again!");
                break;
            }
        }
    }
}
