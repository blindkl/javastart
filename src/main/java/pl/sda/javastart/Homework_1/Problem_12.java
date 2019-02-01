package pl.sda.javastart.Homework_1;

/*12. Napisz metodę pobierającą od użytkownika 5 różnych
liczb całkowitych za pomocą pętli for,
• Po zakończeniu pobierania wypisz sumę oraz średnią
wszystkich pobranych liczb.
• Wypisz najmniejszą oraz największą z
podanych przez użytkownika liczb*/

import java.util.Arrays;
import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {
        sumAvgMinMax();

    }

    public static void sumAvgMinMax() {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbę całkowitą: ");
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            if (i == 0) {
                min = arr[i];
                max = arr[i];
            }
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Suma podanych liczb: " + sum + "\nSrednia podanych liczb: " + (double) sum / arr.length + "\nMinimalna Liczba: " + min + "\nMaksymalna liczba: " + max);
    }
}