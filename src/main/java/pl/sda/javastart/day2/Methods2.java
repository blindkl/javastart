package pl.sda.javastart.day2;

public class Methods2 {
    public static void main(String[] args) {
        String someText = "8.9";
        System.out.println(ApplicationUtils.convertToDouble(someText));
        someText = someText + "   ";
        System.out.println(ApplicationUtils.convertToDouble(someText));
        someText = null;
        System.out.println(ApplicationUtils.convertToDoubleObject(someText));
    }
}