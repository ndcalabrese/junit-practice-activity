package average_method;

import java.util.Scanner;

public class AverageMethod {

    public static void main(String[] args) {
        System.out.println("The average is: " + average());
    }

    public static double average() {
        return sum(getNumbers()) / 3;
    }

    public static double[] getNumbers() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Input a second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Input a third number: ");
        double num3 = Double.parseDouble(scanner.nextLine());

        return new double[] { num1, num2, num3 };
    }

    public static double sum(double[] userInput) {
            return userInput[0] + userInput[1] + userInput[2];
    }

}
