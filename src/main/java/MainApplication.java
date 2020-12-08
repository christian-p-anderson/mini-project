import Utilities.ZodiacCalculation;

public class MainApplication {

    public static void main(String[] args) {
       ChineseZodiac chineseZodiac = new ChineseZodiac();
        DealWithDecades addressDecades = new DealWithDecades();
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
       chineseZodiac.run();
    }
}
