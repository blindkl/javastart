package pl.sda.javastart.Homework_1;

/*Napiszcie program, który pyta o ilość uzyskanych punktów z testu (0-100), a następnie wystawia ocenę (gdzie 50 punktów
 zalicza test, a każde następne 10 podwyższa ocenę o 1, tak że 90-100 punktów daje najwyższą możliwą ocenę czyli 6).
  Użyj zagnieżdżonej instrukcji if … else if … else*/

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int wynik;

        System.out.print("Podaj ilość uzyskanych punktów na teście(0-100): ");
        wynik = s.nextInt();
        if (wynik >= 0 && wynik <= 100) {
            if (wynik >= 50 && wynik <= 59) {
                System.out.println("Zaliczyłeś/aś! Twoja ocena to: 2 :(");
            } else if (wynik >= 60 && wynik <= 69) {
                System.out.println("Zaliczyłeś/aś! Twoja ocena to: 3 :|");
            } else if (wynik >= 70 && wynik <= 79) {
                System.out.println("Zaliczyłeś/aś! Twoja ocena to: 4 :)");
            } else if (wynik >= 80 && wynik <= 89) {
                System.out.println("Zaliczyłeś/aś! Twoja ocena to: 5 :D");
            } else if (wynik >= 90) {
                System.out.println("Zaliczyłeś/aś! Twoja ocena to: 6! Gratulacje!");
            } else {
                System.out.println("Niestety nie zaliczyłeś/aś testu ;( ;(");
            }
        } else {
            System.out.println("Podałeś błędną ilość punktów!");
        }
    }
}