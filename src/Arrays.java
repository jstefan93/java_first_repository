public class Arrays {

    public static void main(String[] args) {

        // 1. Tablica zbiór danych tego samego typu
        // 2. żeby utworzyć tablicę zawsze musimy określić jej rozmiar
        // 3. [] - tablica

        // Deklarowanie tablicy


        String[] names = new String[5];

        // przypisanie wartości do tablicy

        names[0] = "Jan";
        names[1] = "Adam";
        names[2] = "Kasia";
        names[3] = "Marek";
        names[4] = "Ania";


        // wyświetlanie zawrtości tablic / poszczególnych elementów w tablicy

//        System.out.println(names);
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);

        // PĘTLA  FOR

//        for (licznik; warunek który musi być spełniony, żeby pętla się nadal wykonwyała; zmiana licznika)

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // PĘTLA FOREACH

        for (String name : names) {
            System.out.println(name);
        }

        int [] numbers = new int [10];

        System.out.println("Długość tablicy: " + numbers.length);

        // inny sposób tworzenia tablic

        int [] newNumbers = {1, 2, 3, 4, 5};

        System.out.println(newNumbers[2]);

        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
            
        }
}



