public class Operators {
    public static void main(String[] args) {
        // Operatory matematyczne
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        // Jeśli dzielimy liczbę całkowitą przez liczbę całkowitą to otrzymamy liczbę całkowitą, aby wynikiem
        // dzielenia byłaby liczba zmiennoprzecinkowa
        // należy dzielić liczby zmiennoprzecinkowe przez liczby zmiennoprzecinkowe np. 10.0 / 10.0
        System.out.println(10.0 / 10.0);
        // Wszystko to możemy uzyskać mając zmienne

        // Operator modulo (reszta z dzielenia)
        System.out.println(10 % 3);

        // Operatory porównania

        int numOne = 1;
        int numTwo = 2;

        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        // zeby sprawdizć czy wartości są różne należy użyc !=
        System.out.println(numOne != numTwo);

        // operatory logiczne
        // || - LUB - ZWRACA CZY KTÓRAKOLWIEK STRONA ZWRACA PRAWDĘ

        System.out.println(numOne > numTwo || numOne == 1);
        System.out.println(numOne > numTwo || numOne != 1);
        System.out.println(numOne < numTwo || numOne != 1); // prawa strona nie jest już sprawdzana,
        // bo z lewej strony jest już true
        // && - I - Zwraca czy po obu stronach jest prawda
        System.out.println(numOne < numTwo && numOne == 1);
        System.out.println(numOne > numTwo && numOne == 1);
        System.out.println(numOne > numTwo && numOne != 1);
    }
}
