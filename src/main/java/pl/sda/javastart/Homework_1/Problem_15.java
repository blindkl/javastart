package pl.sda.javastart.Homework_1;

/*15. Należy napisać program przyjmujący dwie liczby (scanner) i wykonujący na nich różne działania w pętli while
(w zależności od wyboru - "+", "-" itd - tu można użyć if...else lub switch).
Program powinien zakończyć działanie po wpisaniu "koniec".*/

import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        String sign = "";
        int a = 0;
        int b = 0;
        System.out.print("Program wykonujący obliczenia na dwoch liczbach.\nPodaj pierwszą liczbe: ");
        a = s.nextInt();
        System.out.print("Podaj druga liczbe: ");
        b = s.nextInt();

        while (!sign.equals("koniec")) {
            System.out.print("Wybierz działanie(\"+\", \"-\", \"*\", \"/\", \"^\") lub napisz \"koniec\" aby zakonczyc: ");
            sign = s.next();

            switch (sign) {
                case "+":
                    System.out.println("Wynik dodawania to: " + (a + b));
                    break;
                case "-":
                    System.out.println("Wynik odejmowania to: " + (a - b));
                    break;
                case "*":
                    System.out.println("Wynik mnozenia to: " + (a * b));
                    break;
                case "/":
                    if (b > 0) {
                        System.out.println("Wynik dzielenia to: " + ((double)a / b));
                    } else {
                        System.out.println("Druga liczba nie moze byc mniejsza od zera!");
                    }
                    break;
                case "^":
                    System.out.println("Wtnik potęgowania to: " + (int) Math.pow(a, b));
                    break;
            }
        }
    }
}