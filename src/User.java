public class User {
    // z czego składa się klasa?
    // 1. Pola obiektu - opisują z czego składa się dany obiekt

    String firstName;
    String lastName;
    String email;
    int age;
    boolean isAdult;

    // 2. Metody obiektu - opisują jak dany obiekt działa
    // Metoda składa się ze zwracanego typu + nazwa metody + ciało metody w środku {}

    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + email + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }


    // PRZECIĄŻANIE METOD

    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    void greetings(String name, String lastName) {
        System.out.println("Hi " + name + " " + lastName + ". Nice to see you!");
    }

    void howOldAreYou(String name, int age) {
        System.out.println("Hi " + name + ". You are " + age + " years old!");
    }

    int yourAgePlus10(int userAge) {
        return userAge + 10;
    }



}