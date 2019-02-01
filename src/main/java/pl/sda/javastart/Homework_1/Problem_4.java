package pl.sda.javastart.Homework_1;

/*Zadeklarujcie pięć zmiennych typu int: minuta, godzina, rok, miesiac, dzien. Przypiszcie im odpowiednie wartości odczytując z zegara systemowego (użyjcie klasy LocalDateTime - my używaliśmy do tej pory tylko Date). Wydrukujcie bieżący czas zgodnie ze schematem: ”12:23 23.11.2017”
Zmodyfikujcie zadanie, aby można było oprócz daty i godziny wyświetlić ile minut minęło od północy. Dla wcześniejszego przykładu z zadania będzie to 743.
Zmodyfikujcie program, tak aby pokazywał ile procent doby już minęło.
Dodajcie wyświetlanie ile sekund zostało do końca doby.*/
import java.time.LocalDateTime;


public class Problem_4 {
    public static void main(String[] args) {
        LocalDateTime ldt =  LocalDateTime.now();

        int minute = ldt.getMinute();
        int hour = ldt.getHour();
        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int day = ldt.getDayOfMonth();
        int minutesFromMidnight = (hour*60)+minute;

        System.out.println(hour + ":" + minute + " " + day + "." + month + "." + year);
        System.out.println("Od północy minęło " + minutesFromMidnight + " minut.");
        System.out.println("Minęło juz: "+String.format("%.2f",(double)(minutesFromMidnight*100)/1440)+" doby.");


    }
}