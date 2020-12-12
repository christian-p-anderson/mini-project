import Utilities.ZodiacCalculation;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class ZodiacCalculationTest {
    // https://www.baeldung.com/java-testing-system-out-println
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void zodiacCalculationTest1() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.333";
        String bDayYear = "2100";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2100, the year of the Rat (shu). You're quick-witted, resourceful and versatile!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest2() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.417";
        String bDayYear = "2101";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2101, the year of the Ox (niu). You're decisive, honest, dependable and hardworking!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest3() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.5";
        String bDayYear = "2102";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2102, the year of the Tiger (hu). You're brave, competitive, unpredictable and self-confident!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest4() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.583";
        String bDayYear = "2103";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2103, the year of the Rabbit (tu). You're gentle, quiet, elegant, alert, quick, skillful, kind and patient!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest5() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.667";
        String bDayYear = "2104";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2104, the year of the Dragon (long). You're confident, intelligent, ambitious, persevering and hardworking!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest6() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.75";
        String bDayYear = "2105";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2105, the year of the Snake (she). You're intelligent, courageous, confident, insightful and communicative!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest7() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.833";
        String bDayYear = "2106";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2106, the year of the Horse (ma). You're animated, kind, straightforward, active and energetic!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest8() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.917";
        String bDayYear = "2107";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2107, the year of the Goat (yang). You're gentle, shy, stable, sympathetic and adventurous!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest9() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0";
        String bDayYear = "2108";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2108, the year of the Monkey (hou). You're witty, intelligent, ambitious and adventurous";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest10() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.083";
        String bDayYear = "2109";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2109, the year of the Rooster (ji). You're observant, hardworking, resourceful, courageous and talented!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest11() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.167";
        String bDayYear = "2110";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2110, the year of the Dog (gou). You're loyal, honest, amiable, kind, cautious and prudent!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest12() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "0.25";
        String bDayYear = "2111";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "You were born in 2111, the year of the Pig (zhu). You're diligent, compassionate, generous, easy-going and gentle!";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }

    @Test
    public void zodiacCalculationTest13() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();
        String bDayYearNum = "6.5";
        String bDayYear = "2112";

        zodiacCalculation.answer(bDayYearNum, bDayYear);

        String expected = "Error in your input...please re-enter the year of your birth.";

        Assert.assertEquals(expected, systemOutRule.getLog().trim());
    }
}

