package util;

import java.util.ArrayList;
import java.util.Scanner;


public class IOUtil {
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

    //method for inputting employee info at index i
    public static void inputEmployee(int i,
                                     ArrayList<String> fullName,
                                     ArrayList<Integer> age,
                                     ArrayList<String> gender,
                                     ArrayList<Double> salary,
                                     ArrayList<Double> gpa) {

        System.out.println("\nEnter information for employee " + (i + 1));

        System.out.print("Full name: ");
        fullName.add(scanner.nextLine());

        System.out.print("Age: ");
        age.add(scanner.nextInt());

        scanner.nextLine(); // clear buffer

        System.out.print("Gender: ");
        gender.add(scanner.nextLine());

        System.out.print("Salary: ");
        salary.add(scanner.nextDouble());

        System.out.print("GPA: ");
        gpa.add(scanner.nextDouble());

        scanner.nextLine(); // clear buffer
    }

    //output employee info
    public static void displayEmployee(int i,
                                       ArrayList<String> fullName,
                                       ArrayList<Integer> age,
                                       ArrayList<String> gender,
                                       ArrayList<Double> salary,
                                       ArrayList<Double> gpa) {

        System.out.println("\nEmployee " + (i + 1));
        System.out.println("Name: " + fullName.get(i));
        System.out.println("Age: " + age.get(i));
        System.out.println("Gender: " + gender.get(i));
        System.out.println("Salary: " + salary.get(i));
        System.out.println("GPA: " + gpa.get(i));
        System.out.println("-------------------------");
    }

}
