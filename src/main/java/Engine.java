import Menus.FindSignMenu;
import Utilities.Console;
import Utilities.DealWithDecades;
import Utilities.PrintDelays;
import Utilities.ZodiacCalculation;

import java.text.DecimalFormat;

public class Engine {
    PrintDelays printDelays = new PrintDelays();
    FindSignMenu findSignMenu = new FindSignMenu();
    DealWithDecades dealWithDecades = new DealWithDecades();

    public void run() {
        printDelays.delay1();
        findSignMenu.run();
        Double input1 = (double) 0;
        String mode = Console.getStringInput("\nEnter your selection here: ");
        printDelays.delay1();
        boolean powerOn = true;
        while (powerOn) {
            if(mode.equals("1")) {
                input1 = Console.getDoubleInput("\nPlease provide your four-digit year of birth: ");
                Double num = (input1 / 12) - 164;
                Double birthYearConversion = dealWithDecades.getADouble(num);
                DecimalFormat df = new DecimalFormat("#.###");
                String bDayYearNum = df.format(birthYearConversion);
                String bDayYear = df.format(input1);
                ZodiacCalculation.answer(bDayYearNum, bDayYear);
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
}
