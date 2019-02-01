package pl.sda.javastart.Homework_1;

/* Utwórz metodę, która jako parametr przyjmuje tablicę i zwraca sumę elementów z pominięciem największego. */

public class Problem_19 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 8, 5, 6};
        System.out.println(sumArrayElementWithoutBiggest(a));
    }

    public static int sumArrayElementWithoutBiggest(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int element : arr) {
            sum = sum + element;
        }
        return (sum - max);
    }
}