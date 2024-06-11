package model;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    public User(String firstNameParam, String lastNameParam, String emailParam, int ageParam) {
        firstName = firstNameParam;
        lastName = lastNameParam;
        email = emailParam;
        age = ageParam;
        isAdult = isUserAdult();

    }
// Gettery i settery


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.endsWith(".ru")) {
            System.out.println(".ru emails are not allowed");
        }
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

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