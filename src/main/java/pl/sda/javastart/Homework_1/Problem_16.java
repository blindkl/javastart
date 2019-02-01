package pl.sda.javastart.Homework_1;

/*16. Napisz program, który po podaniu kodu języka (dostępne PL, EN, DE, FR)
wyświetli odpowiedni napis powitalny (przy użyciu "switch") w danym języku (dla PL – „Dzień dobry. Witam serdecznie”, dla EN – „Good morning. Welcome!”, dla DE – „Guten Morgen.
 Herzlich Willkommen!”, dla FR – „Bonne matin. Bienvenue!”).
 Jeżeli wprowadzony kod nie odpowiada żadnemu z powyższych program powinien o tym poinformować i przywitać się w języku angielskim.*/

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String lang = null;

        System.out.print("Podaj język(PL, EN, DE, FR): ");
        lang = s.next();
        switch (lang.toLowerCase()) {
            case "pl":
                System.out.println("Dzień dobry. Witam serdecznie");
                break;
            case "en":
                System.out.println("Good morning. Welcome!");
                break;
            case "de":
                System.out.println("Guten Morgen. Herzlich Willkommen!");
                break;
            case "fr":
                System.out.println("Bonjour. Bienvenue!");
                break;
            default:
                System.out.println("Good morning. Language that you are selected is not supported.");
        }
    }
}