public class ArraysRecruitmentTask4 {

    public static void main(String[] args) {
        // chcemy tablicę, w której liczby będa posortowane malejąco

        int [] numbers = {2, 4, 5, 6, 8, 1, 0, 5, 1, 9, 8};

        int max;

        for (int i = 0; i < numbers.length; i++) {
            max = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] > max) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }

        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}


