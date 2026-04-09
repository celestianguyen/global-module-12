package exercises;

import util.IOUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> fullName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        ArrayList<Double> salary = new ArrayList<>();
        ArrayList<Double> gpa = new ArrayList<>();


        int n;

        do {
            System.out.print("Enter number of employees (n <= 5): ");
            n = scanner.nextInt();

            if (n <= 0 || n > 5) {
                System.out.println("Invalid input. Please enter 1–5.");
            }
        } while (n <= 0 || n > 5);

        scanner.nextLine(); //clear buffer

        // input
        for (int i = 0; i < n; i++) {
            IOUtil.inputEmployee(i, fullName, age, gender, salary, gpa);
        }

        // Output
        System.out.println("\n=== Employee List ===");

        for (int i = 0; i < n; i++) {
            IOUtil.displayEmployee(i, fullName, age, gender, salary, gpa);
        }

        scanner.close();
    }
}
