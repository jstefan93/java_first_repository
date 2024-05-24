public class Instructions {
    public static void main(String[] args) {
        int numOne = 1;
        int numTwo = 2;

        if (numOne < numTwo) {
            System.out.println("Number one is less than number two");
        } else {
            System.out.println("Number one is greater than number two");
        }
        int numThree = 4;
        int numFour = 3;

        if (numThree < numFour) {
            System.out.println("Number one is less than number two");
        } else {
            System.out.println("Number one is greater than number two");
        }

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = "Settings";

        switch (page) {
            case "Home":
                System.out.println("You are on the home page");
                break;
            case "Login":
                System.out.println("You are on the login page");
                break;
            case "Contact":
                System.out.println("You are on the contact page");
                break;
            default:
                System.out.println("You are on an unknown page");
        }
    }
}
