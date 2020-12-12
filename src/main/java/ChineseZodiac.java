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
        double birthYearInput = input.nextDouble();
        Double num = (birthYearInput / 12) - 164;
        Double birthYearConversion = dealWithDecades.getADouble(num);
        DecimalFormat df = new DecimalFormat("#.###");
        String bDayYearNum = df.format(birthYearConversion);
        String bDayYear = df.format(birthYearInput);
        zodiacCalculation.answer(bDayYearNum, bDayYear);
    }
}