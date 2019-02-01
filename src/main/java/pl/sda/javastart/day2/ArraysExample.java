package pl.sda.javastart.day2;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int badExample[] = new int[5]; //dont do this
        int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;
//        int [] anotherTable = {2, 4, 6, 8, 10}; // skrocona wersja
        int[] anotherTable = new int[]{2, 4, 6, 8, 10};
        printElementsOfArray(anotherTable);
        printElementsOfArrayForEach(anotherTable);
        System.out.println(printPrettyArray(anotherTable));
        System.out.println(Arrays.toString(anotherTable));
        System.out.println(Arrays.toString(minAndMaxValue(anotherTable)));

        for (int i : anotherTable) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printElementsOfArray(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void printElementsOfArrayForEach(int[] tab) {
        for (int element : tab) {
            System.out.println(element);
        }
    }

    public static String printPrettyArray(int[] tab) {
        String result = "[ ";
        int counter = 1;
        for (int element : tab) {
            result = result + element;
            if (counter <= tab.length - 1) {
                result = result + ", ";
            }
            counter++;
        }
        return result + " ]";
    }

    public static int[] minAndMaxValue(int[] tab) {
        int min = tab[0];
        int max = tab[0];
        for (int element : tab) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        return new int[]{min, max};
    }
}