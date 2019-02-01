package pl.sda.javastart.Homework_1;

/*14. Utwórz metodę przyjmującą parametr z liczbą wierszy i wypisującą liczby w ten sposób:
    1
   12
  123  */

public class Problem_14 {
    public static void main(String[] args) {
        printTriangle(9);
    }

    public static void printTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i-1; j++) {
                System.out.print(" ");
            }
            printNum(i + 1);
            System.out.println();
        }
    }

    public static void printNum(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(i);
        }
    }
}