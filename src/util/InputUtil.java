package util;

import java.util.Scanner;



public class InputUtil {
    static Scanner scanner = new Scanner(System.in);
    public static int inputPositive(String message) {
        int n;
        do {
            System.out.print(message);
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.print("Invalid input! Please re-enter the value again.");
                System.out.println();
            }

        } while (n <= 0);
        return n;
    }

}
