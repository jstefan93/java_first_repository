public class MainApp {

    public static void main(String[] args) {

        // Typ nazwa = nowy obiekt;

        User stefan = new User();
        stefan.firstName = "Stefan";
        stefan.lastName = "Kowalski";
        stefan.email = "stefan.kowalski@test.pl";
        stefan.age = 12;
        stefan.isAdult = true;
        System.out.println(stefan.firstName + " " + stefan.lastName);
        stefan.getFullName();
        stefan.getAllInfo();
        System.out.println(stefan.getUserAge());
        int userAge = stefan.getUserAge();
        System.out.println(userAge);

        stefan.greetings("Judasz");
        stefan.howOldAreYou("Judasz", 12);

        int stefansAgePlus10 = stefan.yourAgePlus10(10);
        System.out.println(stefansAgePlus10);

        boolean userAdult = stefan.isUserAdult();
        System.out.println("czy stefan jest dorosly? " + userAdult);
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
        tomek.getFullName();
        tomek.getAllInfo();

    }

}