package pl.sda.javastart;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello World!");

        Date date = new Date ();
        System.out.println(date);

        System.out.println("\"ADAM\"");
        // komentarz może być też tutaj
        System.out.println("Adam \n Nowak"); // tu będzie nowa linia
        // literały
        System.out.println(13);
        System.out.println('k');
        System.out.println("napis");
        System.out.println(false);

        String text = "Tekst w cudzysłowiu";
        String anotherText = new String("inny tekst");
        // jak poznać długość
        int length = text.length(); //pierwszy sposób
        System.out.println(length);
        System.out.println(text.length()); // drugi sposób

        String textWithWhitespaces = " Adam";
        System.out.println(textWithWhitespaces.trim());
        System.out.println("\"a\"+2= "+("a"+2));
        System.out.println('a'+4+"b");
        System.out.println("a"+4+'b');

        System.out.println(3==3&&3==4);
        System.out.println(3!=5||3==5);
        System.out.println("(2+4)>(1+3):" + ((2+4)>(1+3)));
        System.out.println("cos".equals("cos")); // obiekty powinniśmy porównywać za pomocą .equals()
        System.out.println("cos"=="cos"); // nigdy nie porównujemy obiektów za pomocą ==
        System.out.println("cos" == new String("cos"));



    }
}
