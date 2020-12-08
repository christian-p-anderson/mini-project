import java.text.DecimalFormat;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        Scanner input = new Scanner(System.in);
        System.out.println("\nTo get your Chinese zodiac sign, please enter the four-digit year of your birth -> ");
        Double birthYear = input.nextDouble();
        Double num = (birthYear / 12) - 164;
        if (num > 1 && num < 2) {
            num -= 1;
        } else if (num > 2 && num < 3) {
            num -= 2;
        } else if (num > 3 && num < 4) {
            num -=3;
        } else if (num > 4 && num < 5) {
            num -= 4;
        }else if (num < -1 && num > -2) {
            num = Math.abs(num + 1);
        } else if (num < -2 && num > -3) {
            num = Math.abs(num + 2);
        } else if (num < -3 && num > -4) {
            num = Math.abs(num + 3);
        } else if (num < -4 && num > -5) {
            num = Math.abs(num + 4);
        }
        DecimalFormat df = new DecimalFormat("#.###");
        String bDayYearNum = df.format(num);
        String bDayYear = df.format(birthYear);
        ZodiacCalculation.answer(bDayYearNum, bDayYear);
    }
}