import Utilities.ZodiacCalculation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class ChineseZodiacTest {

//    @Before
//    public static void main(String[] args) {
//        ChineseZodiac chineseZodiac = new ChineseZodiac();
//        chineseZodiac.run();
//    }

//    @Rule
//    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void chineseZodiacTest() {
        ZodiacCalculation zodiacCalculation = new ZodiacCalculation();

        String input1 = "0.5";
        String input2 = "1974";

        InputStream in = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in);

//        Assert.assertEquals(, inputOutput.getInput());
    }

}