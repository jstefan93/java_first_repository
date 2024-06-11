public class Strings {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "hello";

        // Porównanie czy stringi są takie same

        str1.equals(str2);
        System.out.println(str1.equals(str2));

        // Porównanie czy tekst jest taki sam niezależnie od wielkości liter

        System.out.println(str1.equalsIgnoreCase(str2));

        // Metoda do zamiany całego stringa na wielkie litery

        String s = str1.toUpperCase();
        System.out.println(s);

        // Metoda do zamiany całego stringa na małe litery

        String s2 = str1.toLowerCase();
        System.out.println(s2);

        // Metoda do sprawdzenia czy string zaczyna się od jakichś liter lub kończy się jakimiś literami

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);

        System.out.println(str1.endsWith("lo"));

        // Metoda do sprawdzenia czy string zawiera jakiś tekst w środku

        System.out.println(str1.contains("ell"));

        // Metoda do sprawdzenia czy string jest pusty

        System.out.println(" ".isBlank());

        System.out.println(" ".isEmpty());

        // te 2 metody róznią się tym, że is blank  ignoruje spacji, a is empty nie ignoruje

        // Metoda do podmiany czegoś w tekście

        String replace = str1.replace("llo", "QWE");
        System.out.println(replace);

        // zamiana wszystkich znaków na ...

        String hexxo = str1.replaceAll("l", "x");
        System.out.println(hexxo);

        // Metoda do wyciągnięcia jakiegoś tekstu z tekstu - ostatni indeks nie jest brany pod uwagę

        String substring = str1.substring(1, 4);
        System.out.println(substring);

        // Metoda do zwracania długości tekstu - ze znakami białymi

        String textWithWhiteSpaces = "        ja lubię sernik       ";
        System.out.println(textWithWhiteSpaces.length());

        // Metoda do zwracania  tekstu - bez znaków białych na początku i końcu

        String strip = textWithWhiteSpaces.strip();
        System.out.println(strip);
        System.out.println(strip.length());

    }


}
