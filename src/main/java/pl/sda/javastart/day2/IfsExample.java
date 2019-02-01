package pl.sda.javastart.day2;

public class IfsExample {
    public static void main(String[] args) {
        System.out.println(isEven(42));
        System.out.println(dividableByThreeAndFive(16));
        System.out.println(introduce(" Michal ", 30, true));
        System.out.println(introduceWithTernary(" Anna ", 20, false));
        System.out.println(answerCell(true, true, false));
        System.out.println(switchCalculator(5, 2, '/'));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else { //w tym miejscu else jest opcjonalny
            return false;
        }
    }

    public static boolean dividableByThreeAndFive(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return true;
        }
        return false;
    }

    public static String introduce(String name, int age, boolean male) {
        String gender;
        if (male) {
            gender = " mezczyzna";
        } else {
            gender = " kobieta";
        }
        return "Czesc, jestem " + name +
                " i mam " + age + " lat i jestem " + gender;
    }

    public static String introduceWithTernary(String name, int age, boolean male) {
        String gender = male ? " mezczyzna " : " kobieta ";
        return "Czesc, jestem " + name +
                " i mam " + age + " lat i jestem " + gender;
    }

    public static boolean threeParamsSum(int a, int b, int c) { //todo zrobic druga wersje z jednym ifem
        if (a + b == c) {
            return true;
        } else if (a + c == b) {
            return true;
        } else if (b + c == a) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean answerCell(boolean mum, boolean isMorning, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && !mum) {
            return false;
        }
        return true;
    }

    public static Double switchCalculator(int a, int b, char sign) {
        switch (sign) {
            case '+':
                return Double.valueOf(a + b); //jedna opcja (nie zapewnia dokładności typu double)
            case '-':
                return Double.valueOf(a - b);
            case '*':
                return (double) a * b; //druga opcja -> rozszerzanie typu a potem autoboxing
            case '/':
                if (b == 0) {
                    System.out.println("Nie dziel cholero przez zero!!!");
                    return null;
                }
                return (double) (a / b);
            default:
                System.out.println("Nie wybrales znaku");
                return null;
        }
    }

    public static boolean isEvenTernary(int a) {
//        return a % 2 == 0 ; //dopuszczalna, krótsza wersja
        boolean result = a % 2 == 0 ? true : false;
        return result;
    }
}