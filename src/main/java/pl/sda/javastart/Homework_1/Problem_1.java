package pl.sda.javastart.Homework_1;

/* Stwórzcie program prowadzący "konwersację" z Wami (przy użyciu Scannera i kilku zmiennych).

"Cześć. Jak się czujesz?" <pobranie wartości String - o tym jak się czujecie>
"Cieszę się, że czujesz się " ... -> wyświetlenie wartości
"Jak masz na imię?" <pobranie wartości imienia>
"Ile masz lat?" <pobranie wartości lat>
imie + " masz " + wiek + " lat" -> wypisanie wartości
"Ile masz wzrostu (dokładnie!)?" <pobranie wartości wzrostu>
imie + " masz " + wzrost + " cm" -> wypisanie wartości
"A jak czujesz się teraz?" <pobranie wartości i reużycie zmiennej o samopoczuciu>
"Cieszę się, że czujesz się " -> wyswietlenie samopoczucia */

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mood;
        String name;
        int age;
        int height;

        System.out.println("Cześć. Jak się czujesz?");
        mood = scanner.nextLine();
        System.out.println("Cieszę się, że czujesz się " + mood + "\nJak masz na imię?");
        name = scanner.nextLine();
        System.out.println("Ile masz lat?");
        age = scanner.nextInt();
        System.out.println(name + " masz " + age + " lat.\nIle masz wzrostu(dokładnie!)?");
        height = scanner.nextInt();
        System.out.println(name + " masz " + height + " cm wzrostu.\nA jak się czujesz teraz?");
        mood = scanner.next();
        System.out.println("Cieszę się, że czujesz się " + mood);

    }
}