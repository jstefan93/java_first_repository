public class FirstExercise {

    public static void main(String[] args) {

        // 1. 4 zmienne typu int
        // 2. Sprawdź czy suma dwóch pierwszych jest parzysta
        // 3. Sprawdź czy suma dwóch pozostałych jest parzysta
        // 4. Jeżeli dwie sumy są parzyste to wyświetl instrukcję że wszystkie liczby są parzyste

        int firstNumber = 10;
        int secondNumber = 13;
        int thirdNumber = 14;
        int fourthNumber = 5;

        int firstSum = firstNumber + secondNumber;
        int secondSum = thirdNumber + fourthNumber;

        System.out.println(firstSum);
        System.out.println(secondSum);

        if (firstSum % 2 == 0 && secondSum % 2 == 0) {
            System.out.println("Obie sumy są parzyste");
        } else {
            System.out.println("Obie sumy nie są parzyste");
        }
    }
}
