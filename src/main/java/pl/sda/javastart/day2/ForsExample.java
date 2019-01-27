package pl.sda.javastart.day2;

public class ForsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Adam");

        }
        printFewNaturalNumbers(5);
        printFewNumbersWithoutDividableByParam(30, 3);
        System.out.println(" Metoda z continue: ");
        printFewNumbersWithoutDividableByParamContinue(10,2);
    }

    public static void printFewNaturalNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public static void printFewNumbersWithoutDividableByParam(int max, int param) {
        for (int i = 0; i < max; i++) {
            if (i % param != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printFewNumbersWithoutDividableByParamContinue(int max, int param) {
        for (int i = 0; i < max; i++) {
            if (i % param == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}