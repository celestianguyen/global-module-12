package util;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUtil {
    public static void printList(ArrayList<Integer> list) {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int countOdd(ArrayList<Integer> list) {
        int count = 0;

        for (int value : list) {
            if (value % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int calcPositiveOdds(ArrayList<Integer> list) {
        int sum = 0;

        for (int value : list) {
            if (value > 0 && value % 2 != 0) {
                sum += value;
            }
        }
        return sum;
    }

    public static ArrayList<Integer> sortListAscending(ArrayList<Integer> list) {
        ArrayList<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;

    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static boolean insertElement(ArrayList<Integer> list, int element, int index) {
        if (index < 0 || index >= list.size()) {
            return false;
        }
        list.add(index, element);
        list.remove(list.size() - 1);
        return true;
    }

    public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int findMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int findSecondMax(ArrayList<Integer> list) {
        ArrayList<Integer> removedMax = new ArrayList<>(list);

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        removedMax.removeAll(Collections.singleton(max));

        int secondMax = list.get(0);
        for (int i = 1; i < removedMax.size(); i++) {
            if (removedMax.get(i) > secondMax) {
                secondMax = removedMax.get(i);
            }
        }
        return secondMax;
    }


}
