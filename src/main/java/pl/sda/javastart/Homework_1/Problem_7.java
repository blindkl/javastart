package pl.sda.javastart.Homework_1;

/*metodki z pętlami:
printCubesOfNumbers - wyswietlenie kolejnych liczb z wybranego zakresu i ich sześcianów
countdown - odliczanie w dół po podaniu liczby startowej
printMultiplications - wypisanie wyników mnożenia podanej liczby przez kolejne liczby całkowite do tej liczby włącznie*/

public class Problem_7 {
    public static void main(String[] args) {
        printCubesOfNumbers(2, 6);
        countdown(10);
        printMultiplications(5);
        printPowers(2, 10);
    }

    public static void printCubesOfNumbers(int start, int end) {
        System.out.println("Liczby z zakresu " + start + " - " + end + " i ich sześcianów.");
        for (int i = start; i <= end; i++) {
            System.out.println("Liczba: " + i + "; Jej trzecia potęga: " + (long) i * i * i);
        }
    }

    public static void countdown(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void printMultiplications(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(num * i);
        }
    }

    public static void printPowers(int num, int pow) {
        for (int i = 0; i <= pow + 1; i++) {
            System.out.println((int) Math.pow(num, i));
        }
    }
}