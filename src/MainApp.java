public class MainApp {

    public static void main(String[] args) {

        // Typ nazwa = nowy obiekt;

        User stefan = new User();
        stefan.firstName = "Stefan";
        stefan.lastName = "Kowalski";
        stefan.email = "stefan.kowalski@test.pl";
        stefan.age = 30;
        stefan.isAdult = true;
        System.out.println(stefan.firstName);

        User tomek = new User();
        System.out.println(tomek.email);
        tomek.firstName = "Tomek";
        tomek.lastName = "Marczuk";
        tomek.email = "tomek.marzuk@test.pl";
        tomek.age = 25;
        tomek.isAdult = true;
        System.out.println(tomek.firstName);
        System.out.println(tomek.lastName);
        System.out.println(tomek.email);
        System.out.println(tomek.age);
        System.out.println(tomek.isAdult);
    }

}