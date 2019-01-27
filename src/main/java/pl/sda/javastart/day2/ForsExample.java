package pl.sda.javastart.day2;

public class ForsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Adam");

        }
        printFewNaturalNumbers(5);
        printFewNumbersWithoutDividableByParam(30, 3);
        System.out.println(" Metoda z continue: ");
        printFewNumbersWithoutDividableByParamContinue(10, 2);
        System.out.println(sumNaturalsNumbersToLimit(1000));
        printNumbersInTower(9);
        System.out.println(sumWhile(1000));
        System.out.println(sumDoWhile(1000));
        fibonacci(6);
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

    public static int sumNaturalsNumbersToLimit(int max) {
        int sum = 0;
        for (int i = 0; ; i++) {
            if (sum + i >= max) {
                break;
            }
            sum = sum + i;
        }
        return sum;
    }

    public static void printNumbersInTower(int param) {
        for (int i = 1; i <= param; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
            System.out.println();
        }
    }

    public static int sumWhile(int max) {
        int sum = 0;
        int counter = 0;
        while (sum + counter <= max) {
            sum = sum + (++counter);
        }
        return sum;
    }

    public static int sumDoWhile (int max) {
        int sum = 0;
        int counter = 0;
        do {
            sum = sum + (++counter);
        } while (sum+counter<=max);
        return sum;
    }

    public static void fibonacci (int param) {
        System.out.println("fibonacci");
        int first = 0;
        int second = 1;
        int counter = 1;
        System.out.println("0");
        System.out.println("1");
        while (counter<=param-2) {
            int sum = first + second;
            System.out.println(sum);
            first=second;
            second=sum;
            counter++;
        }
    }

}