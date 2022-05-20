package divide_method;

import java.util.Scanner;

public class DivideMethod {

    public static void main(String[] args) {
        divide(getNumbers());
    }

    public static void divide(double[] inputNumbers) {
        double[] divisionNumbers = { inputNumbers[0], inputNumbers[1], (inputNumbers[0] / inputNumbers[1]) };
        String[] formattedNumbers = formatNumbers(divisionNumbers);

        System.out.println(formattedNumbers[0] + " / " + formattedNumbers[1] + " = " + formattedNumbers[2]);
    }

    public static double[] getNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Input another number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        return new double[] {num1, num2};
    }

    public static String[] formatNumbers (double[] numbers) {
        String[] formattedNumbers = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == (int)numbers[i]) {
                formattedNumbers[i] = String.format("%,d", (int)numbers[i]);
            } else {
                formattedNumbers[i] = String.valueOf(numbers[i]);
            }
        }

        return formattedNumbers;
    }

}
