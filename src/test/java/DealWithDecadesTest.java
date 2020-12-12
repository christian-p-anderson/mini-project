import Utilities.DealWithDecades;
import org.junit.Assert;
import org.junit.Test;

public class DealWithDecadesTest {

    @Test
    public void dealWithDecadesTest1() {
        DealWithDecades dealWithDecades = new DealWithDecades();
        Double expected = 0.5;

        Double actual = dealWithDecades.getADouble(1.5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dealWithDecadesTest2() {
        DealWithDecades dealWithDecades = new DealWithDecades();
        Double expected = 0.5;

        Double actual = dealWithDecades.getADouble(2.5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dealWithDecadesTest3() {
        DealWithDecades dealWithDecades = new DealWithDecades();
        Double expected = 0.5;

        Double actual = dealWithDecades.getADouble(3.5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dealWithDecadesTest4() {
        DealWithDecades dealWithDecades = new DealWithDecades();
        Double expected = 0.5;

        Double actual = dealWithDecades.getADouble(4.5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dealWithDecadesTest5() {
        DealWithDecades dealWithDecades = new DealWithDecades();
        Double expected = 0.5;

        Double actual = dealWithDecades.getADouble(-1.5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dealWithDecadesTest6() {
        DealWithDecades dealWithDecades = new DealWithDecades();
        Double expected = 0.5;

        Double actual = dealWithDecades.getADouble(-2.5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dealWithDecadesTest7() {
        DealWithDecades dealWithDecades = new DealWithDecades();
        Double expected = 0.5;

        Double actual = dealWithDecades.getADouble(-3.5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dealWithDecadesTest8() {
        DealWithDecades dealWithDecades = new DealWithDecades();
        Double expected = 0.5;

        Double actual = dealWithDecades.getADouble(-4.5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dealWithDecadesTest9() {
        DealWithDecades dealWithDecades = new DealWithDecades();
        Double expected = 0.3;

        Double actual = dealWithDecades.getADouble(0.3);

        Assert.assertEquals(expected, actual);
    }



}
