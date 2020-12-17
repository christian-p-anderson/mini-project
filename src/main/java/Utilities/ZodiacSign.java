package Utilities;

public class ZodiacSign {
    public void answer(Double num, Double birthYear) {
        String birthYearString = String.valueOf(birthYear).substring(0, 4);
        if (num == 1 || num == -11) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Rat (shu). You're quick-witted, resourceful and versatile - - -\n");
        } else if (num == 0) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Ox (niu). You're decisive, honest, dependable and hardworking - - -\n");
        } else if (num == 11 || num == -1) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Tiger (hu). You're brave, competitive, unpredictable and self-confident - - -\n");
        } else if (num == 10 || num == -2) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Rabbit (tu). You're gentle, quiet, elegant, alert, quick, skillful, kind and patient - - -\n");
        } else if (num == 9 || num == -3) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Dragon (long). You're confident, intelligent, ambitious, persevering and hardworking - - -\n");
        } else if (num == 8 || num == -4) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Snake (she). You're intelligent, courageous, confident, insightful and communicative - - -\n");
        } else if (num == 7 || num == -5) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Horse (ma). You're animated, kind, straightforward, active and energetic - - -\n");
        } else if (num == 6 || num == -6) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Goat (yang). You're gentle, shy, stable, sympathetic and adventurous - - -\n");
        } else if (num == 5 || num == -7) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Monkey (hou). You're witty, intelligent, ambitious and adventurous - - -\n");
        } else if (num == 4 || num == -8) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Rooster (ji). You're observant, hardworking, resourceful, courageous and talented - - -\n");
        } else if (num == 3 || num == -9) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Dog (gou). You're loyal, honest, amiable, kind, cautious and prudent - - -\n");
        } else if (num == 2 || num == -10) {
            Console.print("- - - You were born in " + birthYearString + ", the year of the Pig (zhu). You're diligent, compassionate, generous, easy-going and gentle - - -\n");
        } else {
            Console.print("Please provide an appropriate year of birth");
        }
    }
}

