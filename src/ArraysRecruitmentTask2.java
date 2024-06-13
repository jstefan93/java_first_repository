public class ArraysRecruitmentTask2 {

    public static void main(String[] args) {

        // policz liczby parzyste i liczby nieparzyste w tablicy


        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Liczby parzyste: " + even);
        System.out.println("Liczby nieparzyste " + odd);
    }

}
