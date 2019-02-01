package pl.sda.javastart.Homework_1;

/* Napisz metodę, która wyświetli na ekranie liczby od 1 do 20 i zaznaczy przy każdej z nich, czy jest to liczba parzysta, czy nieparzysta. Zrób to:
wykorzystując pętlę for
wykorzystując pętlę while
wykorzystując pętle do…while*/

public class Problem_10 {
    public static void main(String[] args) {
        printFor();
        System.out.println();
        printWhile();
        System.out.println();
        printDoWhile();
    }

    public static void printFor() {
        for (int i = 1; i <= 20; i++) {
            printEvenOrOdd(i);
        }
    }
    public static void printWhile(){
        int i = 1;
        while(i <= 20){
            printEvenOrOdd(i++);
        }
    }
    public static void printDoWhile(){
        int i = 1;
        do{
            printEvenOrOdd(i++);
        }while(i <= 20);
    }

    public static void printEvenOrOdd(int n){
        if (n % 2 == 0) {
            System.out.println(n + " - parzysta");
        } else {
            System.out.println(n + " - nieparzysta");
        }
    }
}