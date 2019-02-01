package pl.sda.javastart.Homework_1;

/* caughtSpeeding - jechaliśmy samochodem trochę za szybko i załapała nas policja przy ograniczeniu do 50km/h, należy napisać program który zwróci wartość
 mandatu: 100zł, 200zł lub 300zł - w zależności od tego jak zareaguje policjant. W przypadku przekroczenia prędkości w zakresie do 10km/h będzie to 100zł (51-60),
  w przypadku przekroczenia prędkości o 10-20km/h będzie to 200zł (60-69) i analogicznie o 20 w górę to będzie 300zł.
  Jedynym wyjątkiem jest kiedy akurat policjant ma dobry humor, wtedy jest łagodniejszy i reaguje tak jakbyśmy jechali 5km/h mniej.
   (należy użyć zagnieżdżonych if else; humor policjanta i prędkość należy przekazać w argumentach)*/

public class Problem_9 {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(90, true));
    }

    public static int caughtSpeeding(int speed, boolean goodPolicemanMood) {
        if (goodPolicemanMood && speed > 55) {
            if (speed >= 56 && speed <= 65) {
                return 100;
            } else if (speed >= 66 && speed <= 75) {
                return 200;
            } else if (speed >= 76) {
                return 300;
            }
        } else if (speed > 50 && !goodPolicemanMood) {
            if (speed >= 51 && speed <= 60) {
                return 100;
            } else if (speed >= 61 && speed <= 70) {
                return 200;
            } else if (speed >= 71) {
                return 300;
            }
        } else {
            return 0;
        }
        return 0;
    }
}