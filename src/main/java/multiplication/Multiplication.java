package multiplication;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        printTables(getNumber());
    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");

        return Double.parseDouble(scanner.nextLine());
    }

    public static void printTables(double userInput) {
        for (int i = 1; i <= 10; i++)  {
            System.out.println(formatNumber(userInput) + " x " + i + " = " + formatNumber(userInput * i));
        }
    }

    public static String formatNumber (double userInput) {
        return  (userInput == (int) userInput)
                ? String.format("%,d", (int) userInput)
                : String.valueOf(userInput);
    }

}
