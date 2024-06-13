public class ArraysRecruitmentTask1 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // odwróć w tablicy kolejność tak, żeby zamienić pierwszy element z tablicy na ostatni


//        int first = numbers[0];
//        int last = numbers[numbers.length - 1];
//
//        numbers[0] = last;
//        numbers[numbers.length - 1] = first;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        // jak to zrobić używając jednej zmiennej?

//        int first = numbers[0];
//
//        numbers[0] = numbers[numbers.length - 1];
//        numbers[numbers.length - 1] = first;
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        // jak to zrobić w ogóle bez zmiennych?

        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];

        numbers[0] = numbers[numbers.length - 1] - numbers[0];

        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];


        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
