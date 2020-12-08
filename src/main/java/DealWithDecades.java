public class DealWithDecades {
    /**
     * Base calculation done for period 1968 - 1979. Every decade beyond or after decreases and increases
     * respectively by 1. To get the num value to match the base period, the following algorithm was utilized.
     */
    static Double getADouble(Double num) {
        if (num > 1 && num < 2) {
            num -= 1;
        } else if (num > 2 && num < 3) {
            num -= 2;
        } else if (num > 3 && num < 4) {
            num -=3;
        } else if (num > 4 && num < 5) {
            num -= 4;
        }else if (num < -1 && num > -2) {
            num = Math.abs(num + 1); // Math.abs() deals with negative values
        } else if (num < -2 && num > -3) {
            num = Math.abs(num + 2);
        } else if (num < -3 && num > -4) {
            num = Math.abs(num + 3);
        } else if (num < -4 && num > -5) {
            num = Math.abs(num + 4);
        }
        return num;
    }
}
