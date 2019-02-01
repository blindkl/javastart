package pl.sda.javastart.Homework_1;

/*13. Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca nową tablicę z liczbami w odwrotnej kolejności.*/

import java.util.Arrays;

public class Problem_13 {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(revertArray(tab)));
    }

    public static int[] revertArray(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }
}