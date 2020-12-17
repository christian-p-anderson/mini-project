package Utilities;

import java.util.Scanner;

public class GetBirthYear {
    public Double returnBirthYear() {
        Double birthYear;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            Console.print("\nPlease provide your four-digit year of birth:\n");
            try {
                birthYear = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException ignore) {
                Console.print("Invalid input. Please try again\n");
            }
        }
        return birthYear;
    }
}
