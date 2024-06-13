public class ArraysRecruitmentTask3 {

    public static void main(String[] args) {
        // chcemy tablicę, w której liczby będa posortowane rosnąco i malejąco później też

        int [] numbers = {2, 4, 5, 6, 8, 1, 0, 5, 1, 9, 8};

        int min;

        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < min ) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }

        }
        for (int number : numbers) {
            System.out.println(number);
        }

    }
        
}

