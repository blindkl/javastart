package pl.sda.javastart.Homework_1;

//Utwórz metodę, która przyjmuje 4 parametry i zwraca wynik wynik równania: `a^(x) + b^(x+1) + c^(x+2)`. Gdzie `a`, `b`, `c` to pierwsze trzy parametry, a `x` jest czwartym parametrem.
public class Problem_5{
    public static void main(String[] args) {
        System.out.println(equation(10, 11, 12, 1));
    }
    public static double equation(int a, int b, int c, int x){
        return (Math.pow(a,x)+Math.pow(b,x+1)+Math.pow(c,x+2));
    }
}