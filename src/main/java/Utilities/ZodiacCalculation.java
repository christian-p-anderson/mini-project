package Utilities;

public class ZodiacCalculation {
    public static void answer(String bDayYearNum, String bDayYear) {
        switch(bDayYearNum) {
            case "0.333":
                System.out.println("You were born in " + bDayYear + ", the year of the Rat (shu). You're quick-witted, resourceful and versatile!");
                break;
            case "0.417":
                System.out.println("You were born in " + bDayYear + ", the year of the Ox (niu). You're decisive, honest, dependable and hardworking!");
                break;
            case "0.5":
                System.out.println("You were born in " + bDayYear + ", the year of the Tiger (hu). You're brave, competitive, unpredictable, and self-confident!");
                break;
            case ("0.583"):
                System.out.println("You were born in " + bDayYear + ", the year of the Rabbit (tu). You're gentle, quiet, elegant, alert, quick, skillful, kind, and patient!");
                break;
            case ("0.667"):
                System.out.println("You were born in " + bDayYear + ", the year of the Dragon (long). You're confident, intelligent, ambitious, persevering and hardworking!");
                break;
            case ("0.75"):
                System.out.println("You were born in " + bDayYear + ", the year of the Snake (she). You're intelligent, courageous, confident, insightful and communicative!");
                break;
            case ("0.833"):
                System.out.println("You were born in " + bDayYear + ", the year of the Horse (ma). You're animated, kind, straightforward, active and energetic!");
                break;
            case ("0.917"):
                System.out.println("You were born in " + bDayYear + ", the year of the Goat (yang). You're gentle, shy, stable, sympathetic and adventurous!");
                break;
            case ("0"):
                System.out.println("You were born in " + bDayYear + ", the year of the Monkey (hou). You're witty, intelligent, ambitious and adventurous");
                break;
            case ("0.083"):
                System.out.println("You were born in " + bDayYear + ", the year of the Rooster (ji). You're observant, hardworking, resourceful, courageous and talented!");
                break;
            case ("0.167"):
                System.out.println("You were born in " + bDayYear + ", the year of the Dog (gou). You're loyal, honest, amiable, kind, cautious and prudent!");
                break;
            case ("0.25"):
                System.out.println("You were born in " + bDayYear + ", the year of the Pig (zhu). You're diligent, compassionate, generous, easy-going and gentle!");
                break;
            default:
                System.out.println("Error in your input...please re-enter the year of your birth.");
                break;
        }
    }
}