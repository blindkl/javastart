package pl.sda.javastart.Homework_1;


import java.math.BigDecimal;
import java.math.RoundingMode;

/*Napiszcie metody użytkowe:
>* sprawdzanie czy podany String jest pusty albo nullowy -> `boolean`
>* zamiana `String` na `BigDecimal` z zaokrąglaniem do trzech miejsc po przecinku (od połowy w górę)
>* zamiana podanej temperatury w stopniach `Celsiusza` na `Fahrenheita`
>* zamiana podanej temperatury w stopniach `Fahrenheita` na `Celsiusza`
>* zamiana podanej prędkości `km/h` (kilometrów na godzinę) na `mph` (mil na godzinę)
>* zamiana podanej prędkości `km/h` (kilometrów na godzinę) na `m/s` (metrów na sekundę)
>* zamiana podanej liczby minut na liczbę **pełnych** kwadransów (np. `45 -> 3`, `59 -> 3`)
>* DODAJCIE CO NAJMNIEJ TRZY **WŁASNE** METODY PRZELICZAJĄCE WARTOŚCI
    1. dec to bin -- DONE
    2. bin to dec
    3. MB to GB*/
public class Problem_6 {
    public static void main(String[] args) {

    }

    public static boolean isStringIsEmpty(String s) {
        if (s == null) {
            return true;
        }

        if (s.equals("")) {
            return true;
        }
        return false;
    }

    public static BigDecimal convertStringToBigDecimal(String s) {
        BigDecimal result = new BigDecimal(s);
        return result.setScale(3, RoundingMode.HALF_UP);
    }

    public static double celsiusToFahrenheit(double temp) {
        return Math.round((temp * 1.8) + 32);
    }

    public static double fahrenheitToCelsius(double temp) {
        return Math.round((temp - 32) / 1.8);
    }

    public static double kmphToMph(double km) {
        return Math.round(km * 0.62137);
    }

    public static double kmphTometersPerSecond(double km) {
        return Math.round(km * 0.28);
    }

    public static int minuterToQuaters(int minutes) {
        return minutes / 15;
    }

    public static String decimalToBinary(int dec) {
        String sTmp = "";
        int tmp = dec;
        String res = "";
        while (tmp > 0) {
            sTmp = sTmp + tmp % 2;
            tmp = tmp / 2;
        }
        for (int i = sTmp.length() - 1; i >= 0; i--) {
            res = res + sTmp.charAt(i);
        }
        return res;
    }

    public static int binaryToDecimal(String bin) {
        int[] tArr = new int[bin.length()];
        for (int i = 0; i < tArr.length; i++) {
            tArr[i] = Character.getNumericValue(bin.charAt(i));
        }
        int tmp = 0;
        int tPow = 0;
        for (int i = tArr.length - 1; i >= 0; i--) {
            tmp = tmp + ((int) Math.pow(2, tPow++) * tArr[i]);
        }
        return tmp;
    }

    public static int kilowattsToHorsepower(int kw){
        return (int) (kw*1.34);
    }
}