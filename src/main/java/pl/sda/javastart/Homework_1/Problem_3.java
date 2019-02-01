package pl.sda.javastart.Homework_1;

/*Napiszcie program określający wartość liczby.
Jeśli liczba jest dodatnia to podaje:
-dla zakresu 0..100 podaje "mała liczba dodatnia"
-dla zakresu 101..1000 podaje "liczba dodatnia"
-dla zakresu 1001.. "duża liczba dodatnia"
Analogicznie dla wartości ujemnych*/
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        System.out.println("Podaj jakaś liczbę całkowitą: ");
        number = s.nextInt();

        if (number == 0) {
            System.out.println("Twoja liczba to 0");
        } else if (number >= 1 && number <= 100) {
            System.out.println("Mała liczba dodatnia");
        } else if (number >= 101 && number <= 1000) {
            System.out.println("Liczba dodatnia");
        } else if (number >= 1001) {
            System.out.println("Duża liczba dodatnia");
        } else if (Math.abs(number) >= Math.abs(-1)&&Math.abs(number) <= Math.abs(-100)) {
            System.out.println("Mała liczba ujemna");
        } else if (Math.abs(number) >= Math.abs(-101)&&Math.abs(number) <= Math.abs(-1000)) {
            System.out.println("Liczba ujemna");
        } else if (Math.abs(number) >= Math.abs(-1001)) {
            System.out.println("Duza liczba ujemna");
        }

    }
}
