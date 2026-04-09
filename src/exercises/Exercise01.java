package exercises;

import util.ArrayListUtil;
import util.InputUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
Write a program to perform the following tasks:
a. Input an ArrayList named a containing n integer (int) elements
b. Print the values of all elements in a
c. Count the number of odd elements in ArrayList a
d. Calculate the sum of positive odd numbers in a
e. Input an element k and check whether k appears in a. If yes, display all positions of k in the ArrayList
f. Sort a in ascending order
    → Hint: Use Collections.sort()
g. Reverse the order of elements in a
    → Hint: Use Collections.reverse()
h. Remove all elements in a that have value x entered from the keyboard
i. Insert one element value at any index
    (remove the last element to keep the size unchanged)
j. Find the maximum and minimum values in a
k. Find the second largest value in a
 */
public class Exercise01 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] arg) {


        /*
        a. Input an ArrayList named a containing n integer (int) elements
         */
        System.out.println("a. Input an ArrayList named a containing n integer (int) elements");
        //Initialize an ArrayList
        ArrayList<Integer> a = new ArrayList<>();


        //Prompt for n
        int n = InputUtil.inputPositive("Please enter an integer number of elements: ");

        //loop to fill in elements
        for (int i = 0; i < n; i++) {
            System.out.printf("list[ %d ] = ", i);
            a.add(scanner.nextInt());
        }

        /*
        b. Print the values of all elements in a
         */
        System.out.println("\nb. Elements of a");
        ArrayListUtil.printList(a);

        /*
        c. Count the number of odd elements in ArrayList a
         */
        System.out.print("\nc. The number of odd elements in ArrayList a: " + ArrayListUtil.countOdd(a));
        System.out.println();
        /*
        d. Calculate the sum of positive odd numbers in a
         */
        System.out.println("\nd. Calculate the sum of positive odd numbers in a");
        System.out.println("sum = " + ArrayListUtil.calcPositiveOdds(a));
        System.out.println();

        /*
        e. Input an element k and check whether k appears in a. If yes, display all positions of k in the ArrayList
         */

        //input element k
        int k = InputUtil.inputPositive("\nPlease enter an integer element k: ");
        boolean found = false;

        //display positions of k if available
        System.out.println("All positions of k in the ArrayList: ");
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == k) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found.");
        }
        System.out.println();

        /*
        f. Sort a in ascending order
        → Hint: Use Collections.sort()
         */
        System.out.println("\nf. a sorted in ascending order: ");
        ArrayListUtil.printList(ArrayListUtil.sortListAscending(a));
        System.out.println();

        /*
        g. Reverse the order of elements in a
        → Hint: Use Collections.reverse()
         */
        System.out.println("\ng. Order of elements in a reversed: ");
        ArrayListUtil.printList(ArrayListUtil.reverseList(a));
        System.out.println();

        /*
        h. Remove all elements in a that have value x entered from the keyboard
         */
        System.out.println("\nh. Remove all elements in a that have value x entered from the keyboard");
        int x = InputUtil.inputPositive("Please enter an integer value x: ");
        ArrayList<Integer> removedList = new ArrayList<>(a);
        removedList.removeAll(Collections.singleton(x));

        System.out.println("ArrayList after removing all occurrences of " + x + ":");
        ArrayListUtil.printList(removedList);
        System.out.println();

        /*
        i. Insert one element value at any index
        (remove the last element to keep the size unchanged)
         */
        System.out.println("\ni. Insert one element value at any index");
        ArrayList<Integer> insertedList = new ArrayList<>(a);

        int element = InputUtil.inputPositive("Please an integer element: ");

        int value = InputUtil.inputPositive("Please enter an index you want to insert the element: ");

        boolean inserted = ArrayListUtil.insertElement(insertedList, element, value);

        if (inserted) {
            System.out.println("ArrayList after insertion (size unchanged):");
            ArrayListUtil.printList(insertedList);
        } else {
            System.out.println("Invalid index. Insertion not performed.");
        }

        System.out.println();

        /*
        j. Find the maximum and minimum values in a
         */
        System.out.println("\nj. The maximum and minimum values in a");
        System.out.println("max = " + ArrayListUtil.findMax(a));
        System.out.println("min = " + ArrayListUtil.findMin(a));

        /*
        k. Find the second largest value in a
         */
        System.out.println("The second largest value in a");
        System.out.println("second max = " + ArrayListUtil.findSecondMax(a));













    }
}
