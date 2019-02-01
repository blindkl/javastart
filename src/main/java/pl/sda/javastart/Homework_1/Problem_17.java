package pl.sda.javastart.Homework_1;

/* Napisz metodkę wypisującą taki świąteczny temat (dla zadanej liczby wierszy): (edited) */

public class Problem_17 {
    public static void main(String[] args) {
        printTriangle(10);
    }

    public static void printTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            printDot(rows, i);
            printNum(i + 1);
            printDot(rows, i);
            System.out.println();
        }
    }

    public static void printNum(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(i);
        }
        for (int i = 1; i < count; i++) {
            System.out.print(count - i);
        }
    }

    public static void printDot(int c, int i) {
        for (int j = 0; j < c - i; j++) {
            System.out.print(".");
        }
    }
}