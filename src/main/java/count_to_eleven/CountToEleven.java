package count_to_eleven;

import java.util.Scanner;

public class CountToEleven {

    public static void main(String[] args) {
        printCount(getNumber());
    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number less than 11: ");
        double userInput = Double.parseDouble(scanner.nextLine());

        while (userInput >= 11) {
            String enteredNumber = formatNumber(userInput);
            System.out.print("You entered " + enteredNumber + ". Please enter a number less than 11: ");
            userInput = Double.parseDouble(scanner.nextLine());
        }

        return userInput;
    }

    public static String formatNumber (double userInput) {
        return  (userInput == (int) userInput)
                ? String.format("%,d", (int) userInput)
                : String.valueOf(userInput);
    }

    public static void printCount (double userInput) {
        System.out.println(formatNumber(userInput));
        int count = (int)userInput + 1;
        while (count <= 11) {
            System.out.println(count);
            count += 1;
        }

    }

}
