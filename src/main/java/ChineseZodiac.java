import Utilities.DealWithDecades;
import Utilities.ZodiacCalculation;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ChineseZodiac {
    private ZodiacCalculation zodiacCalculation;
    private DealWithDecades dealWithDecades;
    public ChineseZodiac() {
        this.zodiacCalculation = new ZodiacCalculation();
        this.dealWithDecades = new DealWithDecades();
    }
    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nTo get your Chinese zodiac sign, please enter the four-digit year of your birth -> ");
        Double birthYear = input.nextDouble();
        Double num = (birthYear / 12) - 164;
        num = this.dealWithDecades.getADouble(num);
        DecimalFormat df = new DecimalFormat("#.###");
        String bDayYearNum = df.format(num);
        String bDayYear = df.format(birthYear);
        this.zodiacCalculation.answer(bDayYearNum, bDayYear);
    }
}