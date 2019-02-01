package pl.sda.javastart.Homework_1;

/* Utwórz metodę, która przyjmuje trzy parametry - tablicę oraz dwie liczby. Metoda ma zwrócić sumę elementów w podanym przedziale.*/

public class Problem_11 {
    public static void main(String[] args) {

        System.out.println(sumFromArray(new int[]{1,2,3,4,5},2,4));
    }
    public static int sumFromArray(int[] arr, int rangeBeginning, int rangeEnd){
        int result = 0;
        for (int i = rangeBeginning; i <= rangeEnd ; i++) {
            result+=arr[i];
        }
        return result;
    }
}