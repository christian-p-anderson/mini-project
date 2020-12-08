import Utilities.ZodiacCalculation;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ChineseZodiac {
    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nTo get your Chinese zodiac sign, please enter the four-digit year of your birth -> ");
        Double birthYear = input.nextDouble();
        Double num = (birthYear / 12) - 164;
        num = DealWithDecades.getADouble(num);
        DecimalFormat df = new DecimalFormat("#.###");
        String bDayYearNum = df.format(num);
        String bDayYear = df.format(birthYear);
        ZodiacCalculation.answer(bDayYearNum, bDayYear);
    }
}