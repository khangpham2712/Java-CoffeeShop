package mycoffeeshop.controller.console;

import mycoffeeshop.controller.search.MySearch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static byte readNumberBeverage(String prompt, byte min, byte max) {
        boolean isANumber;
        byte value;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextByte();
                isANumber = true;
            }
            catch (InputMismatchException e) {
                isANumber = false;
                scanner.nextLine();
                value = -1;
            }
            if (!isANumber) {
                System.out.println("Must enter a number");
                continue;
            }
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Must enter a number above");
        }
        return value;
    }

    public static byte readNumberToppings(String prompt, byte[] options) {
        boolean isANumber;
        byte value;
        while (true) {
            System.out.print(prompt);
            try {
                value = scanner.nextByte();
                isANumber = true;
            }
            catch (InputMismatchException e) {
                isANumber = false;
                scanner.nextLine();
                value = -1;
            }
            if (!isANumber) {
                System.out.println("Must enter a number");
                continue;
            }
            if (MySearch.search(options, 0, options.length - 1, value) || value == 0) {
                break;
            }
            System.out.println("Must enter a number above");
        }
        return value;
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
