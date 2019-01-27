package pl.sda.javastart.day2;

public class Methods2 {
    public static void main(String[] args) {
        String someText = "8.9";
        ApplicationUtils.convertToDouble(someText);
        someText = someText + "  ";
        ApplicationUtils.convertToDouble(someText);
        someText = null;
        ApplicationUtils.convertToDoubleObject(someText);
    }
}
