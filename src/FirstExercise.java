public class FirstExercise {

    public static void main(String[] args) {

        // 1. 4 zmienne typu int
        // 2. Sprawdź czy suma dwóch pierwszych jest parzysta
        // 3. Sprawdź czy suma dwóch pozostałych jest parzysta
        // 4. Jeżeli dwie sumy są parzyste to wyświetl instrukcję że wszystkie liczby są parzyste

        int a = 11243412;
        int b = 135431234;
        int c = 1235621;
        int d = 12475434;

        int firstSum = a + b;
        int secondSum = c + d;

        System.out.println(firstSum);
        System.out.println(secondSum);

        if (firstSum % 2 == 0 && secondSum % 2 == 0) {
            System.out.println("Obie sumy są parzyste");
        } else {
            System.out.println("Obie sumy nie są parzyste");
        }
    }
}
