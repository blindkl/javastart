package pl.sda.javastart.Homework_1;

/* Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem podwójnej pętli for (rozmiar podajemy przez parametr). Wskazówka: dla zwiększenia czytelności skorzystaj z tabulatora.
Podaj rozmiar tabliczki mnozenia: 8
*/

import java.util.Scanner;

public class Problem_18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj rozmiar tabliczki mnozenia: ");
        int rows = s.nextInt();
        for (int i = 1; i <= rows ; i++) {
            System.out.print("\t"+i);
        }
        System.out.println();
        for (int i = 1; i <= rows ; i++) {
            System.out.print("-----");
        }
        System.out.println();
        for (int i = 1; i <= rows; i++){
            System.out.print(i+"|\t");
            for (int j = 1; j <= rows; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}