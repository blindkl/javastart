package pl.sda.javastart.day2;

public class IfsExample {
    public static void main(String[] args) {
        System.out.println(isEven(42));
        System.out.println(dividableByThreeandFIve(15));
        System.out.println(introduce("Michał", 30, true));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean dividableByThreeandFIve(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return true;
        }
        return false;
    }

    public static String introduce(String name, int age, boolean male) {
        String gender;
        if (male == true) {
            gender = "mężczyzną";
        } else {
            gender = "kobietą";
        }
        String result = "Cześć, jestem " + name + " i mam " + age + " lat i jestem " + gender;
        return result;
    }

    public static boolean threeParamsSum(int a, int b, int c) { //todo zrobić drugą wersję z jednym ifem
        if ((a + b) == c) {
            return true;
        }
        if (a + c == b) {
            return true;
        }
        if (b + c == a) {
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

}
