package pl.sda.javastart.day2;

public class ApplicationUtils {
    public static double convertToDouble(String text) {
        return Double.parseDouble(text);
    }

    public static Double convertToDoubleObject(String text) {
        if (text==null){
            return null;
        }else {
            return Double.valueOf(text);
        }
    }
}